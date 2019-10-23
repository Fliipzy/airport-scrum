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


        /*
        Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        AirportServiceCompanyRepository airportService = new AirportServiceCompanyRepository(dbConnection);
        AirlineRepository airlineRepository = new AirlineRepository(dbConnection);

        //airlineRepository.create();
        //airlineRepository.deleteairLineInfo();

        while (true) 
        {
            printMenu();
            int choice = getInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Flight Information");
                case 2:
                    System.out.println("Arrivals and Depatures");
                case 3:
                    System.out.println("Airplane Service");
                case 4:
                    System.out.println("Apron");
                case 5:
                    System.out.println("----");
            }
        }
>>>>>>> 643991218b2e023b6560eb0667e5877d566abab9

        //Display Menu


        Scanner sc = new Scanner(System.in);
=======
        //Getting user input
        */
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
