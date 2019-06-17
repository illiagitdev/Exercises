package Math;

import sorting.SortingInventory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    //  Write a Java program to count the absolute distinct value in an array.
    private static void task5() {
        int[] array = {-1, -1, 0, 2, 2, 3, 0, 1, 5, 9};
        SortingInventory sortBub = new SortingInventory();

        int count = 0, len = array.length;
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < len; i++) {
            int x = Math.abs(array[i]);
            if (!set.contains(x)) {
                set.add(x);
                count++;
            }
        }
        System.out.println(count);

        int[] newArray = sortBub.BubbleSort(array);
        for (int x : newArray
        ) {
            System.out.print(x + " ");
        }
        count=0;
        for (int i = 0; i<len; i++){

        }
    }

    //  Write a Java program to round a float number to specified decimals.
    private static void task4() {
        System.out.print("Input value: ");
        double val = scanDouble();
//        System.out.print("Round to range: ");
//        int round = scanValue();

        DecimalFormat format = new DecimalFormat("#.####");
        format.setRoundingMode(RoundingMode.CEILING);
        System.out.println(format.format(val));
    }

    //  Write a Java program to test if a double number is an integer.
    private static void task3() {
        System.out.print("Input value: ");
        double val = scanDouble();

        if ((val - (int) val) == 0) {
            System.out.println("isn't double " + (int) val);
        } else {
            System.out.println("Just a double " + val);
        }
    }

    //  Write a Java program to get whole and fractional parts from a double value.
    private static void task2() {
        task1();
    }

    //  Write a Java program to round up the result of integer division.
    private static void task1() {
        System.out.print("Input value: ");
        int val1 = scanValue();
        System.out.print("Input value: ");
        int val2 = scanValue();
        int round = val1 / val2;

        System.out.printf("Result %s & fraction %s", round, (double) val1 / val2 - round);
    }

    private static int scanValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static double scanDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
