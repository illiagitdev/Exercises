package basicPart1;

import java.util.Scanner;

public class Task16_20 {
    public static void main(String[] args) {
//        task16();
//        task17();
        task18();
    }

    private static void task18() {

    }

    private static void task17() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: x = ");
        String x = scan.nextLine();
        int x1 = Integer.parseInt(x, 2);
        System.out.println("Enter second value: y = ");
        String y = scan.nextLine();
        int y1 = Integer.parseInt(y, 2);
        int res = x1 + y1;
        System.out.println("Sum of two binary numbers = " + Integer.toString(res, 2));
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
