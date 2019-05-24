package JavaDataTypesEx;

import java.util.Date;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Input the timezone offset to GMT: ");
        Scanner scan = new Scanner(System.in);
        int timeOffset = scan.nextInt();
        Date timeCurrent = new Date();
        int time = ((int)timeCurrent.getTime()) / 60 / 60;
        System.out.println(time);
        System.out.println("Current time is ");
    }
}
