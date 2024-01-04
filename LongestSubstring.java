import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static int longestSubstringWithoutRepeating(String s) {
        int maxLength = 0;
        int start = 0;
        Set<Character> charSet = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(start));
                start++;
            }

            charSet.add(currentChar);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = longestSubstringWithoutRepeating(inputString);

        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
