class Move_Zero {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 7, 8, 0, 0, 5 };
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] != 0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            
        }
    }
}