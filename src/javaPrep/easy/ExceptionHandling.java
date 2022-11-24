package javaPrep.easy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    static void divide(int x, int y) {
        try {
            System.out.println(x / y);
        } catch (InputMismatchException | ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        ExceptionHandling.divide(x, y);
        sc.close();
    }
}
