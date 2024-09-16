
// Power of a number using Java
import java.util.Scanner;

public class Power_of_Number {

    void Inbuilt() {
        int a = 5;
        int n = 4;

        System.out.println("First Value is " + a + " & Second Value is  " + n);
        System.out.println(" Exponintial By Using Inbuilt Method " + Math.pow(a, n));
    }

    void Algo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit...");
        int a = sc.nextInt();
        System.out.println("Enter Exponential...");
        int n = sc.nextInt();

        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            result = (a *= a);
        }
        System.out.println("First Value is " + a + " & Second Value is  " + n);
        System.out.println(" Exponintial By Using Without-Inbuilt Method " + result);

    }

    public static void main(String[] args) {
        Power_of_Number pn = new Power_of_Number();
        pn.Inbuilt();
        pn.Algo();

    }

}