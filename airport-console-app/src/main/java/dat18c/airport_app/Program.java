package dat18c.airport_app;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.models.Airline;
import dat18c.airport_app.repositories.AirlineRepository;
import dat18c.airport_app.repositories.AirportServiceCompanyRepository;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.models.Arrival;
import dat18c.airport_app.repositories.ArrivalRepository;

/**
 * Hello world!
 */
public class Program 
{
    public static void main(String[] args) 
    {
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

        //Display Menu


        Scanner sc = new Scanner(System.in);

        //Getting user input
        */

        printMenu();
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
}
