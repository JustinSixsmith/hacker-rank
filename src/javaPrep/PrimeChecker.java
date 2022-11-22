package javaPrep;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class PrimeChecker {

    static class Prime {
        public static void checkPrime(Integer num) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < num; i++) {
                BigInteger bi = new BigInteger(String.valueOf(i));
                if (bi.isProbablePrime(1)) {
                    result.append(bi).append(" ");
                }
            }
            BigInteger big = new BigInteger(String.valueOf(num));
            if (big.isProbablePrime(1)) {
                result.append(big);
                System.out.println(result + "\n");
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeChecker.Prime.checkPrime(num);
    }
}
