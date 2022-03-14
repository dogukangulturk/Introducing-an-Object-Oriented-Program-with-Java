package ch05.Exams;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        //r1.drawFilledRectangle(10,5);
        r1.drawVoidRectangle(10, 5);
    }

    public static class Rectangle1 {
        public void drawFilledRectangle(int row, int column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("*");
                    if (j == column - 1) {
                        System.out.println();
                    }
                }
            }
        }

        public void drawVoidRectangle(int row, int column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (i == 0 | i == row - 1) {
                        System.out.print("*");
                    } else {
                        if (j == 0 | j == column - 1)
                            System.out.print("*");
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
