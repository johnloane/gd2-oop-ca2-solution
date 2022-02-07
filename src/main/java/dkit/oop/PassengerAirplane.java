package dkit.oop;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane  extends Airplane{

    // fields(Q2)
    private final int MAX_NUM_PASSENGERS;
    private ArrayList<String> passengerList;

    PassengerAirplane(String type, int maxNumPassengers) {
        // code here
        super(type);
        this.MAX_NUM_PASSENGERS = maxNumPassengers;
        this.passengerList = new ArrayList<>();
    }

    @Override
    public String toString()
    {
        return "PassengerAirplane{" +
                "MAX_NUM_PASSENGERS=" + MAX_NUM_PASSENGERS +
                ", passengerList=" + passengerList +
                "} " + super.toString();
    }

    public void addPassenger(String name) {
        // code here
        if(passengerList.size() < MAX_NUM_PASSENGERS)
        {
            passengerList.add(name);
        }
        else
        {
            System.out.println("The plane is full. Can't add any more passengers");
        }

    }


    public boolean containsPassenger(String passengerName)
    {
        return passengerList.contains(passengerName);
    }
} // end of PassengerAirplane
