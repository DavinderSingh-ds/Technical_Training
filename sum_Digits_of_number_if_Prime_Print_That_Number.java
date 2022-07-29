public class sum_Digits_of_number_if_Prime_Print_That_Number {
    public static void main(String[] args) {
        int arr[] = {12,34,56,8,811};
        int orgArr[] = new int[arr.length];

        int f = 0;
        for(int i =0;i<arr.length;i++){
            orgArr[i] = arr[i];
            int temp = arr[i];
            int range = arr[i];
            int sum = 0,count = 0;
            while (range>0) {
                range = range/10;
                count++;
            }
            for(int j = 0;j<count;j++){
                int rem = temp%10;
                sum = sum+rem;
                temp = temp/10;
            }
            arr[i] = sum;  // first store in array them compare 
            // System.out.println(arr[i]);


            // System.out.println("umar  "+arr[i]);

            for(int k = 2;k<arr[i];k++){
                if (arr[i] % k == 0) {
                    f = 1;
                    System.out.println(orgArr[i]+" Not a prime Number ");
                    break;
                }
            }
            if (f == 0) {
                System.out.println(orgArr[i]+" Prime");
            }
        }       
    }
}
