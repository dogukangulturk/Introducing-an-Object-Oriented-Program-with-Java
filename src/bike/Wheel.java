package bike;

public class Wheel {
    private String name;
    private double inch;
    private String wheelModel;

    public Wheel(String name, double inch) {
        this.name = name;
        this.inch = inch;
        System.out.println("A wheel is created: " + inch + " inch " + name);
    }
}
