package week2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.joining;


class AnagramsResult {

    /*
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        // Write your code here
        int count = 0;

        //break string into two parts
        int halfway = s.length() / 2;
        String aStr = s.substring(0, halfway);
        String bStr = s.substring(halfway);

        if (aStr.length() != bStr.length()) {
            return -1;
        }

        List<Character> aChars = new ArrayList<>();
        List<Character> bChars = new ArrayList<>();
        for (int i = 0; i < aStr.length(); i++) {
            aChars.add(aStr.charAt(i));
            bChars.add(bStr.charAt(i));
        }

        for (Character character : aChars) {
            if (!(bChars.contains(character))) {
                count++;
            } else {
                bChars.remove(character);
            }
        }
        return count;
    }

}

public class Anagrams {
    public static void main(String[] args) throws IOException {
        System.out.println(AnagramsResult.anagram("abccde"));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//x
//        int q = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, q).forEach(qItr -> {
//            try {
//                String s = bufferedReader.readLine();
//
//                int result = AnagramsResult.anagram(s);
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
