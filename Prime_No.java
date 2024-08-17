
// Prime Number Program 
import java.util.Scanner;

public class Prime_No {

    public static void Prime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();

        boolean prime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {

            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("This is prime Number ");
        } else {
            System.out.println("This is Not-prime Number ");
        }

    }

    public static void main(String[] args) {
        Prime();
    }
}
