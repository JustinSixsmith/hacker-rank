package week1;

import java.io.*;
import java.util.*;

class PangramResult {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        List<Character> alphabet = new ArrayList<>();
        int flag = 0;
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.add(ch);
        }
        for (Character ch :
                alphabet) {
            if (!s.contains(String.valueOf(ch))) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return "pangram";
        } else {
            return "not pangram";
        }
    }

}

public class Pangrams {
    public static void main(String[] args) throws IOException {
        System.out.println(PangramResult.pangrams("the quick brown fox jumped over the lazy dog"));
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = PangramResult.pangrams(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

