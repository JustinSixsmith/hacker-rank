package week2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class RecursiveResult {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

    public static int superDigit(String n, int k) {
        // Write your code here
        String p = n;
        while (k > 1) {
            p += n;
            k--;
        }

        while (p.length() > 1) {
            int digitSum = 0;
            for (int i = 0; i < p.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(p.charAt(i)));
                digitSum += digit;
            }
            p = String.valueOf(digitSum);
        }
        return Integer.parseInt(p);
    }
}

public class RecursiveDigitSum {
    public static void main(String[] args) throws IOException {
        System.out.println(RecursiveResult.superDigit("2", 13));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        String n = firstMultipleInput[0];
//
//        int k = Integer.parseInt(firstMultipleInput[1]);
//
//        int result = RecursiveResult.superDigit(n, k);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

