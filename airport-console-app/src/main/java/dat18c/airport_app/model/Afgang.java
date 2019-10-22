package dat18c.airport_app.model;

public class Afgang {
    private int idAfgang;
    private String til_land;
    private String afgang_tidspunkt;

    public Afgang() {
    }

    public Afgang(int idAfgang, String til_land, String afgang_tidspunkt) {
        this.idAfgang = idAfgang;
        this.til_land = til_land;
        this.afgang_tidspunkt = afgang_tidspunkt;
    }

    public int getIdAfgang() {
        return idAfgang;
    }

    public void setIdAfgang(int idAfgang) {
        this.idAfgang = idAfgang;
    }

    public String getTil_land() {
        return til_land;
    }

    public void setTil_land(String til_land) {
        this.til_land = til_land;
    }

    public String getAfgang_tidspunkt() {
        return afgang_tidspunkt;
    }

    public void setAfgang_tidspunkt(String afgang_tidspunkt) {
        this.afgang_tidspunkt = afgang_tidspunkt;
    }
}
