
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        Hangar h = new Hangar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Airport panel\n"
                + "--------------------\n"
        );
        outer: while (true) {
            printMenu();
            System.out.print("> ");
            String ans = sc.nextLine();

            if (ans.equals("1")) {
                System.out.print("Give plane ID: ");
                String plane = sc.nextLine();
                System.out.print("Give plane capacity: ");
                int planeCap = Integer.parseInt(sc.nextLine());
                Plane pl = new Plane(plane, planeCap);
                h.addPlane(pl);
            } else if (ans.equals("2")) {
                System.out.print("Give plane ID: ");
                String plane = sc.nextLine();
                System.out.print("Give departure airport code: ");
                String depCode = (sc.nextLine());
                System.out.print("Give destination airport code: ");
                String destCode = (sc.nextLine());

                Flight flight = new Flight(h.getPlane(plane), depCode, destCode);
                h.addFlight(flight);

            } else if (ans.equalsIgnoreCase("x")) {
                System.out.println("");
                System.out.println("Flight service\n"
                        + "------------");
                while (true) {
                    System.out.println("Choose operation:\n"
                            + "[1] Print planes\n"
                            + "[2] Print flights\n"
                            + "[3] Print plane info\n"
                            + "[x] Quit");
                    System.out.print("> ");
                    String ansN = sc.nextLine();
                    if (ansN.equals("1")) {
                        h.printPlanes();
                    } else if (ansN.equals("2")) {
                        h.printFlights();

                    } else if (ansN.equals("3")) {
                        System.out.print("Give plane ID: ");
                        String planeID = sc.nextLine();
                        System.out.println(h.getPlane(planeID));
                    } else if (ansN.equalsIgnoreCase("x")) {
                        break outer;

                    }

                }
            }

        }
    }

    public static void printMenu() {
        System.out.println(
                "Choose operation:\n"
                        + "[1] Add airplane\n"
                        + "[2] Add flight\n"
                        + "[x] Exit");
    }
}
