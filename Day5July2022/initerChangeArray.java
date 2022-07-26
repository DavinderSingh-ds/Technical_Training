public class initerChangeArray {
    public static void main(String[] args) {
        int a[] = {1,22,36,23,90};
        int temp[] = new int[2];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[(a.length-2)+i];
        }  
        for (int j = 0; j < 2; j++) {
            a[(a.length-2)+j]= a[j];    
            a[j] = temp[j];        
        }
        for (int i = 0; i <  a.length; i++) {
            System.out.println(a[i]);
        }
    }
}