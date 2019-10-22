package dat18c.airport_app.models;

import dat18c.airport_app.models.enums.PlaneSize;
import dat18c.airport_app.models.Airline;

/**
 * Fly klasse med attribut "name".
 * Kalder på FlySelskab klassen
 */
public class Plane 
{
    private String name;
    private PlaneSize size;
    private Airline airline;

    public Plane(String name, PlaneSize size, Airline airline) 
    {
        this.name = name;
        this.size = size;
        this.airline = airline;
    }

    public Airline getFlySelskab() 
    {
        return airline;
    }

    public PlaneSize getSize()
    {
        return size;
    }

    public String getName() 
    {
        return name;
    }
}
