// Check if a Number is Positive or Negative 
import java.util.ArrayList;
import java.util.List;

public class Positive_or_Negative {

    static int array[] = { -1, -2, 1, -3, 2, -4, 3, -5, 4, 5, -6, -7, -8, -9, 6, 7, 8, 9 };

    public static void saprate(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }

        }

        System.out.println("Positive Numbers :" + " " + pos);
        System.out.println("Negative Numbers :" + " " + neg);

    }

    public static void main(String[] args) {

        saprate(array);

    }

}