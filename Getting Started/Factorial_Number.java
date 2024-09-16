
//Factorial of a Number in Java
import java.util.Scanner;

public class Factorial_Number {

    public static void Check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :- ");
        int num = sc.nextInt();
        int fact = num;

        for (int i = 2; i < num; i++) {

            fact *= i;
        }
        System.out.println(fact);

    }

    public static void main(String[] args) {
        Check();
    }
}