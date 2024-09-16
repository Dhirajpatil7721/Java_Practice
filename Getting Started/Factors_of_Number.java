// Factors of a number using Java
import java.util.Scanner;

public class Factors_of_Number {
    void factor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " is : ");
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Factors_of_Number fc = new Factors_of_Number();
        fc.factor();
    }
}
