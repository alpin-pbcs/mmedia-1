package db;

/**
 * Created by Sebastian on 05.05.14.
 */
public class Start{



    public static void main(String[] args){
        DBController dbc = DBController.getInstance();
        dbc.getInstance().initDBConnection();
        dbc.getInstance().selectKunde();
        //dbc.getInstance().closeDBConnection();

    }
}
