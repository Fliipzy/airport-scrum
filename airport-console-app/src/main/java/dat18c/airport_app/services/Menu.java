package dat18c.airport_app.services;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.models.Airplane;
import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.models.Arrival;
import dat18c.airport_app.models.Departure;
import dat18c.airport_app.repositories.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static AirportServiceCompanyRepository airportServiceCompanyRepository;
    static AirlineRepository airlineRepository;
    static DepartureRepository departureRepository;
    static AirplaneParkingSpotRepository airplaneParkingSpotRepository;
    static ArrivalRepository arrivalrepository;
    static AirplaneRepository airplaneRepository;


    public void printMenu() throws SQLException {
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();

        airportServiceCompanyRepository = new AirportServiceCompanyRepository(dbConnection);
        airlineRepository = new AirlineRepository(dbConnection);
        departureRepository = new DepartureRepository(dbConnection);
        airplaneParkingSpotRepository = new AirplaneParkingSpotRepository(dbConnection);
        arrivalrepository = new ArrivalRepository(dbConnection);
        airplaneRepository = new AirplaneRepository(dbConnection);

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
                    //departureRepository.fetchAll();


                    List<Departure> departureRepositories = departureRepository.fetchAll();

                    for (Departure d: departureRepositories) {
                        System.out.println("Airplane\t" + d.toString() + ", To Country\t" + d.toCountry() + ",Departure Date\t" + d.getDepartureDate());

                    }
                }

            case 4:
                System.out.println("Show airport parking spot");
            {
                if (valg == 1) {

                    List<AirplaneParkingSpot> parkingSpots = airplaneParkingSpotRepository.fetchAll();

                    for (AirplaneParkingSpot a : parkingSpots) {
                        System.out.println("Number:\t" + a.getNumber() + ", IsOccupied:\t" + a.isOccupied()
                                + ", Size:\t" + a.getSize().toString());

                    }if (valg == 2) {

                        System.out.println("Move plane");

                        StandpladsService standpladsService = new StandpladsService(dbConnection);
                        standpladsService.movePlane();
                    }

                }
            }

            case 5:
                System.out.println("Arrival");

                if (valg ==1){
                   List<Arrival> arrivalList = arrivalrepository.fetchAll();

                   for (Arrival a : arrivalList){

                       System.out.println("Airplane:\t" + a.toString() + "From Country:\t" + a.getFromCountry() + "Arrival Date\t" + a.getArrivalDate());

                   }
                }
            case 6:
                System.out.println("Airplane");


                if (valg == 1){
                    List<Airplane> airplanes = airplaneRepository.fetchAll();

                    for (Airplane a: airplanes){
                        System.out.println("Size:\t" + a.getSize() + " Name:\t " + a.getName());
                    }
                }

        }

    }

}
