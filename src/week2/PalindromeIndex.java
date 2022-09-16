package week2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class PalindromeResult {

    /*
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
        // Write your code here

        StringBuilder frontWord = new StringBuilder(), backWord = new StringBuilder();
        int a = 0, b = 0;

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            backWord.append(s.charAt(j));
            if (s.charAt(i) == s.charAt(j)) {
                frontWord.append(s.charAt(i));
            } else {
                a = i;
                b = j;
            }
        }
        String frontString = String.valueOf(frontWord);
        if (String.valueOf(backWord).equals(s)) {
            return -1;
        }
        if (frontString.equals(s)) {
            return a;
        } else {
            return b;
        }
    }

}

public class PalindromeIndex {
    public static void main(String[] args) throws IOException {

        System.out.println(PalindromeResult.palindromeIndex("abcccbba"));


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                String s = bufferedReader.readLine();
//
//                int result = PalindromeResult.palindromeIndex(s);
//
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
