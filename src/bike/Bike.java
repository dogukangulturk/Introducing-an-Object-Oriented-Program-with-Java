package bike;

public class Bike {
    private String make;
    private String model;
    private int distance;

    private Wheel[] wheels = new Wheel[2];
    private Saddle saddle;
    private Pedal pedal;

    public Bike(String make, String model) {
        this.make = make;
        this.model = model;

        pedal = new Pedal(7, 3);

        wheels[0] = new Wheel("On teker", 27.0);
        wheels[1] = new Wheel("Arka teker", 27.0);

        saddle = new Saddle(35.0);

        System.out.println("A bike of " + make + " " + model + ", " + " is created.\n");
    }

    public void go(int newDistance) {
        System.out.println("Bike is moving.");
        distance += newDistance;
        System.out.println("Distance: " + distance);
    }
}
