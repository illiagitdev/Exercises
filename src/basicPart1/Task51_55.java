package basicPart1;

import java.util.Scanner;

public class Task51_55 {
    public static void main(String[] args) {
//        task51();
//        task52();
//        task53();
//        task54();
        task55();
    }

    //  Write a Java program to convert seconds to hour, minute and seconds.
    private static void task55() {
        System.out.print("Input seconda: ");
        int seconds = Integer.parseInt(scanString());
        int sec = seconds %60;
        int min=seconds/60%60;
        int h=seconds/60/60%24;
        if (seconds>(60*60*24)){
            int days = seconds/60/60/24;
            System.out.printf("%d day(s) %d:%d:%d", days,h,min,sec);
        } else {
            System.out.printf("\n%d:%d:%d",h,min,sec);
        }
    }

    //  Write a Java program that accepts three integers from the user and return true if two or more of them
    //  (integers ) have the same rightmost digit. The integers are non-negative.
    private static void task54() {
        System.out.print("Input the first number: ");
        int val1 = Integer.parseInt(scanString());
        System.out.print("Input the second number: ");
        int val2 = Integer.parseInt(scanString());
        System.out.print("Input the third number: ");
        int val3 = Integer.parseInt(scanString());

        if(val1>=0&&val2>=0&&val3>=0) {
            boolean flag = (val1 % 10 == val2 % 10) || (val2 % 10 == val3 % 10) || (val3 % 10 == val1 % 10);
            System.out.println(flag);
        }else {
            System.out.println(false);
        }
    }

    //  Write a Java program that accepts three integers from the user and return true if the second number is greater
    //  than first number and third number is greater than second number. If "abc" is true second number does not need
    //  to be greater than first number.
    private static void task53() {
        System.out.print("Input the first number: ");
        int val1 = Integer.parseInt(scanString());
        System.out.print("Input the second number: ");
        int val2 = Integer.parseInt(scanString());
        System.out.print("Input the third number: ");
        int val3 = Integer.parseInt(scanString());

        if ((val1 < val3 && val2 < val3) || val2 < val3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //  Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
    private static void task52() {
        System.out.print("Input the first number: ");
        int val1 = Integer.parseInt(scanString());
        System.out.print("Input the second number: ");
        int val2 = Integer.parseInt(scanString());
        System.out.print("Input the third number: ");
        int val3 = Integer.parseInt(scanString());

        boolean flag = ((val1 + val2) == val3) || ((val2 + val3) == val1) || ((val3 + val1) == val2);
        System.out.println(flag);
    }

    //  Write a Java program to convert a string to an integer in Java.
    private static void task51() {
        System.out.print("Input a number(string): ");
        String strNumber = scanString();

        try {
            int intNumber = Integer.parseInt(strNumber);
            System.out.println("The integer value is: " + intNumber);
        } catch (Exception e) {
            throw new NumberFormatException("Not number");
        }
    }

    private static String scanString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
