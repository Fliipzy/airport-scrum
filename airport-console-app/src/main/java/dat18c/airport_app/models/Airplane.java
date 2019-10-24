package dat18c.airport_app.models;

import dat18c.airport_app.models.enums.Size;
import dat18c.airport_app.models.Airline;

/**
 * Aurplane class that holds name, size and what Airline the plane belongs to
 */

public class Airplane 
{
    private String name;
    private Size size;
    private Airline airline;

    public Airplane(String name, Size size, Airline airline) 
    {
        this.name = name;
        this.size = size;
        this.airline = airline;
    }

    public Airline getFlySelskab() 
    {
        return airline;
    }

    public Size getSize()
    {
        return size;
    }

    public String getName() 
    {
        return name;
    }
}
