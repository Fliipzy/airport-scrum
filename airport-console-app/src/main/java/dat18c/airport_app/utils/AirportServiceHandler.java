package dat18c.airport_app.utils;

import dat18c.airport_app.models.AirplaneParkingSpot;
import dat18c.airport_app.models.enums.Size;

public class AirportServiceTimer
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
                    doServices(10000, 20000);
                }
            }
            case MEDIUM: 
            {
                if (parkingSpot.getAirplane().getSize() == Size.MEDIUM)
                {
                    doServices(10000, 20000);
                }
            }
            case BIG: 
            {
                if (parkingSpot.getAirplane().getSize() == Size.BIG)
                {
                    doServices(10000, 20000);
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
