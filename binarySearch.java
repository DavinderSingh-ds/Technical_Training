public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {12,2,34,45,56};
        int beg = 0;
        int end = arr.length-1;
        int mid = beg+end /2;
        int item = 22;
        int f = 0;
        while (beg <= end ) {
            if (item == arr[mid]) {
                f = 1;
                System.out.println("element found at "+mid+ " index");
                break;
            }
            if (item > arr[mid]) {
                beg = beg+1;
            }
            if (item < arr[mid]) {
                end = end-1;
            }
            mid = beg+end /2;
        }
        if (f==0) {
            System.out.println("Item not found");
        }
    }
}