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


    public static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> potentialSecond = new HashMap<>();
        Map<Long, Long> potentialThird = new HashMap<>();
        long count = 0;

        for (long num : arr) {
            long next = num * r;

            if (potentialThird.containsKey(num))
                count += potentialThird.get(num);

            if (potentialSecond.containsKey(num))
                potentialThird.put(next, potentialThird.getOrDefault(next, 0L) + potentialSecond.get(num));

            potentialSecond.put(next, potentialSecond.getOrDefault(next, 0L) + 1);
        }

        return count;
    }


    public static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> dataMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (List<Integer> query : queries) {
            int operation = query.get(0);
            int value = query.get(1);

            if (operation == 1) {
                int newFrequency = dataMap.getOrDefault(value, 0) + 1;
                dataMap.put(value, newFrequency);
                updateFreqMap(freqMap, newFrequency - 1, newFrequency);
            } else if (operation == 2) {
                int oldFrequency = dataMap.getOrDefault(value, 0);
                if (oldFrequency > 0) {
                    int newFrequency = oldFrequency - 1;
                    dataMap.put(value, newFrequency);
                    updateFreqMap(freqMap, oldFrequency, newFrequency);
                }
            } else if (operation == 3) {
                result.add(freqMap.getOrDefault(value, 0) > 0 ? 1 : 0);
            }
        }

        return result;
    }

    private static void updateFreqMap(Map<Integer, Integer> freqMap, int oldFrequency, int newFrequency) {
        if (oldFrequency > 0)
            freqMap.put(oldFrequency, freqMap.get(oldFrequency) - 1);

        freqMap.put(newFrequency, freqMap.getOrDefault(newFrequency, 0) + 1);
    }


}



