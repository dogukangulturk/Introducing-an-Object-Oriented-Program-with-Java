package ch02.car;

public class Car {
    public String make;
    public String model;
    public String year;
    public int speed;
    public int distance;

    public double go(int newDistance) {
        distance += newDistance;
        double period = (double) newDistance / speed;
        return period;
    }

    public void accelerate(int newSpeed) {
        speed += newSpeed;
    }

    public void stop() {
        speed = 0;
    }

    public String getInfo() {
        String info = "Car info: " + year + " " + make + " " + model + "." + " Distance: " + distance + " km. And travelling at " + speed + " kmph.";
        return info;
    }

}
