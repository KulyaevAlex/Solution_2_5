package org.example;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Всего простых чисел: " + count);
    }

    public static boolean checkPrime(int n) { //Метод определения простого числа
        if (n < 2) {
            return false;
        }
        int number = (int) Math.sqrt(n);
        for (int i = 2; i <= number; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
