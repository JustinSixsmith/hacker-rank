package week1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.lang.Long.parseLong;

class FlipResult {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
        // Write your code here
        String oldBinary = Long.toBinaryString(n);
        while(oldBinary.length() < 32) {
            oldBinary = "0" + oldBinary;
        }
        StringBuilder newBinary = new StringBuilder();
        for (int i = 0; i <oldBinary.length(); i++) {
            if (oldBinary.charAt(i) == '1') {
                newBinary.append("0");
            } else if (oldBinary.charAt(i) == '0') {
                newBinary.append("1");
            }
        }
        return Long.parseLong(String.valueOf(newBinary), 2);
    }
}

public class FlippingBits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = parseLong(bufferedReader.readLine().trim());

            long result = FlipResult.flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}

