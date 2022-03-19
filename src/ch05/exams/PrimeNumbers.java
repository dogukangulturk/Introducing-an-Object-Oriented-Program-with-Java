package ch05.exams;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers isPrime = new PrimeNumbers();
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int x = input.nextInt();

/*        if (isPrime.isPrime(x) & (x > 0)) {
            System.out.println(x + " bir asal sayıdır.");
        } else if (x < 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
        } else {
            System.out.println(x + " bir asal sayı değildir.");
        }*/

        isPrime.countNumberOfPrimesUpTo(x);
    }

    boolean isPrime(int n) {
        boolean prime = true;
        int i;
        int upperBound = (int) (Math.sqrt(n) + 1);
        for (i = 2; i < upperBound; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        //if (!prime)
            //System.out.println("İlk bölen : " + i);
        return prime;
    }

    void countNumberOfPrimesUpTo(int n){
        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++){
           boolean prime = isPrime(i);
           if (prime)
               numberOfPrimes++;
        }
        System.out.println(n + " sayısana kadar " + numberOfPrimes + " kadar asal sayı vardır.");
    }
}
