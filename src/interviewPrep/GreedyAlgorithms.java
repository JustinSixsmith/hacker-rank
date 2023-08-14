package interviewPrep;

import java.util.ArrayList;
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


    public static int luckBalance(int k, List<List<Integer>> contests) {
        // Write your code here
        int luckBalance = 0;
        List<Integer> importantContests = new ArrayList<>();

        for (var contest : contests) {
            if (contest.get(1) == 1) {
                importantContests.add(contest.get(0));
            } else {
                luckBalance += contest.get(0);
            }
        }

        Collections.sort(importantContests);
        Collections.reverse(importantContests);

        for (int i = 0; i < importantContests.size(); i++) {
            if (i < k) {
                luckBalance += importantContests.get(i);
            } else {
                luckBalance -= importantContests.get(i);
            }
        }

        return luckBalance;
    }
}
