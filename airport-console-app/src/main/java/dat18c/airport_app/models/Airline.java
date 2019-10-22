package dat18c.airport_app.models;

/**
 * FlySelskab klasse med attribut "Name"
 */
public class Airline 
{
    private String name;

    public Airline(String name) 
    {
        this.name = name; 
    }
    //Getter og Setter for Name-variabel.
    public String getName() 
    {
        return name;
    }

}
