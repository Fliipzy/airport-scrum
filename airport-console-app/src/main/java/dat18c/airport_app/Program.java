package dat18c.airport_app;


import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.db.interfaces.IDatabaseConnection;
import dat18c.airport_app.repositories.AirportServiceCompanyRepository;

import java.sql.SQLException;

import java.util.Scanner;


/**
 * Hello world!
 */
public class Program 
{

    public static void main(String[] args) throws SQLException {
        IDatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        AirportServiceCompanyRepository airportService = new AirportServiceCompanyRepository(dbConnection);

        airportService.insert();


        Scanner sc = new Scanner(System.in);

        //Display Menu
        System.out.println("1\t Flight information");
        System.out.println("2\t Arrivals and Depatures");
        System.out.println("3\t Airplane Service");
        System.out.println("4\t Apron");
        System.out.println("5\t Show airport status  - Apron");
        System.out.println("8\t Exit");

        System.out.println("Please enter your choice");

        //Getting user input
        int choice= sc.nextInt();


        switch (choice){
            case 1:
                System.out.println("Flight Information");
            case 2:
                System.out.println("Arrivals and Depatures");
            case 3:
                System.out.println("Airplane Service");
            case 4:
                System.out.println("Apron");
            case 5:
                System.out.println("Show airport status  - Apron");

            case 8:
                break;
        }
    }
}
