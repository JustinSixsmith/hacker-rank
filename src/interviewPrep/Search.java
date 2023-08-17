package interviewPrep;

import java.util.List;

public class Search {

    public static void whatFlavors(List<Integer> cost, int money) {
        for (int i = 0; i < cost.size() - 1; i++) {
            for (int j = i + 1; j < cost.size(); j++) {
                if (cost.get(i) + cost.get(j) == money) {
                    // Ensure smaller index is printed first
                    System.out.println((i + 1) + " " + (j + 1));
                    return;  // exit early once we find a match
                }
            }
        }
    }

}
