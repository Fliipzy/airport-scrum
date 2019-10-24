package dat18c.airport_app.models;

import java.util.Date;

/**
 * Arrival class that contains Airplane-info, fromCountry and time of arrival.
 */

public class Arrival 
{
    private Airplane airplane;
    private String fromCountry;
    private Date arrivalTime;

    public Arrival() {}

    public Arrival(Airplane airplane, String fromCountry, Date arrivalDate) 
    {
        this.airplane = airplane;
        this.fromCountry = fromCountry;
        this.arrivalTime = arrivalDate;
    }

    public Airplane getAirplane() 
    {
      return airplane;
    }

    public String getFromCountry() 
    {
        return fromCountry;
    }

    public Date getArrivalDate() 
    {
        return arrivalTime;
    }

    @Override
    public String toString()
    {
        return String.format("[Arrival (airplane: %s)]", airplane.getName());
    }
}
