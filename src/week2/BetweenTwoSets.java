package week2;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;


class TwoSetsResult {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int counter = 0;
        boolean status = true;

        int min = a.get(a.size() - 1);
        int max = b.get(0);

        while (min <= max) {
            for (Integer num : a) {
                if (min % num != 0) {
                    status = false;
                }
                if (num % min != 0) {
                    status = false;
                }
                if (status) {
                    counter++;
                }
                min += a.get(0);
            }
        }
        return counter;
    }

}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>(Arrays.asList(2, 6));
        List<Integer> b = new ArrayList<>(Arrays.asList(16, 32, 96));
        System.out.println(TwoSetsResult.getTotalX(a, b));


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int m = Integer.parseInt(firstMultipleInput[1]);
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int total = TwoSetsResult.getTotalX(arr, brr);
//
//        bufferedWriter.write(String.valueOf(total));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

