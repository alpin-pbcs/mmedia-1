package db;
/**
 * Created by Sebastian on 05.05.14.
 */

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;

class DBController {

        private static final DBController dbcontroller = new DBController();
        private static Connection connection;
        private static final String DB_PATH = "C:/Users/Sebastian/IdeaProjects/datenbank/Bestellversandshop.db3";
                                             //System.getProperty("user.home") + "/" + "testdb.db";
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

        public void initDBConnection() {
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

        public void /*ArrayList*/ selectArtikel(){
             try {
                  //Arraylist ar = new ArrayList();
                  Statement stmt = connection.createStatement();
                  ResultSet rs = stmt.executeQuery("SELECT * FROM Artikel;");
                    while (rs.next()) {
                        System.out.println(rs.getString(1));
                        System.out.println(rs.getString(2));
                        System.out.println(rs.getString(3));
                        System.out.println(rs.getString(4));
                        // einfügen in die Objekte
                  }
                  rs.close();
                  connection.close();
             } catch (SQLException e) {
             System.err.println("Couldn't handle DB-Query: Artikel");
             e.printStackTrace();
             }
           //  return ar;
        }

    public void/*ArrayList*/ selectAuftrag(){
        try {
            //Arraylist ar = new ArrayList();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Auftrag;");
            while (rs.next()) {
                // einfügen in die Objekte
            }
            rs.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Couldn't handle DB-Query: Auftrag");
            e.printStackTrace();
        }
        //return ar;
    }











        public void handleDB() {
            try {
                Statement stmt = connection.createStatement();
               /* stmt.executeUpdate("DROP TABLE IF EXISTS books;");
                stmt.executeUpdate("CREATE TABLE books (author, title, publication, pages, price);");
                stmt.execute("INSERT INTO books (author, title, publication, pages, price) VALUES ('Paulchen Paule', 'Paul der Penner', '2001-05-06', '1234', '5.67')");

                PreparedStatement ps = connection
                        .prepareStatement("INSERT INTO books VALUES (?, ?, ?, ?, ?);");

                ps.setString(1, "Willi Winzig");
                ps.setString(2, "Willi's Wille");
                ps.setDate(3, Date.valueOf("2011-05-16"));
                ps.setInt(4, 432);
                ps.setDouble(5, 32.95);
                ps.addBatch();

                ps.setString(1, "Anton Antonius");
                ps.setString(2, "Anton's Alarm");
                ps.setDate(3, Date.valueOf("2009-10-01"));
                ps.setInt(4, 123);
                ps.setDouble(5, 98.76);
                ps.addBatch();

                connection.setAutoCommit(false);
                ps.executeBatch();
                connection.setAutoCommit(true);*/

                ResultSet rs = stmt.executeQuery("SELECT * FROM Lieferstatus;");
                while (rs.next()) {
                    System.out.println("Status_ID = " + rs.getString("Status_ID"));
                    System.out.println("Bezeichnung = " + rs.getString("Bezeichnung"));

                }
                rs.close();
                connection.close();
            } catch (SQLException e) {
                System.err.println("Couldn't handle DB-Query");
                e.printStackTrace();
            }
        }


}
