public class pattern5 {
    public static void main(String[] args) {
        int count=0;
        for (char i = 'a'; i <= 'd'; i++) {
            for (char j = 'a'; j <= i; j++) {
                int store = (count)+'a';
                count++;
                System.out.print((char)store + " ");
            }
            System.out.println();
        }
        // int a = 'a';
        // System.out.println(a);

        // int j = 97;
        // char b = (char)j;
        // System.out.println(b);      
    }
}
