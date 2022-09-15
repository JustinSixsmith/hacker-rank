package week2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class SumResult {

    /*
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long sumXor(long n) {
        // Write your code here
        long result = 1;
        while (n != 0) {
            if (n % 2 == 0) {
                result *= 2;
            }
            n /= 2;
        }
        return result;


//        int x = 0, count = 0;
//        while (x <= n) {
//            if ((x + n) == (x ^ n)) {
//                count++;
//            }
//            x++;
//        }
//        return count;
    }

}

public class SumVsXOR {
    public static void main(String[] args) throws IOException {
        System.out.println(SumResult.sumXor(9));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        long n = Long.parseLong(bufferedReader.readLine().trim());
//
//        long result = SumResult.sumXor(n);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

