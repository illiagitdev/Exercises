package basicPart1;

import java.util.Scanner;

public class Task11_15 {
    public static void main(String[] args) {
//        task11();
//        task12();
//        task13();
//        task14();
        task15();
    }

    private static void task15() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: x = ");
        double x = scan.nextDouble();
        System.out.println("Enter second value: y = ");
        double y = scan.nextDouble();
        double z = x;
        x = y;
        y = z;
        System.out.println("SWAP!");
        System.out.println("x = " + x + " and y = " + y);
    }

    private static void task14() {
        System.out.println("* * * * * * ====================================");
        System.out.println(" * * * * *  ====================================");
        System.out.println("* * * * * * ====================================");
        System.out.println(" * * * * *  ====================================");
        System.out.println("* * * * * * ====================================");
        System.out.println(" * * * * *  ====================================");
        System.out.println("* * * * * * ====================================");
        System.out.println(" * * * * *  ====================================");
        System.out.println("* * * * * * ====================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");
    }

    private static void task13() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\tRectangle");
        System.out.println("Enter width: ");
        double l = scan.nextDouble();
        System.out.println("Enter heights: ");
        double h = scan.nextDouble();
        double area, per;
        per = 2 * (l + h);
        System.out.println("Perimeter = " + per);
        area = l * h;
        System.out.println("Area = " + area);
    }

    private static void task12() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first value: ");
        double x = scan.nextDouble();
        System.out.println("Enter second value: ");
        double y = scan.nextDouble();
        System.out.println("Enter third value: ");
        double z = scan.nextDouble();
        System.out.print("Avarege of " + x + ", " + y + ", " + z + " is: ");
        double res = (x + y + z) / 3;
        System.out.println(res);
    }

    private static void task11() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = scan.nextDouble();
        System.out.println("Perimetr is = " + (2 * Math.PI * r));
        System.out.println("Area is = " + (Math.PI * Math.pow(r, 2)));
    }
}
