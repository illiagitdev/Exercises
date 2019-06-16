package basicPart1;

import java.util.Scanner;

public class Task65_70 {
    public static void main(String[] args) {
//        task66();
//        task67();
//        task68();
//        task69();
        task70();
    }

    //  Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
    //  The strings must not have the same length.
    private static void task70() {
        System.out.print("Input first string: ");
        String str1 = scanString();
        System.out.print("Input second string: ");
        String str2 = scanString();

        int l1 = str1.length(), l2 = str2.length();
        String result = "";
        if (l1 != l2) {
            if (l1 < l2) {
                result = str1 + str2 + str1;
            } else {
                result = str2 + str1 + str2;
            }
            System.out.println(result);
        }
    }

    //  Write a Java program to extract the first half of a string of even length.
    private static void task69() {
        System.out.print("Input a string: ");
        String line = scanString();

        String firstEvenHalf = line.substring(0, line.length() / 2);
        System.out.println(firstEvenHalf);
    }

    //  Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
    //  The length of the original string must be 3 and above.
    private static void task68() {
        System.out.print("Input string 3 and above characters: ");
        String line = scanString();
        if (line.length() < 3) {
            System.exit(-1);
        }

        String strEnd = line.substring(line.length() - 3);
        for (int i = 0; i < 4; i++) {
            System.out.print(strEnd);
        }
    }

    //  Write a Java program to insert a word in the middle of the another string.
    private static void task67() {
        System.out.print("Input string: ");
        String str = scanString();  //  Python 3.0
        String[] array = str.split("[ ]");

        System.out.print("Input word to insert: ");
        String insert = scanString();

        String res = "";
        for (int i = 0; i < array.length; i++) {
            if (array.length / 2 == i) {
                res += insert + " ";
            }
            res += array[i] + " ";
        }

        System.out.println(res);
    }

    private static String scanString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //  Write a Java program to compute the sum of the first 100 prime numbers.
    private static void task66() {
        int sum = 0;

        sum = isPrime(1, 100);
        System.out.println(sum);
    }

    public static int isPrime(int start, int end) {
        int result = 0, count = 0;
        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                result += i;
                System.out.println(i);
            }
            count = 0;
        }
        return result;
    }
}
