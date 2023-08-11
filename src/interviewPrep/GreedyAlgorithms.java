package interviewPrep;

import java.util.List;

public class GreedyAlgorithms {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int abs = Math.abs(arr.get(i) - arr.get(j));
                if (abs < minAbs)
                    minAbs = abs;
            }
        }

        return minAbs;
    }
}
