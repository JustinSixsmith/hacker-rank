package strings;

import java.util.Locale;
import java.util.Scanner;

public class StringsIntroduction {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();
        String upperA = A.toUpperCase();
        String upperB = B.toUpperCase();
        char firstA = upperA.charAt(0);
        char firstB = upperB.charAt(0);
        String remA = A.substring(1);
        String remB = B.substring(1);
        int sumLength = A.length() + B.length();
        String quote = firstA + remA + " " + firstB + remB;
        boolean lexi = firstB <= firstA;

        System.out.println(sumLength);
        if (lexi) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(quote);

        scan.close();
    }
}
