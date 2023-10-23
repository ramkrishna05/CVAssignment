import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram

{
    public static boolean isPangram(String input) {
        // Create a set to store lowercase letters (a-z)
        Set<Character> letters = new HashSet<>();

        // Convert the input to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Iterate through each character in the input
        for (char ch : input.toCharArray()) {
            if ('a' <= ch && ch <= 'z') {
                letters.add(ch);
            }
        }

        // Check if the set contains all 26 letters
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean result = isPangram(s);

        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

