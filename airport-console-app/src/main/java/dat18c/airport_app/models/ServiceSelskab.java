package dat18c.airport_app.models;

public class ServiceSelskab {
    private int idServiceSelskab;
    private String size;
    private int Taxi_ind_ved_ankomst;
    private int Passagerer_ud;
    private int Bagage_ud;
    private int Brændstof_påfyldning;
    private int Rengøring;
    private int Bagage_ind;
    private int Passagere_ind;
    private int Taxi_ud_til_afgang;
    private int Taxi_til_og_ofra_ventepladser;
    private int Personale_til_og_fra_øvrige_i_egen_terminal;
    private int Personale_til_og_fra_den_anden_terminal;

    public ServiceSelskab() {
    }

    public ServiceSelskab(int idServiceSelskab, String size, int taxi_ind_ved_ankomst, int passagerer_ud, int bagage_ud, int brændstof_påfyldning, int rengøring, int bagage_ind, int passagere_ind, int taxi_ud_til_afgang, int taxi_til_og_ofra_ventepladser, int personale_til_og_fra_øvrige_i_egen_terminal, int personale_til_og_fra_den_anden_terminal) {
        this.idServiceSelskab = idServiceSelskab;
        this.size = size;
        Taxi_ind_ved_ankomst = taxi_ind_ved_ankomst;
        Passagerer_ud = passagerer_ud;
        Bagage_ud = bagage_ud;
        Brændstof_påfyldning = brændstof_påfyldning;
        Rengøring = rengøring;
        Bagage_ind = bagage_ind;
        Passagere_ind = passagere_ind;
        Taxi_ud_til_afgang = taxi_ud_til_afgang;
        Taxi_til_og_ofra_ventepladser = taxi_til_og_ofra_ventepladser;
        Personale_til_og_fra_øvrige_i_egen_terminal = personale_til_og_fra_øvrige_i_egen_terminal;
        Personale_til_og_fra_den_anden_terminal = personale_til_og_fra_den_anden_terminal;
    }

    public int getIdServiceSelskab() {
        return idServiceSelskab;
    }

    public void setIdServiceSelskab(int idServiceSelskab) {
        this.idServiceSelskab = idServiceSelskab;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getTaxi_ind_ved_ankomst() {
        return Taxi_ind_ved_ankomst;
    }

    public void setTaxi_ind_ved_ankomst(int taxi_ind_ved_ankomst) {
        Taxi_ind_ved_ankomst = taxi_ind_ved_ankomst;
    }

    public int getPassagerer_ud() {
        return Passagerer_ud;
    }

    public void setPassagerer_ud(int passagerer_ud) {
        Passagerer_ud = passagerer_ud;
    }

    public int getBagage_ud() {
        return Bagage_ud;
    }

    public void setBagage_ud(int bagage_ud) {
        Bagage_ud = bagage_ud;
    }

    public int getBrændstof_påfyldning() {
        return Brændstof_påfyldning;
    }

    public void setBrændstof_påfyldning(int brændstof_påfyldning) {
        Brændstof_påfyldning = brændstof_påfyldning;
    }

    public int getRengøring() {
        return Rengøring;
    }

    public void setRengøring(int rengøring) {
        Rengøring = rengøring;
    }

    public int getBagage_ind() {
        return Bagage_ind;
    }

    public void setBagage_ind(int bagage_ind) {
        Bagage_ind = bagage_ind;
    }

    public int getPassagere_ind() {
        return Passagere_ind;
    }

    public void setPassagere_ind(int passagere_ind) {
        Passagere_ind = passagere_ind;
    }

    public int getTaxi_ud_til_afgang() {
        return Taxi_ud_til_afgang;
    }

    public void setTaxi_ud_til_afgang(int taxi_ud_til_afgang) {
        Taxi_ud_til_afgang = taxi_ud_til_afgang;
    }

    public int getTaxi_til_og_ofra_ventepladser() {
        return Taxi_til_og_ofra_ventepladser;
    }

    public void setTaxi_til_og_ofra_ventepladser(int taxi_til_og_ofra_ventepladser) {
        Taxi_til_og_ofra_ventepladser = taxi_til_og_ofra_ventepladser;
    }

    public int getPersonale_til_og_fra_øvrige_i_egen_terminal() {
        return Personale_til_og_fra_øvrige_i_egen_terminal;
    }

    public void setPersonale_til_og_fra_øvrige_i_egen_terminal(int personale_til_og_fra_øvrige_i_egen_terminal) {
        Personale_til_og_fra_øvrige_i_egen_terminal = personale_til_og_fra_øvrige_i_egen_terminal;
    }

    public int getPersonale_til_og_fra_den_anden_terminal() {
        return Personale_til_og_fra_den_anden_terminal;
    }

    public void setPersonale_til_og_fra_den_anden_terminal(int personale_til_og_fra_den_anden_terminal) {
        Personale_til_og_fra_den_anden_terminal = personale_til_og_fra_den_anden_terminal;
    }
}
