// Java program to Remove spaces from a string

public class Remove_Space {
    public static void main(String[] args) {
        String str = "Dhiraj Patil";
        String update = " ";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                update += str.charAt(i);
            }
        }
        System.out.println(update);

    }
}
