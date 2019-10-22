package dat18c.airport_app;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
        System.out.println("WINNER WINNER CHICKEN DINNER!");
    }
}
