package JavaDataTypesEx;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Inout the number of minutes: ");
        Scanner scan = new Scanner(System.in);
        int minutes = scan.nextInt();
        int years, days;
        years = minutes / (365 * 24 * 60);
        days = minutes /(24 * 60) % 365;;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }

}
