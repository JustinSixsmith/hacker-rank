package interviewPrep;

import javaPrep.HashSet;

import java.util.Objects;

public class Dynamic {

    public static int maxSubsetSum(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return Math.max(arr[0], 0);
        }

        // Initialize variables to store the max sum when including and excluding the current element
        int include = arr[0];
        int exclude = 0;

        // Loop through the array
        for (int i = 1; i < n; i++) {
            // Calculate new maximum sums
            int newInclude = Math.max(include, exclude + arr[i]);
            int newExclude = Math.max(include, exclude);

            // Update the maximum sums for the next iteration
            include = newInclude;
            exclude = newExclude;
        }

        return Math.max(include, exclude);
    }

    public static String abbreviation(String a, String b) {
        // Write your code here
        String upperA = a.toUpperCase();
        StringBuilder leftovers = new StringBuilder();

        int i = 0, j = 0;
        while (i < a.length()) {
            if (upperA.charAt(i) == b.charAt(j)) {
                i++;
                j++;
                continue;
            }
            leftovers.append(a.charAt(i));
            i++;
        }


        String lowerLeftovers = leftovers.toString().toLowerCase();
        for (int k = 0; k < lowerLeftovers.length(); k++) {
            if (leftovers.charAt(k) != lowerLeftovers.charAt(k)) return "NO";
        }

        return "YES";
    }


}
