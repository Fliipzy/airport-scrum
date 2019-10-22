package dat18c.airport_app.models;

import java.util.Date;

public class Departure 
{
    private Plane plane;
    private String toCountry;
    private Date departureDate;

    public Departure() {}

    public Departure(Plane plane, String toCountry, Date departureDate) 
    {
        this.plane = plane;
        this.toCountry = toCountry;
        this.departureDate = departureDate;
    }

    public Plane getPlane() 
    {
        return plane;
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
