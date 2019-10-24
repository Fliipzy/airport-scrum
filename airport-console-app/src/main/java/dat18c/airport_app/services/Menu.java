package dat18c.airport_app.services;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.repositories.AirlineRepository;
import dat18c.airport_app.repositories.AirplaneParkingSpotRepository;
import dat18c.airport_app.repositories.AirportServiceCompanyRepository;
import dat18c.airport_app.repositories.DepartureRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    static AirportServiceCompanyRepository airportServiceCompanyRepository;
    static AirlineRepository airlineRepository;
    static DepartureRepository departureRepository;
    static AirplaneParkingSpotRepository airplaneParkingSpotRepository;
    

    public void printMenu() throws SQLException {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        airportServiceCompanyRepository = new AirportServiceCompanyRepository(dbConnection);
        airlineRepository = new AirlineRepository(dbConnection);
        departureRepository = new DepartureRepository(dbConnection);
        airplaneParkingSpotRepository = new AirplaneParkingSpotRepository(dbConnection);


        System.out.println("1\t Service for airplanes");
        System.out.println("2\t Airlines");
        System.out.println("3\t Departures");
        System.out.println("4\t Show Parking spot");
        System.out.println("5\t --------- ");
        System.out.println("Please enter your choice");


        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int valg = sc.nextInt();

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Service for airplanes");

                if (valg == 1) {
                    System.out.println("Add Flight information ");
                    airportServiceCompanyRepository.insert();


                }
                if (valg == 2) {

                    System.out.println("Delete service");

                    airportServiceCompanyRepository.deleteServiceSelskab();

                    if (valg == 3) {

                        System.out.println("Update service");
                        airportServiceCompanyRepository.updateServiceTable();
                    }

                    if (valg == 4) ;
                    {
                        System.out.println("Show all service");
                        airportServiceCompanyRepository.fetchAll();
                    }

                }

            case 2:
                System.out.println("Airline's");

                if (valg == 1) {
                    System.out.println("insert a new Airline");
                    airlineRepository.create();

                }
                if (valg == 2) {
                    System.out.println("Update Airlines");
                    airlineRepository.updateAirlineTable();
                }
                if (valg == 3) {
                    System.out.println("Delte Airline");
                    airlineRepository.updateAirlineTable();
                }


            case 3:
                System.out.println("Departues");
                if (valg == 1) {
                    System.out.println("Show all departures");
                    departureRepository.fetchAll();
                }

            case 4:
                System.out.println("Show airport parking spot");
            {
                airplaneParkingSpotRepository.fetchAll();
            }

            case 5:

        }

    }

}
