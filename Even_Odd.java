import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Even_Odd {

    static int array[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

    public static void saprate(int[] arr) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }

        }
        System.out.println("Even Numbers :" + " " + even);
        System.out.println("Odd Numbers :" + " " + odd);

    }

    public static void main(String[] args) {

        saprate(array);

    }

}