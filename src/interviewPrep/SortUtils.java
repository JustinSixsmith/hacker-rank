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
        int count = 0;
        // Write your code here
        // Split list into two arrays
        var middle = arr.size() / 2;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();


        for (int i = 0; i < middle; i++) {
            left.add(arr.get(i));
        }

        for (int i = middle; i < arr.size(); i++) {
            right.add(arr.get(i));
        }

        countInversions(left);
        countInversions(right);


        return count;
    }

    private void merge(List<Integer> left, List<Integer> right, List<Integer> result, int count) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j))
                result.set(k++, left.get(i++));

            else
                result.set(k++, right.get(j++));
        }

        while (i < left.size())
            result.set(k++, left.get(i++));

        while (j < right.size())
            result.set(k++, right.get(j++));
    }
}
