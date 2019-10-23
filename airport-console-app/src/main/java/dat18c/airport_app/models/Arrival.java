package dat18c.airport_app.models;

import java.util.Date;

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
}
