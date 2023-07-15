package interviewPrep;

import java.util.List;

public class Clouds {
    public static int jumpClouds(List<Integer> c) {
        int jumps = 0;
        int i = 0;

        while (i < c.size() - 1) {
            if (i + 2 < c.size() && c.get(i + 2) == 0) {
                i += 2;
            } else {
                i++;
            }
            jumps++;
        }

        return jumps;
    }
}
