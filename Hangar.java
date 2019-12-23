import java.util.ArrayList;

public class Hangar {

    private ArrayList<Plane> hangar;
    private ArrayList<Flight> flights;

    public Hangar() {
        hangar = new ArrayList<Plane>();
        flights = new ArrayList<Flight>();
    }

    public void addPlane(Plane pl) {
        hangar.add(pl);
    }

    public Plane getPlane(String s) {
        for (Plane plane : hangar) {
            if (plane.getID().equalsIgnoreCase(s)) {
                return plane;
            }
        }
        return null;
    }

    public void addFlight(Flight fl) {
        flights.add(fl);
    }

    public void printPlanes() {
        for (Plane plane : hangar) {
            System.out.println(plane);
        }
    }

    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
