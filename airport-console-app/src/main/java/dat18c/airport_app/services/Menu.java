package dat18c.airport_app.services;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.models.*;
import dat18c.airport_app.repositories.*;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu 
{
    static AirportServiceCompanyRepository airportServiceCompanyRepository;
    static AirlineRepository airlineRepository;
    static DepartureRepository departureRepository;
    static AirplaneParkingSpotRepository airplaneParkingSpotRepository;
    static ArrivalRepository arrivalrepository;
    static AirplaneRepository airplaneRepository;


    public void printMenu() throws SQLException 
    {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        airportServiceCompanyRepository = new AirportServiceCompanyRepository(dbConnection);
        airlineRepository               = new AirlineRepository(dbConnection);
        departureRepository             = new DepartureRepository(dbConnection);
        airplaneParkingSpotRepository   = new AirplaneParkingSpotRepository(dbConnection);
        arrivalrepository               = new ArrivalRepository(dbConnection);
        airplaneRepository              = new AirplaneRepository(dbConnection);

        System.out.println("1\t Service for airplanes");
        System.out.println("2\t Airlines");
        System.out.println("3\t Departures");
        System.out.println("4\t Show Parking spot");
        System.out.println("5\t Arrival ");
        System.out.println("6\t Airplane ");
        System.out.println("9\t Exit Program ");
        System.out.println("Please enter your choice");


        Scanner sc = new Scanner(System.in);
        int valg;

        try 
        {
            switch (sc.nextInt()) 
            {
                case 1:
                    System.out.println("Service for airplanes:\n");
                    System.out.println("1. Add Flight information");
                    System.out.println("2. Delete service");
                    System.out.println("3. Update Service");
                    System.out.println("4. Show all Services");
                    System.out.println("5. Return to Main Menu");
                    valg = sc.nextInt();
                    if (valg == 1) 
                    {
                        System.out.println("Add Flight information ");
                        airportServiceCompanyRepository.insert();

                    }
                    if (valg == 2) 
                    {

                        System.out.println("Delete service");

                        airportServiceCompanyRepository.deleteServiceSelskab();
                    }

                    if (valg == 3) 
                    {

                        System.out.println("Update service");
                        airportServiceCompanyRepository.updateServiceTable();
                    }

                    if (valg == 4)
                    {
                        System.out.println("1. Fuel Plane");
                        System.out.println("2. Clean Plane");
                        System.out.println("3. Return to Menu");
                        valg = sc.nextInt();

                        if (valg == 1) {
                            System.out.println("Fueling Plane... \n");

                            //TODO FUEL PLANE

                        }
                        if(valg == 2) {
                            System.out.println("Cleaning Plane ...\n");
                        }

                        if(valg == 3) {
                            printMenu();
                        }

                        //TODO FIX FETCH ALL
                        //airportServiceCompanyRepository.fetchAll();
                    }
                    if (valg == 5) {
                        printMenu();
                    }
                    break;

                case 2:
                    System.out.println("1. Show all Airlines");
                    System.out.println("2. Update Airlines");
                    System.out.println("3. Delete Airlines");
                    System.out.println("4. Insert a new Airline");
                    System.out.println("5. Return to Menu");

                        valg = sc.nextInt();
                    if (valg == 1)
                    {
                        List<Airline> airlines = airlineRepository.fetchAll();

                        for (Airline a: airlines){

                            System.out.println("Airline\t" + a.getName()+ "\n");
                        }

                    }

                    if (valg == 2) 
                    {
                        System.out.println("Update Airlines");
                        airlineRepository.updateAirlineTable();
                    }
                    if (valg == 3) 
                    {
                        System.out.println("Delete Airlines");
                        airlineRepository.deleteairLineInfo();
                    }
                    if (valg == 4)
                    {
                        System.out.println("insert a new Airline");
                        airlineRepository.create();

                    }

                    if (valg == 5) {
                        printMenu();
                    }
                    break;

                case 3:

                    System.out.println("Departures");
                    System.out.println("1. Show all departures");
                    System.out.println("2. Return to Menu");
                    valg = sc.nextInt();
                    if (valg == 1) 
                    {

                        List<Departure> departureRepositories = departureRepository.fetchAll();

                        for (Departure d : departureRepositories) 
                        {
                            System.out.println("Airplane\t" + d.toString() + ", To Country\t" + d.toCountry() + ", Departure time\t" + d.getDepartureDate() + "  " +  d.getDepartureTime());

                        }
                    }
                    if (valg == 2) {
                        printMenu();
                    }

                case 4:
                    System.out.println("Show airport parking spot");
                    System.out.println("1. Show parking spots");
                    System.out.println("2. Move Plane to a new parking spot");
                    System.out.println("3. Return to Menu");
                    valg = sc.nextInt();

                    if (valg == 1) 
                    {
                        List<AirplaneParkingSpot> parkingSpots = airplaneParkingSpotRepository.fetchAll();

                        for (AirplaneParkingSpot a : parkingSpots) 
                        {
                            System.out.println("Number:\t" + a.getNumber() + ", IsOccupied:\t" + a.isOccupied()
                                    + ", Size:\t" + a.getSize().toString());

                        }
                    }
                        if (valg == 2) 
                        {
                            System.out.println("Move plane");

                            StandpladsService standpladsService = new StandpladsService(dbConnection);
                            standpladsService.movePlane();
                        }
                        if(valg == 3) {
                            printMenu();
                        }
                        break;

                case 5:
                    System.out.println("Arrival");
                    System.out.println("1. See all the Arriavls");
                    System.out.println("2. Return to Menu");
                    valg = sc.nextInt();

                    if (valg == 1) 
                    {
                        List<Arrival> arrivalList = arrivalrepository.fetchAll();

                        for (Arrival a : arrivalList) 
                        {
                            System.out.println("Airplane:\t" + a.toString() + "From Country:\t" + a.getFromCountry() + "Arrival Date\t" + a.getArrivalDate() + " " + a.getArrivalTime());
                        }
                        break;
                    }
                    if (valg == 2) {
                        printMenu();
                    }
                case 6:
                    System.out.println("1. Show all Airplanes");
                    System.out.println("2. Update Airplane");
                    System.out.println("3. Delete Airplane");
                    System.out.println("4. Return to Menu");
                    valg = sc.nextInt();

                    if (valg == 1) 
                    {
                        List<Airplane> airplanes = airplaneRepository.fetchAll();

                        for (Airplane a : airplanes) 
                        {
                            System.out.println("Name: " + a.getName() + "\tSize: " + a.getSize());
                        }
                    }

                    if (valg == 2) {
                        airplaneRepository.updateAirplaneInfo();
                    }

                    if (valg == 3) {
                        System.out.println("Type Plane ID in order to delete it from the DB: ");
                        sc.nextInt();

                        airplaneRepository.deleteAirplaneInfo();
                        System.out.println("Airplane Deleted");
                    }
                    if (valg == 4) {
                        printMenu();
                    }

                    break;


                case 9:
                    System.out.println("EXIT");
                    System.exit(0);
                default:
                    System.out.println("Invalid input!");
                    printMenu();
            }
            printMenu();
        } 
        catch (InputMismatchException e) 
        {
           // e.printStackTrace();
            System.out.println("Input must be a number. Try again: \n");
            printMenu();
        }

    }

}
