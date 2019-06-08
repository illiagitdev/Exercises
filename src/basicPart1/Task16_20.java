package basicPart1;

import java.util.Scanner;

public class Task16_20 {
    public static void main(String[] args) {
//        task16();
//        task17();
//        task17a();
        task18();
//        task19();
//        task20();
    }

    private static void task20() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: x = ");
        int x = scan.nextInt();
        int z = x;
        int i = 0;
        int[] res = new int[20];

        while (z != 0) {
            res[i++] = z % 16;
            z /= 16;
        }

        System.out.println("x = " + x + " result HEX:");

        char[] resChar = new char[i];

        i--;
        for (int j = 0; i >= 0; i--, j++) {
            if (res[i] < 10) {
                resChar[j] = (char) (res[i] + 48);
            } else {
                switch (res[i]) {
                    case 10: {
                        resChar[j] = 'A';
                        break;
                    }
                    case 11: {
                        resChar[j] = 'B';
                        break;
                    }
                    case 12: {
                        resChar[j] = 'C';
                        break;
                    }
                    case 13: {
                        resChar[j] = 'D';
                        break;
                    }
                    case 14: {
                        resChar[j] = 'E';
                        break;
                    }
                    case 15: {
                        resChar[j] = 'F';
                        break;
                    }
                }
            }
        }

        for (char c : resChar
        ) {
            System.out.print(c);
        }
        // or easy solution
        /*int dec_num, rem;
        String hexdec_num="";

        *//* hexadecimal number digits *//*

        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner in = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();

        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");*/
    }

    private static void task19() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: x = ");
        int x = scan.nextInt();
        int z = x;
        int i = 0;
        int[] res = new int[20];

        while (z != 0) {
            res[i++] = z % 2;
            z /= 2;
        }

        System.out.println("result:");

        for (i--; i >= 0; i--) {
            System.out.print(res[i]);
        }
    }

    private static void task17a() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: x = ");
        long x = scan.nextLong();
        System.out.println("Enter second value: y = ");
        long y = scan.nextLong();
        int i = 0, rem = 0;
        int[] collector = new int[20];

        while (x != 0 || y != 0) {
            collector[i++] = (int) ((x % 10 + y % 10 + rem) % 2);
            rem = (int) ((x % 10 + y % 10 + rem) / 2);
            x /= 10;
            y /= 10;
        }
        if (rem != 0) {
            collector[i++] = rem;
        }
        i--;

        while (i >= 0) {
            System.out.print(collector[i--]);
        }
    }

    // Write a Java program to multiply two binary numbers.
    private static void task18() {
        System.out.print("Enter first value: x = ");
        long x = (long) scan();
        System.out.print("Enter second value: y = ");
        long y = (long) scan();
        long sum = 0;
        int i = 1;
        int step = 0;

        while (y != 0){
            if((y % 10) != 0){
                if(sum != 0){
                    sum = addBinary(sum, x * i);
                }else {
                    sum = x * i;
                }
            }else {}

            System.out.println("sum:" + sum);
            y /= 10;
            i *= 10;
        }



//        System.out.println(addBinary(1101, 110));
        //  show number
        System.out.print(sum);
    }

    /**
     * Working Binary addition!!!
     *
     * @param x
     * @param y
     * @return
     */
    private static long addBinary(long x, long y) {
        int index = 0, rem = 0;
        int[] collection = new int[20];
        long result = 0;

        while (y > 0 || x > 0) {
            collection[index++] = (int) ((x % 10 + y % 10 + rem) % 2);
            rem = (int) ((x % 10 + y % 10 + rem) / 2);
            x /= 10;
            y /= 10;
        }
        if (rem != 0) {
            collection[index++] = rem;
        }

        for (; 0 <= index; ) {
            result = result * 10 + collection[index--];
        }
        return result;
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
            } else {
                if (rem == 0) {
                    collector[i] = 1;
                    rem = 0;
                } else if (rem == 1) {
                    collector[i] = 0;
                    rem = 1;
                }
            }
            x /= 10;
            y /= 10;
            i++;
            if (i == 20)
                break;
        }

        for (int z : collector
        ) {
            System.out.print(z);
        }
        System.out.println("\nSum of two binary numbers = " + (res));

        // show number = works
        for (int j = 19; j >= 0; j--) {
            if (collector[j] != 0) {
                for (; j >= 0; j--) {
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

    public static double scan() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
