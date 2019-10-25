package dat18c.airport_app.models;

import java.util.List;

/**
 * Airport
 */
public class Airport 
{
    private String name;
    private List<Terminal> terminals;
    
    public Airport(List<Terminal> terminals) 
    {
        this.terminals = terminals;
    }

    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @return the terminals
     */
    public List<Terminal> getTerminals() 
    {
        return terminals;
    }
}