package dat18c.airport_app.model;

public class Standplads {

    private int idFly;
    private int Flyselskab_idflyselskab;
    private int Afgangs_idAfgang;
    private int flysize_idFlySize;
    private int Standplads_standpladsNummer;


    public Standplads(int idFly, int flyselskab_idflyselskab, int afgangs_idAfgang, int flysize_idFlySize, int standplads_standpladsNummer) {
        this.idFly = idFly;
        Flyselskab_idflyselskab = flyselskab_idflyselskab;
        Afgangs_idAfgang = afgangs_idAfgang;
        this.flysize_idFlySize = flysize_idFlySize;
        Standplads_standpladsNummer = standplads_standpladsNummer;
    }

    public int getIdFly() {
        return idFly;
    }

    public void setIdFly(int idFly) {
        this.idFly = idFly;
    }

    public int getFlyselskab_idflyselskab() {
        return Flyselskab_idflyselskab;
    }

    public void setFlyselskab_idflyselskab(int flyselskab_idflyselskab) {
        Flyselskab_idflyselskab = flyselskab_idflyselskab;
    }

    public int getAfgangs_idAfgang() {
        return Afgangs_idAfgang;
    }

    public void setAfgangs_idAfgang(int afgangs_idAfgang) {
        Afgangs_idAfgang = afgangs_idAfgang;
    }

    public int getFlysize_idFlySize() {
        return flysize_idFlySize;
    }

    public void setFlysize_idFlySize(int flysize_idFlySize) {
        this.flysize_idFlySize = flysize_idFlySize;
    }

    public int getStandplads_standpladsNummer() {
        return Standplads_standpladsNummer;
    }

    public void setStandplads_standpladsNummer(int standplads_standpladsNummer) {
        Standplads_standpladsNummer = standplads_standpladsNummer;
    }
}
