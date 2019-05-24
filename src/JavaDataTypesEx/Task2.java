package JavaDataTypesEx;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Input a value for inch: ");
        Scanner scan = new Scanner(System.in);
        double inches = scan.nextDouble();
        double meters = inches *0.0254;
        System.out.println(inches + " inches is " + meters + " meters");
    }
}
