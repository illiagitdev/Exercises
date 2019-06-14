package basicPart1;

import java.util.Scanner;

public class Task61_65 {
    public static void main(String[] args) {
//        task61();
//        task62();
//        task63();
//        task64();
        task65();
    }

    //  Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
    private static void task65() {
        System.out.print("Input first value: ");
        int val_1 = scanInt();
        System.out.print("Input second value: ");
        int val_2 = scanInt();

        System.out.println("a % b = " + (val_1 - (val_1/val_2)*val_2));
    }

    //  Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common
    //  digit in both numbers.
    private static void task64() {
        System.out.print("Input first value: ");
        int val_1 = getValueInRange();
        System.out.print("Input second value: ");
        int val_2 = getValueInRange();

        boolean flag=false;
        if(val_1%10==val_2%10||val_1%10==val_2/10){
            flag=true;
        }else if(val_1/10==val_2%10||val_1/10==val_2/10){
            flag=true;
        }

        System.out.println(flag);
    }

    private static int getValueInRange() {
        int result =0;
        do{
            result=scanInt();
        }while (result<=25||result>=75);
        return result;
    }

    //  Write a Java program that accepts two integer values from the user and return the larger values. However if
    //  the two values are the same, return 0 and return the smaller value if the two values have the same remainder
    //  when divided by 6.
    private static void task63() {
        System.out.print("Input first value: ");
        int val_1 = scanInt();
        System.out.print("Input second value: ");
        int val_2 = scanInt();
        int result=0;
        if(val_1==val_2){
            result=0;
        }else if(val_1%6==val_2%6){
            result=val_1<val_2?val_1:val_2;
        }else {
            result=val_1>val_2?val_1:val_2;
        }
        System.out.println(result);
    }

    //  Write a Java program that accepts three integer values and return true if one of them is 20 or more and less
    //  than the substractions of others.
    private static void task62() {
        System.out.print("Input first value: ");
        int val_1 = scanInt();
        System.out.print("Input second value: ");
        int val_2 = scanInt();
        System.out.print("Input third value: ");
        int val_3 = scanInt();

        boolean flag = false;
        if(val_1>=20||val_2>=20||val_3>=20) {
            flag=(Math.abs(val_1-val_2)>=20)||(Math.abs(val_3-val_2)>=20)||(Math.abs(val_1-val_3)>=20);
            System.out.println(flag);
        }else {
            System.out.println(flag);
        }
    }

    //  Write a Java program to reverse a word.
    private static void task61() {
        System.out.print("Input a word: ");
        String str = scanLine();
        str = str.trim();
        char[] word = str.toCharArray();

        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += word[i];
        }
        System.out.print("Reversrd: " + res.trim());
    }

    private static String scanLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
