public class primeNumberFiftytoHundred {
    public static void main(String[] args) {
        int i;
        for (int num = 50; num <= 100; num++) {
            for (i = 2; i < num; i++) {
                if (num%i == 0) {
                     break;
                }
             }
             if (i == num) {
                 System.out.println(i);
             }
        }
    }
}
