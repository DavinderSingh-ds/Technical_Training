import java.util.Arrays;

public class findLargestElement_in_Array {
    public static void main(String[] args) {
        int arr[] = {12,2,2,34,5};
        int fr[] = {-1,-1,-1,-1,-1};

       for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count ++;
                    fr[j] = 0;
                }
            }
            if (fr[i] != 0) {
                fr[i] = count;
            }
       }

       int temp[] = new int[arr.length];
       int m = 0;

       for (int index = 0; index < arr.length; index++) {
            if (fr[index] != 0) {
                // System.out.println(arr[index]+" comes "+fr[index]+" times");
                temp[m] =  arr[index];
                m++;
            }
       }
       Arrays.sort(temp);
       for (int index = 0; index < temp.length; index++) 
       {
        if (temp[index] != 0) 
        {
            System.out.println(temp[index]);
        }
       }
       System.out.println("Largest element is : "+temp[temp.length-1]);
       System.out.println("Second Largest element is : "+temp[temp.length-2]);
    }
}