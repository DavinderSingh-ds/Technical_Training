public class shiftingArray {
    public static void main(String[] args) {
        int a[] = {12,1,23,4,323,3,3,43,45,78};
        int temp[] = new int[2];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[(a.length-2)+i];
            System.out.println(temp[i]);
        }
        System.out.println();

        for (int i = 0; i < a.length-2; i++) {
            a[a.length-1-i] = a[a.length-3-i];
        }
        for (int i = 0; i < temp.length; i++) {
            a[i] = temp[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }
}
