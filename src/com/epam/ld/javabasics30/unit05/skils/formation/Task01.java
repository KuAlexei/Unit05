package com.epam.ld.javabasics30.unit05.skils.formation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0;
        do {
            l = readIntFromConsole(sc, "Введите длинну массива: ");
        } while (l <= 0);
        double[] doubleArray = new double[l];
        for (int i = 0 ; i < l; i++) {
            doubleArray[i] = readDoubleFromConsole(sc, "Введите элемент массива № " + i + " : ");
        }
        double max = doubleArray[0];
        double min = doubleArray[0];
        int minIndex = 0;
        for (int i = 1 ; i < l; i++) {
            if (max < doubleArray[i]) {
                max = doubleArray[i];
            }
            if (min > doubleArray[i]) {
                min = doubleArray[i];
                minIndex = i;
            }
        }
        System.out.println("Самое большое число: " + max);
        System.out.println("Самое маленькое число: " + min + " с индексом: " + minIndex);
    }

    public static int readIntFromConsole(Scanner sc, String message) {
        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.next();
        }
        return sc.nextInt();
    }

    public static double readDoubleFromConsole(Scanner sc, String message) {
        System.out.print(message);
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        return sc.nextDouble();
    }

}
