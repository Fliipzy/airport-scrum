package dat18c.airport_app;

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
