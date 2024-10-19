// Remove brackets from an algebraic expression 

public class Remove_Brakets {
    // Java program to Remove spaces from a string

    public static void main(String[] args) {
        String str = "(a+b) *(b+a)";
        String update = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '(' && str.charAt(i) !=')') {
                update += str.charAt(i);
            }
        }
        System.out.println(update);

    }
}

