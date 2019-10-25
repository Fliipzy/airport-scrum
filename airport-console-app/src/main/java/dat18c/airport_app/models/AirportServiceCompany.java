package dat18c.airport_app.models;

import dat18c.airport_app.models.enums.Size;

public class AirportServiceCompany 
{
    private int id;
    private Size size;
    private int taxiArrivalTime;
    private int passengersOutTime;
    private int baggageOutTime;
    private int refuelingTime;
    private int cleaningTime;
    private int baggageInTime;
    private int passengersInTime;
    private int taxiToArrivalSpot;
    private int taxiToAndFromParkingSpots;
    private int personelToAndFromOwnTerminal;
    private int personalToAndFromOtherTerminal;

    public AirportServiceCompany() {}

    public AirportServiceCompany(int idServiceSelskab, Size size, int taxi_ind_ved_ankomst, int passagerer_ud, int bagage_ud, int brændstof_påfyldning, int rengøring, int bagage_ind, int passagere_ind, int taxi_ud_til_afgang, int taxi_til_og_ofra_ventepladser, int personale_til_og_fra_øvrige_i_egen_terminal, int personale_til_og_fra_den_anden_terminal) 
    {
        this.id = idServiceSelskab;
        this.size = size;
        taxiArrivalTime = taxi_ind_ved_ankomst;
        passengersOutTime = passagerer_ud;
        baggageOutTime = bagage_ud;
        refuelingTime = brændstof_påfyldning;
        cleaningTime = rengøring;
        baggageInTime = bagage_ind;
        passengersInTime = passagere_ind;
        taxiToArrivalSpot = taxi_ud_til_afgang;
        taxiToAndFromParkingSpots = taxi_til_og_ofra_ventepladser;
        personelToAndFromOwnTerminal = personale_til_og_fra_øvrige_i_egen_terminal;
        personalToAndFromOtherTerminal = personale_til_og_fra_den_anden_terminal;
    }

    public int getIdServiceSelskab() 
    {
        return id;
    }

    public void setIdServiceSelskab(int idServiceSelskab) 
    {
        this.id = idServiceSelskab;
    }

    public Size getSize() 
    {
        return size;
    }

    public int getTaxi_ind_ved_ankomst() 
    {
        return taxiArrivalTime;
    }

    public void setTaxi_ind_ved_ankomst(int taxi_ind_ved_ankomst) 
    {
        taxiArrivalTime = taxi_ind_ved_ankomst;
    }

    public int getPassagerer_ud() 
    {
        return passengersOutTime;
    }

    public void setPassagerer_ud(int passagerer_ud) 
    {
        passengersOutTime = passagerer_ud;
    }

    public int getBagage_ud() 
    {
        return baggageOutTime;
    }

    public void setBagage_ud(int bagage_ud) 
    {
        baggageOutTime = bagage_ud;
    }

    public int getBrændstof_påfyldning() 
    {
        return refuelingTime;
    }

    public void setBrændstof_påfyldning(int brændstof_påfyldning) 
    {
        refuelingTime = brændstof_påfyldning;
    }

    public int getRengøring() 
    {
        return cleaningTime;
    }

    public void setRengøring(int rengøring) 
    {
        cleaningTime = rengøring;
    }

    public int getBagage_ind() 
    {
        return baggageInTime;
    }

    public void setBagage_ind(int bagage_ind) 
    {
        baggageInTime = bagage_ind;
    }

    public int getPassagere_ind() 
    {
        return passengersInTime;
    }

    public void setPassagere_ind(int passagere_ind) 
    {
        passengersInTime = passagere_ind;
    }

    public int getTaxi_ud_til_afgang() 
    {
        return taxiToArrivalSpot;
    }

    public void setTaxi_ud_til_afgang(int taxi_ud_til_afgang) 
    {
        taxiToArrivalSpot = taxi_ud_til_afgang;
    }

    public int getTaxi_til_og_ofra_ventepladser() 
    {
        return taxiToAndFromParkingSpots;
    }

    public void setTaxi_til_og_ofra_ventepladser(int taxi_til_og_ofra_ventepladser) 
    {
        taxiToAndFromParkingSpots = taxi_til_og_ofra_ventepladser;
    }

    public int getPersonale_til_og_fra_øvrige_i_egen_terminal() 
    {
        return personelToAndFromOwnTerminal;
    }

    public void setPersonale_til_og_fra_øvrige_i_egen_terminal(int personale_til_og_fra_øvrige_i_egen_terminal) 
    {
        personelToAndFromOwnTerminal = personale_til_og_fra_øvrige_i_egen_terminal;
    }

    public int getPersonale_til_og_fra_den_anden_terminal() 
    {
        return personalToAndFromOtherTerminal;
    }

    public void setPersonale_til_og_fra_den_anden_terminal(int personale_til_og_fra_den_anden_terminal) 
    {
        personalToAndFromOtherTerminal = personale_til_og_fra_den_anden_terminal;
    }
}
