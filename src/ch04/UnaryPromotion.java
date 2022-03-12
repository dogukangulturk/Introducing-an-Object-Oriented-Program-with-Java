package ch04;

public class UnaryPromotion {

    public static void main(String[] args) {
        byte b = 3;
        b = (byte) +b;
        b = (byte) +b;        // Unary promotion
        b = (byte) -b;        // Unary promotion
        b = (byte) ~b;        // Unary promotion

        byte b1 = ++b;
    }
}
