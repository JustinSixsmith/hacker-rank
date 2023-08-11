package interviewPrep;

import java.util.Collections;
import java.util.List;

public class GreedyAlgorithms {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            int abs = Math.abs(arr.get(i) - arr.get(i + 1));
            if (abs < minAbs)
                minAbs = abs;
        }

        return minAbs;
    }
}
