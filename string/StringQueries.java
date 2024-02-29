package string;
import java.util.*;

public class StringQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N and Q
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Input the string S
        String s = scanner.nextLine();

        for (int i = 0; i < q; i++) {
            // Input the query
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            // Process the query
            int result = minDeletions(s.substring(l - 1, r));
            System.out.println(result);
        }
    }
    private static int minDeletions(String substring) {
        int[] occurrences = new int[26]; // Assuming only lowercase English alphabets

        // Count occurrences of each character in the substring
        for (char c : substring.toCharArray()) {
            occurrences[c - 'a']++;
        }

        // Find the maximum occurrence
        int maxOccurrence = 0;
        for (int occurrence : occurrences) {
            maxOccurrence = Math.max(maxOccurrence, occurrence);
        }

        // Calculate total deletions required
        int totalDeletions = substring.length() - maxOccurrence;

        return totalDeletions;
    }
}
