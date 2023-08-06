package interviewPrep;

import java.util.ArrayList;
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

    public static long countInversions(List<Integer> arr) {
        return mergeSortAndCount(arr, 0, arr.size() - 1);
    }

    private static long mergeSortAndCount(List<Integer> arr, int l, int r) {
        long count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Count inversions in left and right subarrays
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);

            // Count the inversions during merge
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

    private static long mergeAndCount(List<Integer> arr, int l, int m, int r) {
        List<Integer> left = new ArrayList<>(arr.subList(l, m + 1));
        List<Integer> right = new ArrayList<>(arr.subList(m + 1, r + 1));

        long count = 0;
        int i = 0, j = 0, k = l;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                arr.set(k++, left.get(i++));
            } else {
                arr.set(k++, right.get(j++));
                count += m + 1 - l - i;  // Number of remaining elements in left
            }
        }

        while (i < left.size()) {
            arr.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            arr.set(k++, right.get(j++));
        }

        return count;
    }
}
