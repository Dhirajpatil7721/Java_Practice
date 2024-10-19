// Java program to check String is a palindrome or not

public class Palindrome {
    public static void main(String[] args) {
        String sent = "dhdf";
        String str = sent.toLowerCase();
        String ori = str;

        String update = "";
        for (int i = str.length()-1; i >= 0; i--) {
            update +=str.charAt(i);
        }
        if(ori.equals(update)){
            System.out.println("Yes ,it's a palindrome.");
        
        }else {
            System.out.println("No, it's not a palindrome.");
        }
        
    }
}
