package db;

/**
 * Created by Sebastian on 05.05.14.
 */
public class Start{



    public void Main(){
        DBController dbc = DBController.getInstance();
        dbc.initDBConnection();
    }
}
