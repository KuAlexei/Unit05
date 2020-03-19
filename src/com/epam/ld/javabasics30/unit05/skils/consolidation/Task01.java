package com.epam.ld.javabasics30.unit05.skils.consolidation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readNaturalNumberFromConsole(sc, "Введите длинну массива натуральных чисел: ");
        int[] intArray = new int[n];
        for (int i = 0 ; i < n; i++) {
            intArray[i] = readNaturalNumberFromConsole(sc, "Введите элемент массива № " + i + " : ");
        }
        int k = readNaturalNumberFromConsole(sc, "Введите число K: ");
        int sum = 0;
        for (int a:intArray) {
            if (a%k == 0) {
                sum += a;
            }
        }
        System.out.println("Сумма элементов массива кратных К: " + sum);
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

}
