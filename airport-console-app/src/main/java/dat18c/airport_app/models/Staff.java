package dat18c.airport_app.models;

public class Staff
{
    int cleaningGroup;

    public int getCleaningGroup()
    {
        return cleaningGroup;
    }
    public void setCleaningGroup(int cleaningGroup)
    {
        this.cleaningGroup = cleaningGroup;
    }

    public Staff(int cleaningGroup)
    {
        this.cleaningGroup = cleaningGroup;
    }

}
