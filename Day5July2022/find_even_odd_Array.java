public class find_even_odd_Array {
    public static void main(String[] args) {
        int a[] = {12,3,45,2,4,7,8};
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0) {
                System.out.println("Evens is : "+a[i]);
            }
            else{
                System.out.println("Odd is : " +a[i]);
            }
        }
    }
}
