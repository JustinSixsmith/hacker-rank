package interviewPrep.easy;

public class Main {
    public static void main(String[] args) {
        var path = "DDUUDDDDDDUUUUUUUUUDDUUUU";
        var valleys = CountingValleys.countValleys(8, path);
        System.out.println(valleys);
    }
}
