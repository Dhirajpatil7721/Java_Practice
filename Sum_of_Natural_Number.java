
// Program to Find the Sum of First N Natural Numbers 
import java.util.Scanner;

public class Sum_of_Natural_Number {
    public static void Sum() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Bunch of Numbers :");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("The Sum of first " + num + " Numbers is = " + sum);

    }

    public static void main(String[] args) {
        Sum();
    }

}
