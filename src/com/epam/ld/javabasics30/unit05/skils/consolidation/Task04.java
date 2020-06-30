package com.epam.ld.javabasics30.unit05.skils.consolidation;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readNaturalNumberFromConsole(sc, "Введите длинну последовательности чисел: ");
        int evenCnt = 0;
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = readNaturalNumberFromConsole(sc, "Введите элемент последовательности № " + i + " : ");
            if (intArray[i] % 2 == 0) {
                evenCnt++;
            }
        }
        System.out.println();
        if (evenCnt > 0) {
            int[] evenIntArray = new int[evenCnt];
            int j = 0;
            for (int i:intArray) {
                if (i % 2 == 0) {
                    evenIntArray[j] = i;
                    j++;
                }
            }
            System.out.print("Чётные числа последовательности:");
            for (int i:evenIntArray) {
                System.out.print(" " + i);
            }
        } else {
            System.out.println("В последовательности нет четных чисел.");
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

}
// Еще раз спасибо за ваше аккуратное отношение к коду
// задачи решены корректно и зачтены
