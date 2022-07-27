public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {13,45,1,23,2};

        for (int i = 0; i < arr.length; i++) {

            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }

                if (min != i) {
                    int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
