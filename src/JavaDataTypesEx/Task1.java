package JavaDataTypesEx;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Input a degree in Fahrenheit: ");
        Scanner scan = new Scanner(System.in);
        double far = scan.nextDouble();
        double cel = (far - 32) * 5 / 9;
        System.out.println("\n" + far + " Degree Fahrenheit is equal to " + cel + " in Celsius");
    }
}
