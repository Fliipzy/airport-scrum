package dat18c.airport_app.models;

import dat18c.airport_app.models.enums.Size;

public class AirplaneParkingSpot 
{
    private Size size;
    private int number;
    private Airplane airplane = null;

    public AirplaneParkingSpot(Size size, int number)
    {
        this.size = size;
        this.number = number;
    }

    public AirplaneParkingSpot(Size size, int number, Airplane airplane)
    {
        this.size = size;
        this.number = number;
        this.airplane = airplane;
    }

    public Airplane getAirplane() 
    {
        return airplane;
    }

    public Size getSize() 
    {
        return size;
    }

    public int getNumber() 
    {
        return number;
    }

    public boolean isOccupied() 
    {
        return (airplane == null) ? false : true;
    }

    @Override
    public String toString() 
    {
        return String.format("[Standplads (Number: %s, Size: %s)]", number, size.ordinal());
    }
}
