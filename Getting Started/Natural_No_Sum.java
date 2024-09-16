
// Some of Ntural Numbers
import java.util.Scanner;

public class Natural_No_Sum {

    public static void sum() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {

            sum += i;

        }

        System.out.println("Sum of " + n + " Numbers :" + sum);

    }

    public static void main(String[] args) {

        sum();

    }

}