package bike;

public class Pedal {
    private int gear1;
    private int gear2;

    public Pedal(int gear1, int gear2){
        this.gear1 = gear1;
        this.gear2 = gear2;
        System.out.println(" Added a " + (gear1 * gear2) + " speed gearshift");
    }

    public void start(){
        System.out.println("\nPedal started.");
    }

    public void stop(){
        System.out.println("\nPedal stopped.");
    }
}
