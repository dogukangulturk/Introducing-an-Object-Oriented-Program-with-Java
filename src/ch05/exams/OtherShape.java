package ch05.exams;

public class OtherShape {
    public static void main(String[] args) {
       SolaYatik s1 = new SolaYatik();
       s1.drawSekilsiz(10);

       Ucgen u1 = new Ucgen();
       u1.drawUcgen(10);
    }

    public static class Ucgen{
        public void drawUcgen(int uzunluk){
            for (int i=1; i<uzunluk; i++) {
                for (int j=i; j<uzunluk; j++){
                    System.out.print(" ");
                }
                for (int k=1; k<=i; k++){
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        }
    }

    public  static class SolaYatik{
        public void drawSekilsiz(int uzunluk){
            for (int satir = 0; satir < uzunluk; satir++){
                System.out.print(satir+"");
                for (int sutun = 0; sutun < satir; sutun++){
                    System.out.print("*");
                }
                System.out.print("satır bııtı");
                System.out.println();
            }
        }
    }
}
