// Java Program to Check Leap Year or not
import java.util.Scanner;

public class Leap_Year {
    public static void Year(){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter The Leap Year : ");
        int year=sc.nextInt();
        
        if(year %4==0){
            
        System.out.println("This is Leap Year : "+year);
        }
        else{
        System.out.println("This is not Leap Year : "+year);
            
        }
        
    }
    
    public static void main(String[] args){
        Year();
    }
}
