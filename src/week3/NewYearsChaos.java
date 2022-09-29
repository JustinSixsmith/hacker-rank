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

class NewYearResult {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int totalBribes = 0;

        //Loop through list and compare value to its index + 1
        for (int i = 0; i < q.size(); i++) {

            if (q.get(i) < (i + 1) + 2) {
                int bribes = q.get(i) - (i + 1);
                totalBribes += bribes;

            } else {
                System.out.println("too chaotic");

            }
            System.out.println(totalBribes);
        }
    }

}

public class NewYearsChaos {
    public static void main(String[] args) throws IOException {

        List<Integer> queue1 = new ArrayList<>(Arrays.asList(2, 1, 5, 3, 4));
        List<Integer> queue2 = new ArrayList<>(Arrays.asList(2, 5, 3, 1, 4));

//        NewYearResult.minimumBribes(queue1);
        NewYearResult.minimumBribes(queue2);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int t = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, t).forEach(tItr -> {
//            try {
//                int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList());
//
//                NewYearResult.minimumBribes(q);
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
    }
}

