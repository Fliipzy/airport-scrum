package dat18c.airport_app;

import dat18c.airport_app.db.DatabaseConnection;
<<<<<<< HEAD
=======
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.model.ServiceSelskab;
import dat18c.airport_app.repositories.ServiceSelskabRepo;
>>>>>>> 9585765ecab4ca37419a29224bc17f0c6aee8f93

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
<<<<<<< HEAD
        try 
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
        }
        
=======
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
        System.out.println("WINNER WINNER CHICKEN DINNER!");

        ServiceSelskabRepo serviceSelskabRepo = new ServiceSelskabRepo(dbConnection);

        serviceSelskabRepo.fetchAll();

>>>>>>> 9585765ecab4ca37419a29224bc17f0c6aee8f93
    }

}
