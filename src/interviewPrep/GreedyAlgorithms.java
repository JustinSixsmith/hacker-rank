package interviewPrep;

import java.util.*;

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

    public static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int totalCost = 0;
        int multiplier = 0;

        for (int i = c.length - 1; i >= 0; i--) {
            totalCost += (multiplier + 1) * c[i];
            if ((c.length - i) % k == 0) {
                multiplier++;
            }
        }

        return totalCost;
    }

    public static int maxMin(int k, List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int minUnfairness = Integer.MAX_VALUE;


        for (int i = 0; i <= arr.size() - k; i++) {
            int unfairness = arr.get(i + k - 1) - arr.get(i);
            if (unfairness < minUnfairness)
                minUnfairness = unfairness;
        }

        return minUnfairness;
    }

    public static String reverseShuffleMerge(String input) {
        int[] freq = new int[26];
        for (char ch : input.toCharArray()) {
            freq[ch - 'a']++;
        }
        int[] sFreq = freq.clone();
        for (int i = 0; i < 26; i++) {
            sFreq[i] /= 2;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            int chNum = ch - 'a';

            // If we don't need this character, skip
            if (sFreq[chNum] <= 0) {
                freq[chNum]--;
                continue;
            }

            // While the current character is smaller than the top of the stack
            // and we will encounter the stack's top character later, pop off the top
            while (!stack.isEmpty() && ch < stack.peek() && freq[stack.peek() - 'a'] > sFreq[stack.peek() - 'a']) {
                sFreq[stack.pop() - 'a']++;
            }

            // Add current character to stack
            stack.push(ch);
            sFreq[chNum]--;
            freq[chNum]--;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }



}
