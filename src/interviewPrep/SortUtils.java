package interviewPrep;

import java.util.Collections;
import java.util.List;

public class SortUtils {
    public static void countSwaps(List<Integer> a) {
        int n = a.size();
        int numSwaps = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a.get(j) > a.get(j + 1)) {
                    swap(a, j, j + 1);
                    numSwaps++;
                }
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
    }

    private static void swap(List<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }


    public static int maximumToys(List<Integer> prices, int k) {
        // Write your code here
        Collections.sort(prices);
        int toys = 0;

        int toyIndex = 0;
        while (k >= prices.get(toyIndex)) {
            k -= prices.get(toyIndex);
            toyIndex++;
            toys++;
        }

        return toys;
    }
}
