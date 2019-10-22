package dat18c.airport_app.models;

public class Destination 
{
    private int idDestination;
    private String fra_land;
    private String ankomst_tidspunkt;

    public Destination() {}

    public Destination(int idDestination, String fra_land, String ankomst_tidspunkt) 
    {
        this.idDestination = idDestination;
        this.fra_land = fra_land;
        this.ankomst_tidspunkt = ankomst_tidspunkt;
    }

    public int getIdDestination() 
    {
        return idDestination;
    }

    public void setIdDestination(int idDestination) 
    {
        this.idDestination = idDestination;
    }

    public String getFra_land() 
    {
        return fra_land;
    }

    public void setFra_land(String fra_land) 
    {
        this.fra_land = fra_land;
    }

    public String getAnkomst_tidspunkt() 
    {
        return ankomst_tidspunkt;
    }

    public void setAnkomst_tidspunkt(String ankomst_tidspunkt) 
    {
        this.ankomst_tidspunkt = ankomst_tidspunkt;
    }
}
