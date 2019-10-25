package dat18c.airport_app.models;

import java.sql.Time;
import java.util.Date;

/**
 * Arrival class that contains Airplane-info, fromCountry and time of arrival.
 */

public class Arrival 
{
    private Airplane airplane;
    private String fromCountry;
    private Date arrivalDate;
    private Time arrivalTime;

    public Arrival() {}

    public Arrival(Airplane airplane, String fromCountry, Date arrivalDate, Time arrivalTime)
    {
        this.airplane = airplane;
        this.fromCountry = fromCountry;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
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
        return arrivalDate;
    }

    public Time getArrivalTime()
    {
        return arrivalTime;
    }

    @Override
    public String toString()
    {
        return String.format("[Arrival (airplane: %s)]", airplane.getName());
    }
}
