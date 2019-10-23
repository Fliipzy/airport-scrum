package dat18c.airport_app.models;

import java.util.Date;

public class Arrival 
{
    private Airplane plane;
    private String fromCountry;
    private Date arrivalTime;

    public Arrival() {}

    public Arrival(Airplane plane, String fromCountry, Date arrivalDate) 
    {
        this.plane = plane;
        this.fromCountry = fromCountry;
        this.arrivalTime = arrivalDate;
        //
    }

    public Airplane getPlane() 
    {
      return plane;
    }

    public String getFromCountry() 
    {
        return fromCountry;
    }

    public Date getArrivalDate() 
    {
        return arrivalTime;
    }
}
