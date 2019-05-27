package basicPart1;

import java.util.Scanner;

public class Task16_20 {
    public static void main(String[] args) {
//        task16();
//        task17();
        task17a();
        task18();
    }

    private static void task17a() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: x = ");
        long x = scan.nextLong();
        System.out.println("Enter second value: y = ");
        long y = scan.nextLong();
        int res = 0, i = 0;
        int[] collector = new int[20];
    }

    // binary multiplication
    private static void task18() {

    }

    //binary addition
    private static void task17() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: x = ");
        long x = scan.nextLong();
        System.out.println("Enter second value: y = ");
        long y = scan.nextLong();
        int res = 0, i = 0;
        int[] collector = new int[20];

        //19 bit is max for this case
        int rem = 0;
        // bad and inefficient solution? but it works - addition
        while (x >= 0 || y >= 0) {
            if (x % 2 == y % 2) {
                if (x % 2 == 1) {
                    collector[i] = rem;
                    rem = 1;
                } else {
                    collector[i] = rem;
                    rem = 0;
                }
            }else {
                if(rem == 0){
                    collector[i] = 1;
                    rem = 0;
                }else if (rem == 1){
                    collector[i] = 0;
                    rem = 1;
                }
            }
            x /= 10;
            y /= 10;
            i++;
            if(i == 20)
                break;
        }

        for (int z : collector
        ) {
            System.out.print(z);
        }
        System.out.println("\nSum of two binary numbers = " + (res));

        // show number = works
        for (int j = 19; j>= 0; j--){
            if(collector[j] != 0){
                for ( ; j >= 0; j--){
                    System.out.print(collector[j]);
                }
            }
        }
    }

    private static void task16() {
        char s = 9900;
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| " + s + "  " + s + " |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
}
