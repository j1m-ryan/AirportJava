
public class Plane {

    private int capacity;
    private String id;

    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getID() {
        return this.id;

    }

    public int getCapacity() {
        return this.capacity;

    }

    public String toString() {
        return this.id + " (" + this.capacity + " ppl)";
    }
}
