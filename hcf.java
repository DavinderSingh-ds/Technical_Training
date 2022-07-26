public class hcf {
    public static void main(String[] args) {
        int a = 10,b=20,c=1;
        int small = a<b?a:b;

        for (int i = 1; i < small; i++) {
            if (a%i ==0 && b%i == 0) {
                c = i*c;
            }
        }
        System.out.println(c);
    }
}
