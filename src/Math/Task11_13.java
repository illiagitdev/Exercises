package Math;

import java.util.Scanner;

public class Task11_13 {
    public static void main(String[] args) {
//        task11();
//        task12();
        task13();
    }

    //  Write a Java program to find the length of the longest sequence of zeros in binary representation of an integer.
    private static void task13() {
//        x
    }

    // Write a Java program to count the number of prime numbers less than a given positive number.
    private static void task12() {
        System.out.print("Input value: ");
        int val = (int) scanValue();

        if (val >= 1) {
            System.out.println(countPrimes(val));
        } else {
            System.out.println(false);
        }
    }

    private static int countPrimes(int val) {
        int count = 0, index = 0;
        for (int i = 1; i < val; i++) {
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    index++;
                }
            }
            if (index == 2) {
                count++;
//                System.out.println(i);
            }
            index = 0;
        }
        return count;
    }

    //  Write a Java program to accept two integers and return true if the either one is 15 or if their sum
    //  or difference is 15.
    private static void task11() {
        System.out.print("Input first value: ");
        int val1 = (int) scanValue();
        System.out.print("Input second value: ");
        int val2 = (int) scanValue();

        if (val1 == 15 || val2 == 15) {
            System.out.println(true);
        } else if (Math.abs(val1 - val2) == 15 || Math.abs(val1 + val2) == 15) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    private static double scanValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
