package basicPart1;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.forEach;
import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Task36_40 {
    public final static double ERTH_RADIUS = 6371.01; //km

    public static void main(String[] args) {
//        task36();
//        task37();
//        task38();
        task39();
    }

    //  Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
    private static void task39() {
        int[] setOfNumbers = {1, 2, 3, 4};
        int count = 0;

        String result = generateValue(setOfNumbers);

        System.out.println();
    }

    private static String generateValue(int[] setOfNumbers) {
        int i = 0, j = 0, k = 0;

        String result = setOfNumbers[i] + "" + setOfNumbers[j] + "" + setOfNumbers[k];
        return result;
    }

    //  Write a Java program to count the letters, spaces, numbers and other characters of an input string.
    private static void task38() {
        System.out.print("Enter line: ");
        char[] array = scanString().toCharArray();

        int letters = 0, numbers = 0, spaces = 0, other = 0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                letters++;
            } else if (Character.isSpaceChar(array[i])) {
                spaces++;
            } else if (Character.isDigit(array[i])) {
                numbers++;
            } else {
                other++;
            }
        }

        System.out.println("letters: " + letters);//[65-90],[97-122]
        System.out.println("spaces: " + spaces);//[32]
        System.out.println("numbers: " + numbers);//[48-57]
        System.out.println("other characters: " + other);
    }


    //  Write a Java program to reverse a string.
    public static void task37() {
        System.out.print("Input a string: ");
        String str = scanString();
        System.out.println("Reverse string: " + reverse(str));
    }

    public static String reverse(String str) {
        int lineLenth = str.length();
        String strRev = "";
        for (int i = 0; i < lineLenth; i++) {
            strRev = str.charAt(i) + strRev;
        }
        return strRev;
    }

    private static String scanString() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    //  Write a Java program to compute the distance between two points on the surface of earth.
    private static void task36() {
        System.out.print("Input the latitude of coordinate 1: ");
        double latit1 = scanNumber();
        System.out.print("Input the longitude of coordinate 1: ");
        double longit1 = scanNumber();
        System.out.print("Input the latitude of coordinate 2: ");
        double latit2 = scanNumber();
        System.out.print("Input the longitude of coordinate 2: ");
        double longit2 = scanNumber();

        System.out.println("The distance between two points is: " + distance(latit1, longit1, latit2, longit2) + " km.");
    }

    public static double distance(double latitude1, double longitude1, double latitude2, double longitude2) {
        double res = 0;
        res = ERTH_RADIUS * Math.acos(Math.sin(latitude1 * Math.PI / 180) * Math.sin(latitude2 * Math.PI / 180) +
                Math.cos(latitude1 * Math.PI / 180) * Math.cos(latitude2 * Math.PI / 180) * Math.cos((longitude2 - longitude1) * Math.PI / 180));
        return res;
    }

    public static double scanNumber() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
