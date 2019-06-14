package basicPart1;

import java.util.Scanner;

public class Task56_60 {
    public static void main(String[] args) {
//        task56();
//        task57();
//        task58();
//        task59();
        task60();
    }

    //  Write a Java program to find the penultimate (next to last) word of a sentence.
    private static void task60() {
        System.out.print("Input the sentence: ");
        String str = scanString();
        Scanner scan = new Scanner(System.in);

        //  Input a String: The quick brown fox jumps over the lazy dog.
        String[] word = str.split("[ ]");
        System.out.println("The penultinate word: " + word[word.length-2]);
    }

    //  Write a Java program to convert a given string into lowercase
    private static void task59() {
        String str = null;
//        System.out.print("Input the sentence: ");
//        str = scanString();

        str="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println(str);

        System.out.println(str.toLowerCase());
    }

    //  Write a Java program to capitalize the first letter of each word in a sentence.
    private static void task58() {
        String str = null;
//        System.out.print("Input the sentence: ");
//        str = scanString();

        str="the quick brown fox jumps over the lazy dog.";
        System.out.println(str);

        char[] line;
        line=str.toCharArray();

        for (int i = 0;i<str.length();i++){
            if(i<str.length()&&line[i]==' ' &&line[i+1]!=' '){
                line[i+1]=Character.toUpperCase(line[i+1]);
            }
        }
        if (line[0]!=' ') {
            line[0]=Character.toUpperCase(line[0]);
        }
        for (char x:line
             ) {
            System.out.print(x);

        }
    }

    //  Write a Java program to accepts an integer and count the factors of the number
    private static void task57() {
        System.out.print("Input the number: ");
        int val1 = Integer.parseInt(scanString());
        int count = 0;

        for (int i = 1; i <= (int) Math.sqrt(val1); i++) {
            if ((val1 % i == 0) && i * i != val1) {
                count += 2;
            } else if (i * i == val1) {
                count++;
            }
        }
        System.out.println(count);
    }

    //  Write a Java program to find the number of integers within the range of two specified numbers and that are divisible by another number.
    private static void task56() {
        System.out.print("Input the first number: ");
        int val1 = Integer.parseInt(scanString());
        System.out.print("Input the second number: ");
        int val2 = Math.abs(Integer.parseInt(scanString()));
        System.out.print("Input the divider number: ");
        int div = Integer.parseInt(scanString());
        int count = 0;

        if (val1 < val2 && (div < val2)) {
            for (; val1 <= val2; val1++) {
                if (val1 % div == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    private static String scanString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
