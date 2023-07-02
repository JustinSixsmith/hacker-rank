package interviewPrep.easy;

public class CountingValleys {
    public static int countValleys(int steps, String path) {
        var elevation = 0;
        var count = 0;
        var arr = path.toCharArray();
        for (int i = 0; i < steps; i++) {
            var step = arr[i];

            elevation = (step == 'U') ? elevation + 1 : elevation - 1;
            if (step == 'U' && elevation == 0)
                count++;
        }
        return count;
    }
}
