public class selectionSort2 {
    public static void main(String[] args) {
                int arr[] = {12,2,34,45};
               
                for (int i = 0; i < arr.length-1; i++) {
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
