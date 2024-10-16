class Find_Max {
    public static void Find() {
        int[] arr = { 10, 54, 88, 63, 79, 98, 100 };

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        Find();
    }
}