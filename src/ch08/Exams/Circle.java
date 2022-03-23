package ch08.Exams;

public class Circle {
    double yaricap;
    double pi = 3.14;

    public Circle() {
        this(10.0);
    }

    public Circle(double radius) {
        this.yaricap = radius;
    }

    double alan() {
        double alan = pi * (yaricap * yaricap);
        return alan;
    }

    double cevre() {
        double cevre = 2 * pi * yaricap;
        return cevre;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(13.0);
        System.out.println(c1.yaricap);

        System.out.println(c1.alan());
        System.out.println(c1.cevre());
    }

}
