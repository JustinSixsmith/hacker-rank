package interviewPrep;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test case 1
        int N1 = 5;
        String C1 = "APABA";
        int X1 = 1;
        int Y1 = 2;
        int result1 = ArrayUtils.getArtisticPhotographCount(N1, C1, X1, Y1);
        System.out.println("Test case 1: " + result1);  // Output: 1

        // Test case 2
        int N2 = 5;
        String C2 = "APABA";
        int X2 = 2;
        int Y2 = 3;
        int result2 = ArrayUtils.getArtisticPhotographCount(N2, C2, X2, Y2);
        System.out.println("Test case 2: " + result2);  // Output: 0

        // Test case 3
        int N3 = 8;
        String C3 = ".PBAAP.B";
        int X3 = 1;
        int Y3 = 3;
        int result3 = ArrayUtils.getArtisticPhotographCount(N3, C3, X3, Y3);
        System.out.println("Test case 3: " + result3);  // Output: 3
    }
}
