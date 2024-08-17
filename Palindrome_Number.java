
//  Palindrome Number
import java.util.Scanner;
import java.util.ArrayList;

public class Palindrome_Number {

    public static void Print() {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number : ");
        int n = sc.nextInt();
        sc.close();

        boolean Palindrome = true;
        String num = Integer.toString(n);

        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                Palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (Palindrome) {
            System.out.println("This Number is Palindrome ");
        } else {
            System.out.println("This Number is Not-Palindrome ");
        }
    }

    public static void main(String[] args) {
        Print();

    }

}
