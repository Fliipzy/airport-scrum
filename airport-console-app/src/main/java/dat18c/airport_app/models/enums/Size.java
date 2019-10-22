package dat18c.airport_app.models.enums;

public enum Size
{
    SMALL(1),
    MEDIUM(2),
    BIG(3);

    private final int index;

    Size(int index)
    {
        this.index = index;
    }

    public static Size fromInt(int i)
    {
        for (var ps : Size.values()) 
        {
            if (ps.index == i) 
            { 
                return ps;
            }    
        }
        return null;
    }
}