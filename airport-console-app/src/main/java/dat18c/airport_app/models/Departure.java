package dat18c.airport_app.models;


import java.sql.Time;
import java.util.Date;

/**
 * Departure class
 */

public class Departure 
{
    private Airplane airplane;
    private String toCountry;
    private Date departureDate;
    private Time departureTime;

    public Departure() {}

    //Constructor holds 3 values
    public Departure(Airplane airplane, String toCountry, Date departureDate, Time departureTime)
    {
        this.airplane = airplane;
        this.toCountry = toCountry;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
    }

    //Getters. Setters are not used so that the values stay consistent.
    public Airplane getAirplane() 
    {
        return airplane;
    }

    public String toCountry() 
    {
        return toCountry;
    }

    public Date getDepartureDate()
    {
        return departureDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }


    @Override
    public String toString()
    {
        return String.format("[Departure (airplane: %s)]", airplane.getName());
    }
}
