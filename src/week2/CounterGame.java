package week2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class CounterResult {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
        // Write your code here
        int totalPlays = 0;

        while (n >= 1) {
            if ((n & (n - 1)) != 0) {
                n = n - Long.highestOneBit(n);
            } else {
                n >>= 1;
                totalPlays++;
            }
        }
        return totalPlays % 2 == 0 ? "Louise" : "Richard";
    }
}

public class CounterGame {
    public static void main(String[] args) throws IOException {
        System.out.println(CounterResult.counterGame(64));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//        for (int tItr = 0; tItr < t; tItr++) {
//            long n = Long.parseLong(bufferedReader.readLine().trim());
//
//            String result = CounterResult.counterGame(n);
//
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//        }
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

