public class swapp_with_next_Element {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int temp = 0;
        for (int i = 0; i < a.length; i = i+2) {
            if (i != 4) {
                temp = a[i];
                a[i] =a[i+1];
                a[i+1] = temp;
            }    
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
