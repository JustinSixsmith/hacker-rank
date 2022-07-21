package strings;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            String testCase = scan.nextLine();
            try {
                if (Objects.equals(testCase, Pattern.compile(testCase).toString())) {
                    System.out.println("Valid");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid");
            }
        }
    }
}
