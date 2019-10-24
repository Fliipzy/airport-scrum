package dat18c.airport_app;


import java.sql.SQLException;
import java.util.List;

import dat18c.airport_app.db.DatabaseConnection;
import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.models.Arrival;
import dat18c.airport_app.models.Departure;
import dat18c.airport_app.repositories.AirplaneParkingSpotRepository;

import dat18c.airport_app.repositories.ArrivalRepository;
import dat18c.airport_app.repositories.DepartureRepository;
import dat18c.airport_app.services.StandpladsService;

import dat18c.airport_app.userconfig.UserConfig;
import dat18c.airport_app.utils.Timer;
import dat18c.airport_app.utils.interfaces.ICommand;


/**
 * Hello world!
 */
public class Program {
    public static void main(String[] args) {
        UserConfig.StartConfiguration();
        System.out.println(UserConfig.getUserName());

<<<<<<< HEAD
public class Program {
    public static void main(String[] args) throws SQLException {
=======
>>>>>>> ad19e271ce2e0cb3e7a7a8cad4bc828093cbf28b
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.connect();
    }
}


        /*
        ArrivalRepository arrivalRepository = new ArrivalRepository(dbConnection);

         List<Arrival> arrivalList = arrivalRepository.fetchAll();

                           for (Arrival a : arrivalList){
                               System.out.println("Airplane:\t" + a.toString() + "From Country:\t" + a.getFromCountry() + "Arrival Date\t" + a.getArrivalDate());
                           }

                           */
        /*DepartureRepository deprepo = new DepartureRepository(dbConnection);
                               System.out.println("Airplane:\t" + a.getAirplane() + "From Country:\t" + a.getFromCountry() + "Arrival Date\t" + a.getArrivalDate());List<Departure> departureRepositories = deprepo.fetchAll();

                           }for (Departure d : departureRepositories) {
            System.out.println("Airplane\t" + d.toString() + ", To Country\t" + d.toCountry() + ",Departure Date\t" + d.getDepartureDate());
        }

        */
            /*StandpladsService standpladsService = new StandpladsService(dbConnection);
                                AirplaneParkingSpotRepository repo         = new AirplaneParkingSpotRepository(dbConnection);
                            }List<AirplaneParkingSpot>     parkingSpots = repo.fetchAll();

        for (AirplaneParkingSpot a : parkingSpots)
        {
            System.out.println("Number:\t" + a.getNumber() + ", IsOccupied:\t" + a.isOccupied()
                    + ", Size:\t" + a.getSize().toString());
        }
        */

//        standpladsService.movePlane();


/*

public class Program {
    public static void main(String[] args) {

        ICommand command = new ICommand() {

=======
        ICommand command = new ICommand(){
        
>>>>>>> ef343ad9fdf4fc14aacd9c0ccfbe3aef1a753044
            @Override
            public void execute() 
            {
                System.out.println("Hello, World!");
            }
        };

        Timer timer = new Timer(1000, command, true);
        timer.start();

        try 
        {
            Thread.sleep(3000);
            timer.interrupt();    
        } 
        catch (Exception e) 
        {
            //TODO: handle exception
        }
    }
    
 */