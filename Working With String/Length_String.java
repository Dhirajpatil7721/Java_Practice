// Java Program to find length of the string without using length function

public class Length_String {
    public static void main(String[] args) {

        String str = "Dhiraj";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        System.out.println(" Length of String is "+count);
        
    }
}
