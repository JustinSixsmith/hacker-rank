package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static interviewPrep.SortUtils.countInversions;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 9, 2, 5, 3, 7));
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 1, 3, 1, 2));

        System.out.println(countInversions(arr));
        System.out.println(countInversions(arr1));  // Outputs: 0
        System.out.println(countInversions(arr2));  // Outputs: 4
    }
}
