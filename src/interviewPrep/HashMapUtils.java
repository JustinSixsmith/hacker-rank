package interviewPrep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapUtils {
    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> magMap = new HashMap<>();

        for (String word : magazine) {
            magMap.putIfAbsent(word, 0);
            magMap.put(word, magMap.get(word) + 1);
        }

        for (String word : note) {
            if (!magMap.containsKey(word) || magMap.get(word) <= 0) {
                System.out.println("No");
                return;
            }
            magMap.put(word, magMap.get(word) - 1);
        }

        System.out.println("Yes");
    }
}
