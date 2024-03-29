package interviewPrep;

public class Valleys {
    public static int countValleys(int steps, String path) {
        int elevation = 0;
        int count = 0;
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
