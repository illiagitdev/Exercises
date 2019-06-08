package basicPart1;

import java.util.Scanner;

public class Task26_30 {
    public static void main(String[] args) {
//        task26();
//        task27();
//        task28();
//        task29();
        task30();
    }

    //  Write a Java program to convert a hexadecimal to a octal number.
    private static void task30() {
        Base octa = new Base();
        System.out.print("Enter Hexa value: ");
        String hexaInput = scanString();
        for (int q: octa.hexaToOcta(hexaInput)
             ) {
            System.out.print(q);
        }
    }

    //  Write a Java program to convert a hexadecimal to a binary number.
    private static void task29() {
        Base hexToBin = new Base();
        System.out.print("Enter Hexa value to convert: ");
        String str = scanString();
        int[] array = hexToBin.hexaToBinary(str);

        for (int q: array
             ) {
            System.out.print(q);
        }
    }

    //  Write a Java program to convert a hexadecimal to a decimal number.
    private static void task28() {
        Base hexToDec = new Base();
        System.out.print("Enter Hexa value to convert: ");
        String str = scanString();
        System.out.println(hexToDec.hexaToDecimal(str));
    }

    //  Write a Java program to convert a octal number to a hexadecimal number.
    private static void task27() {
        System.out.print("Enter OCTAL number: ");
        int octalInput = (int) scanNumber();
        Base overstep = new Base();
        String hexaOutput = overstep.binaryToHexa(overstep.decimalToBinary(overstep.octaToDecimal(octalInput)));
        System.out.println("Hexa number is: " + hexaOutput);
    }

    //  Write a Java program to convert a octal number to a binary number.
    private static void task26() {
        System.out.print("Enter OCTAL number: ");
        int octalInput = (int) scanNumber();
        int[] binaryNumber = new int[32];
        int count = 0, someIndex = 0, rem = 0;

        while (octalInput != 0) {
            someIndex = octalInput % 10;
            for (int i = 0; i < 3; i++) {
                    binaryNumber[count++] = (someIndex % 2 + rem) % 2;
                    rem = (someIndex % 2 + rem) / 2;
//                    System.out.println(binaryNumber[count - 1]);
                    someIndex /= 2;
            }
            rem = 0;
            octalInput /= 10;
        }

        System.out.print("Binafy form: ");
        for (;count >= 0; count--){
            System.out.print(binaryNumber[count]);
        }
    }

    public static double scanNumber() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static String scanString(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
