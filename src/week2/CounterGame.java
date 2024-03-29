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
        int player = 0; //  0 = Louise , 1 = Richard

        if (n == 1) return "Louise";

        while (n > 1) {
            String binaryStr = Long.toBinaryString(n);
            String subString = binaryStr.substring(1);
            if (subString.contains("1")) {
                binaryStr = subString.substring(subString.indexOf("1"));
                n = Long.parseLong(binaryStr, 2);
            } else {
                n = n / 2;
            }
            if (n == 1 && player == 0)
                return "Louise";
            else if (n == 1)
                return "Richard";
            else {
                player = (player == 0) ? 1 : 0;
            }
        }
        return "";
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

