package basicPart1;

import java.util.Scanner;

public class Task71_75 {
    public static void main(String[] args) {
//        task71();
//        task72();
//        task73();
//        task74();
        task75();
    }

    //  Write a Java program to test if the first and the last element of an array of integers are same.
    //  The length of the array must be greater than or equal to 2
    private static void task75() {
        int[] array = {10, 54, 1, 87, 10, 2, 10, 1};

        int lentgth = array.length;
        if (lentgth >= 2 && array[0] == array[lentgth - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //  Write a Java program to test if 10 appears as either the first or last element of an array of integers.
    //  The length of the array must be greater than or equal to 2.
    private static void task74() {
        int[] array = {10, 54, 1, 87, 10, 2, 10};

        int lentgth = array.length;
        if (lentgth >= 2 && array[0] == 10 || array[lentgth - 1] == 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    //  Write a Java program to create a new string taking first and last characters from two given strings.
    //  If the length of either string is 0 use "#" for missing character.
    private static void task73() {
        String str1 = "Python";
        String str2 = "";
        String res = (str1.length() > 1 ? str1.substring(0, 1) : "#") + (str2.length() > 1 ? str2.substring(0, 1) : "#");
        System.out.println(res);
    }

    // Write a Java program to create a new string taking first three characters from a given string. If the length
    // of the given string is less than 3 use "#" as substitute characters.
    private static void task72() {
        System.out.print("Input the string: ");
        String str1 = scanString();

        if (str1.length() <= 3) {
            for (int i = 0; i < str1.length() && i < 3; i++) {
                str1 = str1.replace(str1.charAt(i), '#');
            }
        } else {
            str1 = str1.substring(0, 3);
        }
        System.out.println(str1);
    }

    //  Write a Java program to create the concatenation of the two strings except removing the first character of
    //  each string. The length of the strings must be 1 and above.
    private static void task71() {
        System.out.print("Input the string: ");
        String str1 = scanString();
        System.out.print("Input the string: ");
        String str2 = scanString();

        if (str1.length() >= 1 && str2.length() >= 1) {
            System.out.println(str1.substring(1) + str2.substring(1));
        }
    }

    private static String scanString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
