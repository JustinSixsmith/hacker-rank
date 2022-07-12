import java.util.Scanner;

public class EOF {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (scanner.hasNextLine()) {
            System.out.println(count + " " + scanner.nextLine());
            count++;
        }
    }
}
