package dat18c.airport_app;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.model.ServiceSelskab;
import dat18c.airport_app.repositories.ServiceSelskabRepo;


/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {


        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
        System.out.println("WINNER WINNER CHICKEN DINNER!");

        ServiceSelskabRepo serviceSelskabRepo = new ServiceSelskabRepo(dbConnection);

        serviceSelskabRepo.showAll();
        serviceSelskabRepo.insert();


    }

}
