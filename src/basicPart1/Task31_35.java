package basicPart1;

import java.util.Scanner;

public class Task31_35 {
    public static void main(String[] args) {
//        task31();
//        task32();
//        task33();
//        task34();
        task35();
    }

    //  Write a Java program to compute the area of a polygon.
    private static void task35() {
        System.out.print("Input number of the sides of poligon: ");
        int sidesNumber = scanInt();
        System.out.print("Input of the length of a side: ");
        double side = scanDouble();

        System.out.println("Area of " + sidesNumber + "-poligon is: " + poligonArea(sidesNumber, side));
    }

    private static double poligonArea(int sidesNumber, double side) {
        return (sidesNumber * side * side) / (4 * Math.tan(Math.PI / sidesNumber));
    }

    //  Write a Java program to compute the area of a hexagon.
    private static void task34() {
        System.out.print("Input the length of the side of f hexagon: ");
        double side = scanDouble();
        double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
        System.out.println("Area = " + area);
    }

    //  Write a Java program and compute the sum of the digits of an integer.
    private static void task33() {
        System.out.print("Enter value ");
        int number = scanInt();
        int res = 0;

        while (number != 0) {
            res = res + number % 10;
            number /= 10;
        }
        System.out.println("Result = " + res);
    }

    //  Write a Java program to compare two numbers.
    private static void task32() {
        System.out.print("Enter first value: ");
        int val1 = scanInt();
        System.out.print("\nEnter first value: ");
        int val2 = scanInt();

        if (val1 == val2) {
            System.out.printf("\n%d == %d", val1, val2);
        }
        if (val1 != val2) {
            System.out.printf("\n%d != %d", val1, val2);
        }
        if (val1 > val2) {
            System.out.printf("\n%d > %d", val1, val2);
        }
        if (val1 < val2) {
            System.out.printf("\n%d < %d", val1, val2);
        }
        if (val1 <= val2) {
            System.out.printf("\n%d <= %d", val1, val2);
        }
        if (val1 >= val2) {
            System.out.printf("\n%d >= %d", val1, val2);
        }
    }

    //  Write a Java program to check whether Java is installed on your computer.
    private static void task31() {
        System.out.println("Java Version " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home " + System.getProperty("java.home"));
        System.out.println("Java Vendor " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path " + System.getProperty("java.path.class"));
    }

    public static int scanInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static double scanDouble() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
