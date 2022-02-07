package dkit.oop;

import java.util.Comparator;

public class AirplaneTypeComparator implements Comparator<Airplane>
{

    @Override
    public int compare(Airplane a1, Airplane a2)
    {
        return a1.getType().compareTo(a2.getType());
    }
}
