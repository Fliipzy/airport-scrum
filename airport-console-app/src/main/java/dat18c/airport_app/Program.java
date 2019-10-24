package dat18c.airport_app;

import java.sql.SQLException;
import java.util.List;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.repositories.AirplaneParkingSpotRepository;

import dat18c.airport_app.services.StandpladsService;

/**
 * Hello world!
 */

public class Program 
{
    public static void main(String[] args) throws SQLException {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        StandpladsService standpladsService = new StandpladsService(dbConnection);
        AirplaneParkingSpotRepository repo         = new AirplaneParkingSpotRepository(dbConnection);
        List<AirplaneParkingSpot>     parkingSpots = repo.fetchAll();

        for (AirplaneParkingSpot a : parkingSpots)
        {
            System.out.println("Number:\t" + a.getNumber() + ", IsOccupied:\t" + a.isOccupied()
                    + ", Size:\t" + a.getSize().toString());
        }

//        standpladsService.movePlane();


/*

public class Program {
    public static void main(String[] args) {

        ICommand command = new ICommand() {

            @Override
            public void execute() {
                System.out.println("hello!");
            }
        };

        Timer timer = new Timer(1000, command, true);
        timer.start();

        try 
        {
            Thread.sleep(4000);
        } 
        catch (InterruptedException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        timer.stopTimer();

        /*

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
*/
        //Display Menu
/*

        Scanner sc = new Scanner(System.in);

        //Getting user input


        printMenu();
    }

    }

    private static void printMenu()
    {
        System.out.println("1\t Flight information");
        System.out.println("2\t Arrivals and Depatures");
        System.out.println("3\t Airplane Service");
        System.out.println("4\t Apron");
        System.out.println("5\t Show Airline ");
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
 */

            }
   
        

    }
