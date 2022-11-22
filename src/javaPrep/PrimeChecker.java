package javaPrep;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class PrimeChecker {

    static class Prime {
        public static void checkPrime(int num) {
            for (int i = 0; i < num; i++) {
                BigInteger bi = BigInteger.valueOf(i);
                if(bi.isProbablePrime(1)) {
                    System.out.println(bi);
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int num = sc.nextInt();
            PrimeChecker.Prime.checkPrime(num);
        }
    }
}
