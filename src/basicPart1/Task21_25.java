package basicPart1;

import java.util.Scanner;

public class Task21_25 {
    public static void main(String[] args) {
//        task21();
//        task22();
//        task23();
        task24();
    }

    private static void task24() {

    }

    //Write a Java program to convert a binary number to hexadecimal number
    private static void task23() {
        System.out.print("Enter binary number: ");
        long binaryInput = (long)scan();
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int tetrade = 0, index = 1;
        String hexaOutput = "";
        while (binaryInput!=0){
            for (int i = 0; i<4;i++){
                if(binaryInput > 0) {
                    tetrade = tetrade + (int)(binaryInput % 10) * index;
                    index *=2;
                    binaryInput /= 10;
                    //System.out.println("index:" + index + " number: " + binaryInput);
                }
            }
            System.out.println(tetrade);
            hexaOutput = hexa[tetrade] + hexaOutput;
            tetrade = 0;
            index = 1;
        }

        System.out.println("Result: " + hexaOutput);
    }

    //  Write a Java program to convert a binary number to decimal number
    private static void task22() {
        System.out.print("Enter binary number: ");
        long input = (long) scan();
        int i = 1, inputDec = 0;
        while (input > 0) {
            inputDec = inputDec + (int)(input % 10) * i;
            i *=2;
            input /= 10;
        }
        System.out.println("Result: " + inputDec);
    }

    //Write a Java program to convert a decimal number to octal number
    private static void task21() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int number = scan.nextInt();
        int[] octa = new int[15];
        int rem = 0, i = 0;

        while (number > 0) {
            octa[i++] = number % 8;
            number /= 8;
        }
        i--;
        System.out.print("Octal number: ");
        for (; i >= 0; i--) {
            System.out.print(octa[i]);
        }
    }

    public static double scan() {
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}

