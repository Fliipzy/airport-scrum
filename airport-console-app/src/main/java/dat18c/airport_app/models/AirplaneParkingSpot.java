package dat18c.airport_app.models;

import dat18c.airport_app.models.enums.Size;

public class AirplaneParkingSpot 
{
    private Size size;
    private int number;
    private boolean isOccupied;

    public AirplaneParkingSpot(Size size, int number)
    {
        this.size = size;
        this.number = number;
    }

    public AirplaneParkingSpot(Size size, int number, boolean isOccupied)
    {
        this.size = size;
        this.number = number;
        this.isOccupied = isOccupied;
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
        return isOccupied;
    }

    @Override
    public String toString() 
    {
        return String.format("[Standplads (Number: %s, Size: %s)]", number, size.ordinal());
    }
}
