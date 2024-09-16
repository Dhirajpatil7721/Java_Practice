//Armstrong Numbers between Two Intervals using Java

import java.util.Scanner;

class Amstrong_Nunber_Given_Range {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number... ");
        int no = sc.nextInt();
        System.out.println("Enter Second Number... ");
        int num = sc.nextInt();

        System.out.print("[ ");
        for (int i = no; i <= num; i++) {

            int n1 = i / 100;
            int n2 = (i % 100) / 10;
            int n3 = i % 10;

            int sum = ((n1 * n1 * n1) + (n2 * n2 * n2) + (n3 * n3 * n3));
            if (i == sum) {
                System.out.print(i + " ,");
            }

        }
        System.out.print(" ]");

    }
}