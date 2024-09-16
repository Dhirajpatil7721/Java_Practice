
// Armstrong Number in Java
import java.util.Scanner;

public class Armstrong_Number {
    Scanner sc = new Scanner(System.in);

    void Check() {
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();

        int fir, sec, thi, sum;

        fir = num % 10;
        sec = (num % 100) / 10;
        thi = num / 100;
        sum = (fir * fir * fir) + (sec * sec * sec) + (thi * thi * thi);

        if (num == sum) {
            System.out.println("The " + num + " is Armstrong Number ");

        } else {
            System.out.println("This is Not Armstrom Number...");
        }
    }

    public static void main(String[] args) {
        Armstrong_Number am = new Armstrong_Number();
        am.Check();
    }
}
