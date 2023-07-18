package interviewPrep;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Sample test case #1
        long N = 10; // Total number of seats in the cafeteria
        long K = 1; // Number of empty seats required on each side of a diner
        long M = 2; // Number of existing diners
        long[] S = {2, 6}; // Seats of existing diners
        long result = ArrayUtils.maxAdditionalDiners(N, K, M, S);
//        System.out.println(result);  // Output: 3
//
//        // Sample test case #2
//        N = 15;
//        K = 2;
//        M = 3;
//        S = new int[]{11, 6, 14};
//        result = ArrayUtils.maxAdditionalDiners(N, K, M, S);
////        System.out.println(result);  // Output: 1
    }
}
