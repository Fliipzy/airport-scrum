package dat18c.airport_app.utils;

import dat18c.airport_app.models.Airplane;
import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.repositories.AirplaneRepository;
import dat18c.airport_app.utils.interfaces.ICommand;

public class AirportServiceTimer implements ICommand
{

    boolean isReady = false;
    AirplaneParkingSpot airplaneParkingSpot;
    Airplane airplane;
    public boolean preparingAirplane()
    {
        switch (airplaneParkingSpot.getSize())
        {
            case SMALL: {
                switch (airplane.getSize()) {
                    case SMALL:
                        if (airplaneParkingSpot.isOccupied()) {
                    /*System.out.println("Passagers exiting");
                    Timer passagersOut = new Timer(5000, this, true);
                    passagersOut.start();
                    passagersOut.stopTimer();

                    System.out.println("Luggage out");
                    Timer luggage = new Timer(10000, this, true);
                    luggage.start();
                    luggage.stopTimer();

                    System.out.println("Taxi to parkingSpot");
                    Timer taxi = new Timer(12000, this, true);
                    taxi.start();
                    taxi.stopTimer();*/
                            System.out.println("Adding fuel");
                            Timer fuel = new Timer(10000, this, true);
                            fuel.start();
                            fuel.interrupt();
                            System.out.println("Cleaning plane");
                            Timer cleaning = new Timer(30000, this, true);
                            cleaning.start();
                            cleaning.interrupt();
                        }
                }
            }
            case MEDIUM: {
                        switch (airplane.getSize()) {
                            case MEDIUM:
                                if (airplaneParkingSpot.isOccupied()) {

                    /*System.out.println("Passagers exiting");
                    Timer passagersOut = new Timer(10000, this, true);
                    passagersOut.start();
                    passagersOut.stopTimer();

                    System.out.println("Luggage out");
                    Timer luggage = new Timer(15000, this, true);
                    luggage.start();
                    luggage.stopTimer();

                    System.out.println("Taxi to parkingSpot");
                    Timer taxi = new Timer(10000, this, true);
                    taxi.start();
                    taxi.stopTimer();*/
                                    System.out.println("Adding fuel");
                                    Timer fuel = new Timer(20000, this, true);
                                    fuel.start();
                                    fuel.interrupt();
                                    System.out.println("Cleaning plane");
                                    Timer cleaning = new Timer(40000, this, true);
                                    cleaning.start();
                                    cleaning.interrupt();
                                    isReady = true;
                                    break;
                                }
                        }
                    }
                    case BIG: {
                     switch (airplane.getSize()) {
                         case BIG:
                /*System.out.println("Passagers exiting");
                Timer passagersOut = new Timer(15000, this, true);
                passagersOut.start();
                passagersOut.stopTimer();

                System.out.println("Luggage out");
                Timer luggage = new Timer(20000, this, true);
                luggage.start();
                luggage.stopTimer();

                System.out.println("Taxi to parkingSpot");
                Timer taxi = new Timer(15000, this, true);
                taxi.start();
                taxi.stopTimer();*/
                             System.out.println("Adding fuel");
                             Timer fuel = new Timer(30000, this, true);
                             fuel.start();
                             fuel.interrupt();
                             System.out.println("Cleaning plane");
                             Timer cleaning = new Timer(60000, this, true);
                             cleaning.start();
                             cleaning.interrupt();
                             isReady = true;
                             break;
                     }
                 }
             }
             return isReady;
    }

    @Override
    public void execute() {

    }
}
