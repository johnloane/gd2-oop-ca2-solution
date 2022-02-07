package dkit.oop;

import java.util.Objects;

public abstract class Airplane {

    private int id;
    private String type;     // e.g. "Airbus 380"
    private static int nextId = 100;  // to generate/supply unique id values
    
    Airplane(String type) {
        this.id = Airplane.nextId++;    // generate unique id
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "id='" + id + '\'' +
                ", type='" + type + '\'' ;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return id == airplane.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }
} // end of Airplane
