package dat18c.airport_app.models;

import java.util.Date;

/**
 * Departure class
 */

public class Departure 
{
    private Airplane airplane;
    private String toCountry;
    private Date departureDate;

    public Departure() {}

    //Constructor holds 3 values
    public Departure(Airplane airplane, String toCountry, Date departureDate) 
    {
        this.airplane = airplane;
        this.toCountry = toCountry;
        this.departureDate = departureDate;
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
}
