package interviewPrep;

import java.util.*;

public class Search {

    public static void whatFlavors(List<Integer> cost, int money) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < cost.size(); i++) {
            int complement = money - cost.get(i);

            // If the complement (money left after buying current flavor) exists in the map,
            // then we've found our two flavors.
            if (map.containsKey(complement)) {
                // Ensure smaller index is printed first
                System.out.println(map.get(complement) + 1 + " " + (i + 1));
                return;
            }

            // If the complement doesn't exist in the map, add the current cost and its index.
            map.put(cost.get(i), i);
        }
    }

    public static int pairs(int k, List<Integer> arr) {
        Set<Integer> set = new HashSet<>(arr);
        int count = 0;

        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        return count;
    }

    public static long triplets(int[] a, int[] b, int[] c) {
        a = Arrays.stream(a).distinct().sorted().toArray();
        b = Arrays.stream(b).distinct().sorted().toArray();
        c = Arrays.stream(c).distinct().sorted().toArray();

        long result = 0;
        long aIndex = 0, cIndex = 0;

        for (int value : b) {
            while (aIndex < a.length && a[(int) aIndex] <= value) {
                aIndex++;
            }
            while (cIndex < c.length && c[(int) cIndex] <= value) {
                cIndex++;
            }
            result += aIndex * cIndex;
        }

        return result;
    }

}
