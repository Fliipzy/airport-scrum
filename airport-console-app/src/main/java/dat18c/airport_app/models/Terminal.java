package dat18c.airport_app.models;

import java.util.List;

public class Terminal
{
    private List<AirplaneParkingSpot> airplaneParkingSpotList;

    public Terminal(List<AirplaneParkingSpot> parkingSpotList)
    {
        this.airplaneParkingSpotList = parkingSpotList;
    }

    public List<AirplaneParkingSpot> getAirplaneParkingSpotList()
    {
        return airplaneParkingSpotList;
    }

}
