package dat18c.airport_app.models;

import java.util.Date;

public class Departure 
{
    private Airplane airplane;
    private String toCountry;
    private Date departureDate;

    public Departure() {}

    public Departure(Airplane airplane, String toCountry, Date departureDate) 
    {
        this.airplane = airplane;
        this.toCountry = toCountry;
        this.departureDate = departureDate;
    }

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
