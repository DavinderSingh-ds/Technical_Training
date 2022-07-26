public class abcdPattern {
    public static void main(String[] args) {

    //  for (int i = 1; i < 128; i++) {
    //     System.out.print(" "+i+" "+(char)i);
    //  }

    for (char i = 'a'; i <= 'd'; i++) {
        for (char j = 'a'; j <= i; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
