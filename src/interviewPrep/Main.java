package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static interviewPrep.SortUtils.countInversions;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 4, 6, 5};
        int[] arr2 = {2, 1, 5, 8, 4};
        int[] arr3 = {3, 5, -7, 8, 10};

        System.out.println(Dynamic.maxSubsetSum(arr1)); // Output should be 13
        System.out.println(Dynamic.maxSubsetSum(arr2)); // Output should be 11
        System.out.println(Dynamic.maxSubsetSum(arr3)); // Output should be 15
    }
}
