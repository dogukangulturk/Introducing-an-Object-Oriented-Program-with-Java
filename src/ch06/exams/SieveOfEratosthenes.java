package ch06.exams;

import java.util.Scanner;
import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir tamsayı giriniz : ");
        int n = input.nextInt();

        SieveOfEratosthenes primeCount = new SieveOfEratosthenes();
        primeCount.countNumberOfPrimesUpTo(n);
    }

    void countNumberOfPrimesUpTo(int n) {
        boolean[] list = new boolean[n+1];
        Arrays.fill(list, true);
        list[0] = false;
        list[1] = false;


        for (int i = 2; i <= n; i++) {
            if (list[i] == true)
                for (int j = 2; j * i <= n; j++)
                    list[i * j] = false;
        }

        int numberOfPrimes = 0;

        for (boolean b : list){
            if(b)
                numberOfPrimes++;
        }

        System.out.println("Girilen " + n + " sayısına kadar olan asal sayıların sayısı : " + numberOfPrimes);
    }
}
