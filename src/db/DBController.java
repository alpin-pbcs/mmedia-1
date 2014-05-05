package db;
/**
 * Created by Sebastian on 05.05.14.
 */

    import java.sql.*;
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

    public void/*ArrayList*/ selectKunde(){
        try {
            //Arraylist ar = new ArrayList();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Kunde JOIN Adresse ON Kunde.FK_Adressnummer = Adresse.Adressnummer;");
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(8));
                System.out.println(rs.getString(9));
                System.out.println(rs.getString(10));
                System.out.println(rs.getString(11));
                // einfügen in die Objekte
                // Index 6 und 7 nicht wählbar
            }
            rs.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Couldn't handle DB-Query: Kunde");
            e.printStackTrace();
        }
        //return ar;
    }



    public void/*ArrayList*/ selectAufArt(){
        try {
            //Arraylist ar = new ArrayList();
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM AufArt;");
            while (rs.next()) {
                // einfügen in die Objekte
            }
            rs.close();
            connection.close();
        } catch (SQLException e) {
            System.err.println("Couldn't handle DB-Query: AufArt");
            e.printStackTrace();
        }
        //return ar;
    }

    public void writeArtikel (){
        try {
            //Statement stmt = connection.createStatement();
            PreparedStatement ps = connection
                    .prepareStatement("INSERT OR REPLACE INTO Artikel VALUES (?, ?, ?, ?, ?);");
            //Schleife über alle Artikel in die DB

                ps.setInt(1,        /*artikelnummer*/);
                ps.setString(2, ""  /*bezeichnung*/);
                ps.setInt(3,        /*lieferstatus*/);
                ps.setFloat(4,      /*preis*/);
                ps.addBatch();

                connection.setAutoCommit(false);
                ps.executeBatch();
                connection.setAutoCommit(true);
        } catch (SQLException e) {
            System.err.println("Couldn't Write DB-Query");
            e.printStackTrace();
        }
    }

    public void writeKunde (){
        try {
            //Statement stmt = connection.createStatement();
            PreparedStatement ps = connection
                    .prepareStatement("INSERT OR REPLACE INTO Kunde VALUES (?, ?, ?, ?, ?);");
            PreparedStatement ps2 = connection
                    .prepareStatement("INSERT OR REPLACE INTO Adresse VALUES (?, ?, ?, ?, ?);");
            //Schleife über alle Artikel in die DB

           /* ps.setInt(1,        artikelnummer);
            ps.setString(2, ""  bezeichnung);
            ps.setInt(3,        lieferstatus);
            ps.setFloat(4,      preis);
            ps.addBatch();
                */
            connection.setAutoCommit(false);
            ps.executeBatch();
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            System.err.println("Couldn't Write DB-Query");
            e.printStackTrace();
        }
    }





}
