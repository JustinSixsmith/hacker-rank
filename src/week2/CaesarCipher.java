package week2;

import java.io.*;

import static java.util.stream.Collectors.joining;

class CaesarResult {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        // Write your code here
        k = k % 26;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i))) {
                result += String.valueOf(s.charAt(i));
            } else {
                int newCharNum = (int) s.charAt(i) + k;
                if (Character.isUpperCase(s.charAt(i))) {
                    if (newCharNum > (int) 'Z') {
                        newCharNum -= 26;
                    }
                }
                if (Character.isLowerCase(s.charAt(i))) {
                    if (newCharNum > (int) 'z') {
                        newCharNum -= 26;
                    }
                }
                char newChar = (char) newCharNum;
                result += String.valueOf(newChar);
            }
        }
        return result;
    }
}

public class CaesarCipher {
    public static void main(String[] args) throws IOException {

        System.out.println(CaesarResult.caesarCipher("middle-Outz", 2));

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String s = bufferedReader.readLine();
//
//        int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String result = CaesarResult.caesarCipher(s, k);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

