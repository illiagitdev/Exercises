package basicPart1;

import java.util.Scanner;

public class Task6_10 {
    public static void main(String[] args) {
//        task6();
//        task7();
//        task8();
//        task9();
        task10();
    }

    private static void task10() {
        double res = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println("4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)) = " + res);
    }

    private static void task9() {
        double res = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println("((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = " + res);
    }

    private static void task8() {
        System.out.println("   J    a   v     v   a");
        System.out.println("   J   a a   v   v   a  a");
        System.out.println("J  J  aaaaa   V V   aaaaaa");
        System.out.println(" JJ  a     a   V   a      a");
    }

    private static void task7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
        int x = scan.nextInt();
        for (int i = 0; i <= 10; i++){
            System.out.println(x + " * " + i +" = " + (x * i));
        }
    }

    private static void task6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int x = scan.nextInt();
        System.out.println("Enter second value: ");
        int y = scan.nextInt();
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x mod y = " + (x % y));
    }
}
