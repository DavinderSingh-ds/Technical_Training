/**
 * deletion_Array
 */
public class deletion_Array {

    public static void main(String[] args) {
        int arr[] = {12,23,34,56,6};
        //            0 1  2  3  4 
        int pos = 2;

        for(int i = pos;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }

        //
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}