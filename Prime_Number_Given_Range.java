import java.util.Scanner;
import java.util.ArrayList;

public class Prime_Number_Given_Range {

    public static void Print() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Prime = new ArrayList<>();
        
        System.out.println(" Enter the Number for range :");
        int num = sc.nextInt();
        sc.close();
        
               
        for (int i = 2; i <=num; i++) {
               boolean isprime=true;
            
            for(int j=2;j<=i/2;j++){
                
                if(i % j ==0){
                    isprime=false;
                    break;
                }
        
             }
        if(isprime){
             Prime.add(i);
        }
}
            System.out.println(Prime);
    }

    public static void main (String [] args){
        Print();
        
    }

}
