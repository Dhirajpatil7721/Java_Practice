// Check whether a character is a vowel or consonant

public class Vowels_or_not {
    public static void main(String[] args) {
        String string = "Dhiraj";
        int count = 0;
        String str = string.toLowerCase();

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println("In " + str + " there is " + count + " Vowels are present");
    }
}
