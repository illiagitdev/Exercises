package basicPart1;

import java.util.Scanner;

public class Task56_60 {
    public static void main(String[] args) {
//        task56();
        task57();
    }

    //  Write a Java program to accepts an integer and count the factors of the number
    private static void task57() {
        x
    }

    //  Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.
    private static void task56() {
        System.out.print("Input the first number: ");
        int val1 = Integer.parseInt(scanString());
        System.out.print("Input the second number: ");
        int val2 = Math.abs(Integer.parseInt(scanString()));
        System.out.print("Input the divider number: ");
        int div = Integer.parseInt(scanString());
        int count = 0;

        if (val1 < val2 && (div < val2)){
            for (;val1<=val2;val1++){
                if(val1%div==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static String scanString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
