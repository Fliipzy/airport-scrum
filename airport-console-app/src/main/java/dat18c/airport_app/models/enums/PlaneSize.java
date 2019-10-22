package dat18c.airport_app.models.enums;

public enum PlaneSize
{
    small(1),
    medium(2),
    big(3);

    private final int index;

    PlaneSize(int index)
    {
        this.index = index;
    }

    public static PlaneSize fromInt(int i)
    {
        for (var ps : PlaneSize.values()) 
        {
            if (ps.index == i) 
            { 
                return ps;
            }    
        }
        return null;
    }
}