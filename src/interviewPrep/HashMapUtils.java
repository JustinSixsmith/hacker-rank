package interviewPrep;

import java.util.*;

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

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        Set<Character> set = new HashSet<>();

        for (var ch : s1.toCharArray())
            set.add(ch);

        for (var ch : s2.toCharArray())
            if (set.contains(ch))
                return "YES";

        return "NO";
    }

    public static int sherlockAndAnagrams(String s) {
        int count = 0;

        for (int len = 1; len < s.length(); len++) {
            Map<String, Integer> freqMap = new HashMap<>();

            for (int i = 0; i <= s.length() - len; i++) {
                String substring = s.substring(i, i + len);
                String sortedSubstr = sortString(substring);

                freqMap.put(sortedSubstr, freqMap.getOrDefault(sortedSubstr, 0) + 1);
            }

            for (int freq : freqMap.values()) {
                count += (freq * (freq - 1)) / 2;
            }
        }

        return count;
    }

    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
