package com.epam.ld.javabasics30.unit05.skils.consolidation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readNaturalNumberFromConsole(sc, "Введите длинну последовательности чисел: ");
        if (n > 1) {
            double[] doubleArray = new double[n];
            for (int i = 0; i < n; i++) {
                doubleArray[i] = readDoubleFromConsole(sc, "Введите элемент последовательности № " + i + " : ");
            }
            System.out.println();
            for (int i = 1; i < n; i++) {
                if (doubleArray[i-1] >= doubleArray[i]) {
                    System.out.println("Последовательность не является возрастающей.");
                    return;
                }
            }
            System.out.println("Последовательность является возрастающей.");
        } else {
            System.out.println("Последовательность из одного элемента бессмысленна!");
        }
    }

    public static int readIntFromConsole(Scanner sc, String message) {
        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static int readNaturalNumberFromConsole(Scanner sc, String message) {
        int n = 0;
        do {
            n = readIntFromConsole(sc, message);
        } while (n <= 0);
        return n;
    }

    public static double readDoubleFromConsole(Scanner sc, String message) {
        System.out.print(message);
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        return sc.nextDouble();
    }

}
