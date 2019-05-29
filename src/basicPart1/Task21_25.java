package basicPart1;

import java.util.Scanner;

public class Task21_25 {
    public static void main(String[] args) {
//        task21();
        task22();
    }

    //  Write a Java program to convert a binary number to decimal number
    private static void task22() {
    }

    //Write a Java program to convert a decimal number to octal number
    private static void task21() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int number = scan.nextInt();
        int[] octa = new int[15];
        int rem = 0, i = 0;

        while(number>0){
            octa[i++]=number%8;
            number/=8;
        }
        i--;
        System.out.print("Octal number: ");
        for (;i>=0;i--){
            System.out.print(octa[i]);
        }
    }
}
