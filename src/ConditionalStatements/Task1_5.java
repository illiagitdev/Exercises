package ConditionalStatements;

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    //  Write a Java program that keeps a number from the user and generates
    //  an integer between 1 and 7 and displays the name of the weekday.
    private static void task5() {
        System.out.print("Enter day number: ");
        Scanner scan = new Scanner(System.in);
        int dayNumber = scan.nextInt();
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println(weekDays[dayNumber - 1]);
        } else {
            System.out.println("No such day in a week!");
        }
    }

    //  Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
    //  Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number
    //  is less than 1, or "large" if it exceeds 1,000,000.
    private static void task4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        double value;
        value = scan.nextDouble();

        if (value < 0) {
            if (Math.abs(value) < 1) {
                System.out.println("small negative");
            } else if (Math.abs(value) > 1_000_000) {
                System.out.println("large negative");
            } else {
                System.out.println("negative");
            }
        }


        if (value > 0) {
            if (value < 1) {
                System.out.println("small positive");
            } else if (value > 1_000_000) {
                System.out.println("large positive");
            } else {
                System.out.println("positive");
            }
        } else if (value == 0) {
            System.out.println((int) value);
        }
    }

    //  Take three numbers from the user and print the greatest number.
    private static void task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Get the greatest!");
        System.out.println("Enter a:");
        int a = scan.nextInt();
        System.out.println("Enter b:");
        int b = scan.nextInt();
        System.out.println("Enter c:");
        int c = scan.nextInt();

        if (a == b && a == c) {
            System.out.println("Numbers are even");
        } else {
            if (a > b) {
                if (a > c) {
                    System.out.println("greatest " + a);
                } else
                    System.out.println("greatest " + c);
            } else if (b > c) {
                System.out.println("greatest " + b);
            } else
                System.out.println("greatest " + c);
        }
    }

    //  Write a Java program to solve quadratic equations (use if, else if and else).
    private static void task2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter a:");
        double a = scan.nextDouble();
        System.out.println("Enter b:");
        double b = scan.nextDouble();
        System.out.println("Enter c:");
        double c = scan.nextDouble();
        double checkSum = b * b - 4 * a * c;
        double x1, x2;
        if (checkSum >= 0) {
            x1 = (-b + Math.sqrt(checkSum)) / (2 * a);
            System.out.println("x1 = " + x1);
            x2 = (-b - Math.sqrt(checkSum)) / (2 * a);
            System.out.println("x1 = " + x2);
        } else if (checkSum == 0) {
            x1 = -b / (2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("solution in imaginary space)");
        }
    }

    // Write a Java program to get a number from the user and print whether it is positive or negative
    private static void task1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int value = scan.nextInt();
        if (value < 0) {
            System.out.println("The number is negative");
        } else if (value > 0) {
            System.out.println("The number is positive");
        } else
            System.out.println("The number is zero");

    }
}

