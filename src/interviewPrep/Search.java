package interviewPrep;

import java.util.List;

public class Search {

    public static void whatFlavors(List<Integer> cost, int money) {
        // Write your code here
        int sunny = 0;
        int johnny = 0;
        int closest = Integer.MAX_VALUE;

        for (int i = 0; i < cost.size() - 1; i++) {
            for (int j = 1; j < cost.size(); j++) {
                int first = cost.get(i);
                int second = cost.get(j);
                int difference = money - (first + second);

                if (difference >= 0 && difference < money && difference < closest) {
                    closest = difference;
                    if (first < second) {
                        sunny = i + 1;
                        johnny = j + 1;
                    } else {
                        johnny = j + 1;
                        sunny = i + 1;
                    }
                }
            }
        }

        System.out.println(sunny + " " + johnny);
    }
}
