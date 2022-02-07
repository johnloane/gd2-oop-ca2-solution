package dkit.oop;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * AirplaneManager is a container class that stores Airplanes
 * (of various class types) in a list.
 * It provides a public interface of methods that can
 * be used to manage the planes in the list.
 * It "encapsulates" the logic for managing Airplanes
 * and "hides" the data structures used to store the data.
 */

public class AirplaneManager {

    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method
    public void add(Airplane airplane)
    {
        airplaneList.add(airplane);
    }


    public void displayAllAirplanes() {
        // add code
        for(Airplane plane : airplaneList)
        {
            System.out.println(plane);
        }
    }

    public void displayAllPassengerAirplanes() {
        // add code
        for(Airplane plane : airplaneList)
        {
            if(plane instanceof PassengerAirplane)
            {
                System.out.println(plane);
            }
        }
    }

    //  write method getAllCargoAirplanes()
    public List<CargoAirplane> getAllCargoAirplanes()
    {
        List<CargoAirplane> cargoPlanes = new ArrayList<>();
        for(Airplane plane : airplaneList)
        {
            if(plane instanceof CargoAirplane)
            {
                cargoPlanes.add((CargoAirplane) plane);
            }
        }
        return cargoPlanes;
    }


    public boolean addPassengerNameToAirplane( int airplaneId, String passengerName)
    {
        Airplane plane = findAirplaneById(airplaneId);
        if(plane == null)
        {
            return false;
        }
        if(plane instanceof PassengerAirplane)
        {
            ((PassengerAirplane)plane).addPassenger(passengerName);
            return true;
        }
        return false;
    }

    private Airplane findAirplaneById(int airplaneId)
    {
        for(Airplane plane : airplaneList)
        {
            if(plane.getId() == airplaneId)
            {
                return plane;
            }
        }
        return null;
    }


    public boolean containsAirplane(Airplane plane)
    {
        for(Airplane currentPlane : airplaneList)
        {
            if(currentPlane.equals(plane))
            {
                return true;
            }
        }
        return false;
    }


    public Airplane findAirplaneByPassengerName( String passengerName)
    {
        for(Airplane plane : airplaneList)
        {
            if(plane instanceof PassengerAirplane)
            {
                if(((PassengerAirplane)plane).containsPassenger(passengerName))
                {
                    return plane;
                }
            }
        }
        return null;
    }

    public void displayAllAirplanesInOrderOfType(Comparator<Airplane> comparator)
    {
        airplaneList.sort(comparator);
    }


} // end of AirplaneManager


