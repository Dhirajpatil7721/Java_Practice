
// to Find Greatest of Two Numbers
import java.util.Scanner;

public class Greatest_of_Two_Numbers {

    public static void Compaer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int a = sc.nextInt();

        System.out.print("Enter Second Number :");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is Greater > than " + b);
        } else if (a < b) {
            System.out.println(b + " is Greater > than " + a);
        } else if (a == b) {
            System.out.println(a + " Both are Equals " + b);

        }
    }

    public static void main(String[] args) {
        Compaer();
    }
}