package interviewPrep.easy;

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
}
