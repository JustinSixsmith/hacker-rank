package javaPrep;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class PrimeChecker {

    static class Prime {
        public static void checkPrime(Integer num) {
            StringBuilder result = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                BigInteger bi = new BigInteger(String.valueOf(i));
                if (bi.isProbablePrime(1)) {
                    result.append(bi).append(" ");
                }

                System.out.println(result);
            }
            System.out.println(result + "\n");
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            Prime.checkPrime(num);
        }
        sc.close();
    }
}
