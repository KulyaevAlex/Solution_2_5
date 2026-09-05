package org.example;


import java.util.Scanner;

public class DigitAnalyzer {
    public static int countDigits(int n) { //Метод определения количества цифр в числе
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int sumOfDigits(int n) { //Метод определения суммы цифр числа
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static int maxDigitOfNumber(int n) { //Метод получения максимальной цифры числа
        int maxDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n /= 10;
        }
        return maxDigit;
    }

    public static String polindrome(int n) { //Метод определения полиндрома
        int number = n;
        int reverseNumber = 0;
        while (n > 0) {
            int digit = n % 10;
            reverseNumber = reverseNumber * 10 + digit;
            n /= 10;
        }
        if (reverseNumber == number) {
            return "Да";
        } else {
            return "Нет";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое целое число больше нуля: ");
        int number = scanner.nextInt();
        System.out.println("Число: " + number);
        System.out.println("Количество цифр в числе: " + countDigits(number));
        System.out.println("Сумма всех цифр в числе: " + sumOfDigits(number));
        System.out.println("Максимальная цифра числа: " + maxDigitOfNumber(number));
        System.out.println("Является ли число полиндромом: " + polindrome(number));
    }
}
