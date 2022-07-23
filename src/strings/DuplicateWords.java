package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner scanner = new Scanner(System.in);
        int numTime = Integer.parseInt(scanner.nextLine());

        while (numTime-- > 0) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }
            System.out.println(input);
        }
        scanner.close();
    }
}
