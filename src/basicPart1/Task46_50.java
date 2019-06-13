package basicPart1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task46_50 {
    public static void main(String[] args) {
//        task46();
//        task47();
//        task48();
//        task49();
        task50();
    }

    //  Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both
    private static void task50() {
        d
    }

    //  Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
    private static void task49() {
        System.out.print("Enter number: ");
        int number = (int)ScanNumber();
        if(number%2!=0){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }

    private static double ScanNumber() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    //  Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
    private static void task48() {
        for (int i = 0; i<=99; i++){
            if(i%2!=0) {
                System.out.println(i);
            }
        }
    }

    //  Write a Java program to display the current date time in specific format.
    private static void task47() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss.SSS");
        String str = format.format(new Date());
//        Date time = format.parse(str)
        System.out.println("Now " + str);
    }

    //  Write a Java program to display the system time.
    private static void task46() {
        Date currentDate = new Date();
        System.out.println("Current Date Time: " + currentDate.toString());
        System.out.println("Current Date Time: " + currentDate.getTime());
//        System.out.format("Current Date Time: %tc%n\n" + System.currentTimeMillis());
    }
}
