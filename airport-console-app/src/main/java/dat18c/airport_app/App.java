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
<<<<<<< HEAD

=======
        
>>>>>>> cd26369cd0068b7003f236291726677bd1ab6f55

        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
        System.out.println("WINNER WINNER CHICKEN DINNER!");

        ServiceSelskabRepo serviceSelskabRepo = new ServiceSelskabRepo(dbConnection);

        serviceSelskabRepo.insert();


    }

}
