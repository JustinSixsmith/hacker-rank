
public class FizzBuzz {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (!(i % 3 == 0) && !(i % 5 == 0)) {
                System.out.println(i);
            }
            if ((i % 3 == 0) && !(i % 5 == 0)) {
                System.out.println("Fizz");
            }
            if (!(i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Buzz");
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
        }
    }

    public static void main(String[] args) {
        int n = 15;
        fizzBuzz(n);
    }
}
