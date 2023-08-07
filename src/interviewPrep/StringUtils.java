package interviewPrep;

import java.util.*;

public class StringUtils {
    public static long repeatedString(String s, long n) {
        long count = 0;
        int len = s.length();

        // Count the number of 'a' in the given string
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        // Calculate the number of times the whole string repeats in n characters
        long repeatCount = n / len;

        // Calculate the remaining characters after the whole string repeats
        long remainingChars = n % len;

        // Add the count of 'a' in the repeated string
        count = count * repeatCount;

        // Add the count of 'a' in the remaining substring
        for (int i = 0; i < remainingChars; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

    public static int makeAnagram(String a, String b) {
        final int ENGLISH_ALPHABET = 26;
        int[] freqA = new int[ENGLISH_ALPHABET];
        int[] freqB = new int[ENGLISH_ALPHABET];

        for (var ch : a.toCharArray())
            freqA[ch - 'a']++;

        for (var ch : b.toCharArray())
            freqB[ch - 'a']++;

        int deletions = 0;
        for (int i = 0; i < ENGLISH_ALPHABET; i++)
            deletions += Math.abs(freqA[i] - freqB[i]);

        return deletions;
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notices = 0;
        int[] count = new int[201];

        // Counting sort on the first d elements
        for (int i = 0; i < d; i++) {
            count[expenditure.get(i)]++;
        }

        for (int i = d; i < expenditure.size(); i++) {
            double median = getMedian(count, d);

            if (expenditure.get(i) >= 2 * median) {
                notices++;
            }

            // Update the count for the current and previous elements
            count[expenditure.get(i)]++;
            count[expenditure.get(i - d)]--;
        }

        return notices;
    }

    private static double getMedian(int[] count, int d) {
        int sum = 0;
        int medianIndex1 = -1;
        int medianIndex2 = -1;

        if (d % 2 == 0) {
            for (int i = 0; i < count.length; i++) {
                sum += count[i];
                if (medianIndex1 == -1 && sum >= d / 2) {
                    medianIndex1 = i;
                }
                if (medianIndex2 == -1 && sum >= d / 2 + 1) {
                    medianIndex2 = i;
                    break;
                }
            }
            return (medianIndex1 + medianIndex2) / 2.0;
        } else {
            for (int i = 0; i < count.length; i++) {
                sum += count[i];
                if (sum > d / 2) {
                    return i;
                }
            }
        }

        return 0;
    }

    public static int alternatingCharacters(String s) {
        // Write your code here
        var chars = s.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1])
                count++;
        }

        return count;
    }

    public static String isValid(String s) {
        Map<Character, Integer> charFrequency = new HashMap<>();
        Map<Integer, Integer> freqFrequency = new HashMap<>();

        // Step 1: Count the frequency of each character
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Step 2: Count the frequency of those frequencies
        for (int freq : charFrequency.values()) {
            freqFrequency.put(freq, freqFrequency.getOrDefault(freq, 0) + 1);
        }

        if (freqFrequency.size() == 1) {
            return "YES";
        }

        if (freqFrequency.size() == 2) {
            Iterator<Integer> it = freqFrequency.keySet().iterator();
            int freq1 = it.next();
            int freq2 = it.next();

            if (freqFrequency.get(freq1) == 1) {
                // Either reduce the frequency by 1 (for case like 3,2 where freq of 3 is 1)
                // Or remove a character (for case like 1,2 where freq of 1 is 1)
                if (freq1 - 1 == freq2 || freq1 == 1) {
                    return "YES";
                }
            }

            if (freqFrequency.get(freq2) == 1) {
                // Either reduce the frequency by 1 (for case like 2,3 where freq of 3 is 1)
                // Or remove a character (for case like 2,1 where freq of 1 is 1)
                if (freq2 - 1 == freq1 || freq2 == 1) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

}
