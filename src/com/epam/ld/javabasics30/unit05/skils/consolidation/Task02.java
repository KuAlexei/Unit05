package com.epam.ld.javabasics30.unit05.skils.consolidation;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = readNaturalNumberFromConsole(sc, "Введите длинну последовательности чисел: ");
        int[] intArray = new int[n];
        Set<Integer> zeroSet = new LinkedHashSet<>();
        for (int i = 0 ; i < n; i++) {
            intArray[i] = readIntFromConsole(sc, "Введите элемент последовательности № " + i + " : ");
            if (intArray[i] == 0) {
                zeroSet.add(i);
            }
        }
        Integer[] zeroArray = zeroSet.toArray(new Integer[0]);
        System.out.print("/nЭлементы последовательности равные нулю находятся на следующих позициях:");
        for (int i:zeroArray) {
            System.out.print(" " + i);
        }
        System.out.println();
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
