package basicPart1;

import java.io.Console;
import java.util.Scanner;

public class Task41_45 {
    public static void main(String[] args) {
//        task41();
        task42();
    }


    //  Write a Java program to input and display your password.
    private static void task42() {
        char[] pass = null;
        Console con;
        if((con = System.console()) != null){
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
}
