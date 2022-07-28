package week1;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double pos = 0;
        double neg = 0;
        double zero = 0;

        for (Integer num : arr) {
            if (num > 0) {
                pos++;
            }
            if (num < 0) {
                neg++;
            }
            if (num == 0) {
                zero++;
            }
        }
        double posRatio = pos / arr.size();
        double negRatio = neg / arr.size();
        double zeroRatio = zero / arr.size();

        System.out.format("%.6f%n%.6f%n%.6f%n", posRatio, negRatio, zeroRatio);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

