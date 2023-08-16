package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static interviewPrep.SortUtils.countInversions;

public class Main {
    public static void main(String[] args) {

        String s = "abab";

        System.out.println(GreedyAlgorithms.reverseShuffleMerge(s));
    }
}
