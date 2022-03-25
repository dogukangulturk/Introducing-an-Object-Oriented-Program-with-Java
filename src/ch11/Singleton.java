package ch11;

public class Singleton {
    private static Singleton singleInstance = null;

    public String s;

    private int x = 4;

    private Singleton(){
        s = " Merhaba Singleton bir sinif olusturdunuz ";
    }

    public static Singleton getInstance(){
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    void degerArttir(int i) {
        x++;
        System.out.println(x);
        this.x = x;
    }

    void getXInfo(){
        System.out.println(x);
    }
}

class CFG {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        System.out.println(y.s);

        System.out.println(x==y);

        x.degerArttir(3);
        y.degerArttir(2);

        x.getXInfo();
        y.getXInfo();
    }
}
