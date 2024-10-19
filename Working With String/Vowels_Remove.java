// Remove the vowels from a String 

public class Vowels_Remove {
    public static void main(String[] args) {

        String string = "DhiraJ";
        String str = string.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                continue;
            }else{
                System.out.print(str.charAt(i));
                
            }

        }

    }
}
