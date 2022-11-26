package javaPrep.easy;

import java.util.Scanner;
class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    long power(int x, int y) {

    }

}

public class MoreHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
