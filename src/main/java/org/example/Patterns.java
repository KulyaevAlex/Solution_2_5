package org.example;

public class Patterns {
    public static void printSquare(int n) { //Метод получения квадрата
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int n) { //Метод получения треугольника
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPyramid() {
        int strings = 3;
        for (int i = 1; i <= strings; i++) {
            for (int j = 0; j < strings - i; j++) {
                System.out.print(" ");
            }
            int symbol = 2 * i - 1;
            for (int k = 0; k < symbol; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Выведем квадрат:");
        printSquare(n);
        System.out.println();
        System.out.println("Выведем правый треугольник:");
        printTriangle(n);
        System.out.println();
        System.out.println("Выведем пирамиду: ");
        printPyramid();
    }
}

