
// Find the Sum of the Numbers in a Given Range 
import java.util.Scanner;

public class Sum_Of_Given_Range {

  public static void sum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter First no of Rangr :");
    int a = sc.nextInt();

    System.out.print("Enter Last no of Rangr :");
    int b = sc.nextInt();
    int sum = 0;
    for (int i = a; i <= b; i++) {

      sum += i;

    }
    System.out.println("The Some Of numbers rane in " + a + "to " + b + " is :" + sum);

  }

  public static void main(String[] args) {
    sum();
  }
}