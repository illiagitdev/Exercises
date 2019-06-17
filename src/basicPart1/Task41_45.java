package basicPart1;

import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Task41_45 {
    public static void main(String[] args) {
//        task41();
        task42(); // todo: no new console created
//        task43();
//        task44();
//        task45();
    }

    //  Write a Java program to find the size of a specified file.
    private static void task45() {
        String path1, path2;
        path1 = "d:\\common\\java\\w3resource\\src\\basicPart1\\test.txt";
        path2 = "d:\\common\\java\\w3resource\\src\\basicPart1\\test-text.txt";
        File file = new File("test.txt");

        File file2 = new File("d:\\common\\java\\w3resource\\src\\basicPart1\\test-text.txt");
        long size1 = file.length();
        long size2 = file2.length();

        System.out.println("d:\\common\\java\\w3resource\\src\\basicPart1\\test.txt " + size1 + " bites");
        System.out.println("d:\\common\\java\\w3resource\\src\\basicPart1\\test-text.txt " + size2 + " bites");
    }

    //  Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
    private static void task44() {
        System.out.print("Enter value: ");
        int n = scanInt();

        String str = n + " + " + n + "" + n + " + " + n + "" + n + "" + n;
        System.out.println("\n" + str);
        System.out.printf("%d + %d%d + %d%d%d", n, n, n, n, n, n);
    }

    //   Write a Java program to print the following string in a specific format (see the output).
    private static void task43() {
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("\tHow I wonder what you are!");
        System.out.println("\t\tUp above the world so high,");
        System.out.println("\t\tLike a diamond in the sky!");
        System.out.println("Twinkle, twinkle, little star,");
        System.out.println("How I wonder what you are.");
    }


//      Write a Java program to input and display your password.
    private static void task42() {
        char[] pass = null;
        Console con = System.console();
        if(con != null){
            try {
                pass = con.readPassword("Enter your password:");
                System.out.println("Your password is " + new String(pass));
            }
            finally {
                if(pass!=null){
                    System.out.println("Yur pass -"+pass);
                }
            }
        }else {
            throw new RuntimeException("Can't get password...No console");
        }

    }

    //  Write a Java program to print the ascii value of a given character.
    private static void task41() {
        System.out.println("Enter character: ");
        char ch = scanStr().charAt(0);

        System.out.println("ASCII value of " + ch + " is " + (int)ch);
    }

    private static String scanStr() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static int scanInt(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
