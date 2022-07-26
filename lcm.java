public class lcm {
    public static void main(String[] args) {
        int a =4,b=6;
        int big = a>b?a:b;
        for (int i = big; i < (a*b); i++) {
            if (i%a == 0 && i%b == 0) {
                System.out.print(i);
                break;
            }
        }
    }
    
}