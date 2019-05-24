package JavaDataTypesEx;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Input an integer between 0 to 1000: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int res = number %  10 + (number / 10) % 10 + number / 100 + number / 1000;
        System.out.println("The sum of all digits in " + number + " is " + res);
    }
}
