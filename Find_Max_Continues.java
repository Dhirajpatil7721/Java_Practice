// Count Continues no  

class Find_Max_Continues {

    public static void find() {
        int[] arr = { 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1 };
        int max = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
                max = Math.max(max, counter);
            } else {
                counter = 0;
            }
        }
        System.out.print(max);
    }

    public static void main(String[] args) {
        find();
    }
}