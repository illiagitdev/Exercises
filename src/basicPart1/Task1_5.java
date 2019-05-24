package basicPart1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    private static void task5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int x = scan.nextInt();
        System.out.println("Enter second value: ");
        int y = scan.nextInt();
        int res = x * y;
        System.out.println("Result: " + res);
    }

    private static void task4() {
        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));
        System.out.println("(55+9) % 9 = " + ((55+9) % 9));
        System.out.println("20 + -3*5 / 8 = " + (20 + -3*5 / 8 ));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
    }

    private static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int x = scan.nextInt();
        System.out.println("Enter second value: ");
        int y = scan.nextInt();
        int res = x / y;
        System.out.println("Result: " + res);
    }

    private static void task2() {
        System.out.println("Test Data:\n74 + 36");
        System.out.println(74 + 36);
    }

    private static void task1() {
        System.out.println("Hello");
        System.out.println("Alexandr Abramov");
    }
}
