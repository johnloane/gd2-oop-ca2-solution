package dkit.oop;

public class CargoAirplane extends Airplane{

    // fields (ref. Q1)
    private final int MAX_LOAD_KILOS;
    private int currentLoad;

    // constructor

    public CargoAirplane(String type, int MAX_LOAD_KILOS)
    {
        super(type);
        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
    }

    // toString()


    @Override
    public String toString()
    {
        return "CargoAirplane{" +
                "MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                ", currentLoad=" + currentLoad +
                "} " + super.toString();
    }
} // END of CargoAirplane class.

