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

        while (true) 
        {
            
            System.out.println("Want to see airplane parking spots?");
            System.console().readLine();
            
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
                
            } 
            catch (Exception e) 
            {
            }
            
            System.out.println("Are you finished looking?");
            System.console().readLine();
            
            try 
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } 
            catch (Exception e) 
            {
            }
            
        }

/**
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
 */
    }
}
