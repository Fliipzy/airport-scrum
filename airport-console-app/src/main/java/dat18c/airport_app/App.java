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

        /*try
        {
            var dbConnection = DatabaseConnection.getInstance();
            dbConnection.connect();
            var statement = dbConnection.getConnection().createStatement();
            var resultSet = statement.executeQuery("SELECT * FROM flyselskab");

            int i = 0;
            if (resultSet.next()) 
            {
                System.out.println(resultSet.getString(2));
            }
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
            //TODO: handle exception
        }*/
        

        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
        System.out.println("WINNER WINNER CHICKEN DINNER!");

        ServiceSelskabRepo serviceSelskabRepo = new ServiceSelskabRepo(dbConnection);

        serviceSelskabRepo.showServiceSelskab();


    }

}
