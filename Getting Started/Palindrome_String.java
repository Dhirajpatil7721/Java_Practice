// Palindrome String

import java.util.Scanner;

public class Palindrome_String {

    public static void compare() {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String lower = word.toLowerCase();
        boolean palindrome = true;

        int left = 0;
        int right = lower.length() - 1;

        while (left < right) {
            if (lower.charAt(left) != lower.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("This is a Palindrome Word... ");
        } else {
            System.out.println("This is a Non-Palindrome Word... ");
        }
    }

    public static void main(String[] args) {
        compare();
    }
}
