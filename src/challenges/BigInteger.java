package challenges;

import java.io.*;
import java.util.*;

public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        java.math.BigInteger a = scanner.nextBigInteger();
        java.math.BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
