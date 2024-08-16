import java.util.Scanner;

public class Greatest_of_the_Three_Numbers {

    public static void Compaer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        int gretest = a;

        if (b > gretest) {
             gretest = b;
        } 
         if (c > gretest) {
             gretest = c;
        }

        System.out.println("The greatest of the three numbers is : " + gretest);
    }

    public static void main(String[] args) {
        Compaer();
    }
}