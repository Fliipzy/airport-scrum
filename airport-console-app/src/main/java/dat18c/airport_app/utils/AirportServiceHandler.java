package dat18c.airport_app.utils;

import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.models.enums.Size;

public class AirportServiceHandler
{
    public boolean preparingAirplane(AirplaneParkingSpot parkingSpot)
    {
        if (!parkingSpot.isOccupied()) 
        {
            return false;
        }

        switch (parkingSpot.getSize())
        {
            case SMALL: 
            {
                if (parkingSpot.getAirplane().getSize() == Size.SMALL)
                {
                    doServices(10000, 30000);
                }
            }
            case MEDIUM: 
            {
                if (parkingSpot.getAirplane().getSize() == Size.MEDIUM)
                {
                    doServices(20000, 40000);
                }
            }
            case BIG: 
            {
                if (parkingSpot.getAirplane().getSize() == Size.BIG)
                {
                    doServices(30000, 60000);
                }
            }
        }
        return true;
    }

    private void doServices(long fuelTime, long cleanTime)
    {
        System.out.println("Adding fuel to the airplane!");
        Timer fuel = new Timer(fuelTime, new FuelCommand(), false);
        fuel.start(); 

        System.out.println("Cleaning the airplane!");
        Timer cleaning = new Timer(cleanTime, new CleaningCommand(), false);
        cleaning.start();             
    }
}
