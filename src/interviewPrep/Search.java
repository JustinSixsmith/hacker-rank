package interviewPrep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


}
