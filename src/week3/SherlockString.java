package week3;

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

class SherlockResult {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        // Write your code here
        Map<Character, Integer> stringChars = new HashMap();

        // Look at each character in a string
        for (int i = 0; i < s.length(); i++) {
            if (!stringChars.containsKey(s.charAt(i))) {
                stringChars.put(s.charAt(i), 1);
            } else {
                stringChars.put(s.charAt(i), stringChars.get(s.charAt(i)) + 1);
            }
        }
        System.out.println(stringChars);
        return "Yes";
    }

}

public class SherlockString {
    public static void main(String[] args) throws IOException {

        System.out.println(SherlockResult.isValid("aabbccd"));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = SherlockResult.isValid(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

