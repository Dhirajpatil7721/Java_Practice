
// Sum of digits of a Number 
import java.util.Scanner;

public class Sum_Of_Digit {

    public static void print() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Digit ");
        int num = sc.nextInt();
        
        int sum=0;
        
        while(num>0){
            int digit=num;

            digit= num%10;
            sum=sum+digit;
            num=num/10; 

        }
        
        System.out.print(sum);
        

    }

    public static void main(String[] args) {
        print();
    }
}
