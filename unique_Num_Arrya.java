public class unique_Num_Arrya {
    public static void main(String[] args) {
        int arr[] = {23,23,4,56,88,88,88,99,99,99,99};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]+ " ");
                }
            }
        }
    }
}
