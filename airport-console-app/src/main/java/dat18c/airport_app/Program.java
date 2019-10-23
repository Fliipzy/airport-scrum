package dat18c.airport_app;

import java.util.List;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.repositories.AirplaneParkingSpotRepository;

/**
 * Hello world!
 */
public class Program 
{
    public static void main(String[] args) 
    {
        try 
        {
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            dbConnection.connect();
            
            AirplaneParkingSpotRepository repo = new AirplaneParkingSpotRepository(dbConnection);
            List<AirplaneParkingSpot> parkingSpots = repo.fetchAll();

            for (AirplaneParkingSpot a : parkingSpots) 
            {
                System.out.println("Number:\t" + a.getNumber() + ", IsOccupied:\t" + a.isOccupied()
                + ", Size:\t" + a.getSize().toString());    
            }
            
        } catch (Exception e) 
        {

        }
    }

    private static void printMenu()
    {
        System.out.println("1\t Flight information");
        System.out.println("2\t Arrivals and Depatures");
        System.out.println("3\t Airplane Service");
        System.out.println("4\t Apron");
        System.out.println("5\t ");
        System.out.println("Please enter your choice");
    }

    private static int getInt()
    {
        while (true) 
        {
            try 
            {
                return Integer.parseInt(System.console().readLine());    
            } 
            catch (NumberFormatException e) 
            {
                
            }
        }
    }
}
