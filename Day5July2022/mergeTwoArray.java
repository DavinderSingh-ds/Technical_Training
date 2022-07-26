public class mergeTwoArray {
    public static void main(String[] args) {
        int a[] = {12,2,3,4,32};
        int b[] = {2,32,43,4,5,6};
        int c[] = new int[a.length+b.length];
        int index = 0;

        for (int i = 0; i < a.length ; i++) {
            c[i] = a[i];     // c[index] = a[i];
            index++;
        }
  
        for (int i = 0; i < b.length; i++) {
            c[index] = b[i];
            index++;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+ " ");
        }
    }
}
