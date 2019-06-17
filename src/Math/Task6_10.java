package Math;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task6_10 {
    public static void main(String[] args) {
//        task6();
        task7();
//        task8();
//        task9();
//        task10();
    }

    //  Write a Java program to accept a float value of number and return a rounded float value.
    private static void task10() {
        System.out.print("Input value:");
        float val = (float) scanValue();
        System.out.print("Input round:");
        int round = (int)scanValue();
        String str = "#.";
        for (int i = 0; i<round;i++){
            str+="#";
        }

        DecimalFormat fr = new DecimalFormat(str);
        System.out.println("Formatted: " + fr.format(val));

        System.out.println("Rounded: " + rounded(val));
    }

    private static float rounded(float val) {
        float ceil = (float)Math.ceil(val);
        float floor = (float)Math.floor(val);
        if((ceil-val)>(val-floor)){
            return floor;
        }else if((ceil-val)<(val-floor)){
            return ceil;
        }else {
            return 0;
        }
    }

    //  Write a Java program to convert a float value to absolute value.
    private static void task9() {
        System.out.print("Input value:");
        float val = (float) scanValue();

        System.out.println("abs val = " + absolute(val));
    }

    private static float absolute(float val) {
        return val > 0 ? val : -val;
    }

    //  Write a Java program to convert an integer value to absolute value.
    private static void task8() {
        System.out.print("Input value:");
        int val = (int) scanValue();

        System.out.println("abs val = " + absolute(val));
    }

    private static int absolute(int val) {
        return val > 0 ? val : -val;
    }

    //  Write a Java program to convert Roman number to an integer number.
    private static void task7() {
//        x
    }

    //  Write a Java program to reverse an integer number.
    private static void task6() {
        System.out.print("Enter value: ");
        int val = (int) scanValue();
        int newInt = 0, i = 0;

        while (val != 0) {
            i = val % 10;
            val /= 10;
            newInt = newInt * 10 + i;
//            System.out.println("delta:" + i + " val:" + val + " new:" + newInt);
        }
        System.out.println("result:" + newInt);
    }

    private static double scanValue() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
