public class minElementsInArray {
    public static void main(String[] args) {
        int arr[] = {12,2,34,45};
        int min=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    min = arr[j];
                }
            }
           
        }
        System.out.println(min);
    }
}
