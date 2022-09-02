package week2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class SherlockResult {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        String answer = "NO";
        int leftSum = 0;
        int rightSum = 0;

        // Start with the element at index 1, end with element in second to last position
        for (int i = 1; i < arr.size() - 1; i++) {

            // Add up left side
            for (int j = 0; j < i; j++) {
                leftSum += arr.get(j);
            }
            // Add up right side
            for (int j = i + 1; j < arr.size(); j++) {
                rightSum += arr.get(j);
            }

            // Compare sides
            if (leftSum == rightSum) {
                answer = "YES";
            }
        }
        return answer;
    }
}

public class SherlockAndArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            String result = SherlockResult.balancedSums(arr);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

