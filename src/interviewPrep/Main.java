package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static interviewPrep.SortUtils.countInversions;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 9, 2, 5, 3, 7));

        System.out.println(countInversions(arr));
    }
}
