
// Revese Number & String
import java.util.Scanner;

public class Reverse_Anything {

    public static void compare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word... ");
        String word = sc.next();

        // String lower = word.toLowerCase();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

    }

    public static void main(String[] args) {
        compare();
    }
}
