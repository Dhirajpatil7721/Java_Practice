// Java program to remove characters in a string except alphabets

public class Remove_Characters {
    public static void main(String[] args) {
        String str = "D]h8i@r!a3#j";
        String update = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) < 'z') || (str.charAt(i) >= 'A' && str.charAt(i) < 'Z')) {
                update += str.charAt(i);
            }
        }
        System.out.println(update);

    }
}
