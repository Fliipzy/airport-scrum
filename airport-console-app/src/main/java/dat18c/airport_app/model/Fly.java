package dat18c.airport_app.model;

/**
 * Fly klasse med attribut "name".
 * Kalder på FlySelskab klassen
 */
public class Fly {

    private String name;
    private FlySelskab flySelskab;

    //Constructor for Fly klasse
    public Fly(String name, FlySelskab flySelskab) {
        this.name = name;
        this.flySelskab = flySelskab;
    }

    public FlySelskab getFlySelskab() {
        return flySelskab;
    }

    public String getName() {
        return name;
    }

}
