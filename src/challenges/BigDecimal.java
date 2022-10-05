package challenges;

import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        scanner.close();

        //Write your code here
        Arrays.sort(s, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}