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
//        Arrays.sort(s, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));

        Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        BigDecimal a = new BigDecimal(o1);
                        BigDecimal b = new BigDecimal(o2);
                        return a.compareTo(b);
                    }
                }));

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}