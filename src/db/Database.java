package db;

/**
 * Created by Sebastian on 05.05.14.
 */
public class Database {

    import java.sql.Connection;
    import java.sql.Date;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;

    class DBController {

        private static final DBController dbcontroller = new DBController();
        private static Connection connection;
        private static final String DB_PATH = System.getProperty("user.home") + "/" + "testdb.db";

        static {
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException e) {
                System.err.println("Fehler beim Laden des JDBC-Treibers");
                e.printStackTrace();
            }
        }

        private DBController(){
        }

        public static DBController getInstance(){
            return dbcontroller;
        }

        private void initDBConnection() {
            try {
                if (connection != null)
                    return;
                System.out.println("Creating Connection to Database...");
                connection = DriverManager.getConnection("jdbc:sqlite:" + DB_PATH);
                if (!connection.isClosed())
                    System.out.println("...Connection established");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                    try {
                        if (!connection.isClosed() && connection != null) {
                            connection.close();
                            if (connection.isClosed())
                                System.out.println("Connection to Database closed");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            });
        }


}
