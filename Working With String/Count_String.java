public class Count_String {
    public static void main(String[] args) {
        String s = "DhirajNPatil";
        int count = 0;  

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (s.charAt(i) == ' ' && count != 0) {
                break;
            }
        }
        System.out.print(count);

    }
}
