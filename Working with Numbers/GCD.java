
// Java Program to find GCD or HCF of two numbers
import java.util.Scanner;

public class GCD {

    public static void Check(int dig1, int dig2) {

        if(dig1<1 || dig2<1){
            System.out.println("Enter Greatest value as campaer 1 or 0 ");
            return;
        }

        int max1=dig1/2;
        int max2=dig2/2;

        // if(max1<max)
        int result = (max1 > max2)?max2 : max1;

        // System.out.println(result);
        int gcd=0;
        for(int i=1;i<=result;i++){
            if(dig1 %i==0 && dig2 %i==0){
                gcd=i;
            }
            
        }
        System.out.println("Greatest Common Divisor is : "+gcd);
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Digit : ");
        int dig1 = sc.nextInt();
        System.out.println("Enter Second Digit : ");
        int dig2 = sc.nextInt();

        Check(dig1, dig2);
    }
}