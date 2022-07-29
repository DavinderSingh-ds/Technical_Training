// find prime and store in new array

public class findPrimeNumber_in_Array {
    public static void main(String[] args) {
        // int arr[] = {2,23,4,6,18};

        int arr[] = {23,3,5,67,34};
        int a = 0;
        int count = 0;
        int temp[] = new int[4];

        for (int index = 0; index < arr.length; index++) {
                for(int i = 2; i< arr[index] ; i++) {
                    if ( arr[index] % i == 0)  {
                        a = 1;
                        System.out.println("non prime");
                        break;
                    }
                }
       
                if (a == 0) {
                    System.out.println("Prime is : "+arr[index]);
                    temp[index] = arr[index];
                    count++;
                }
        }
        System.out.println(count);
        for (int index = 0; index < temp.length; index++) {
            System.out.println(temp[index]);
        }

    }
}