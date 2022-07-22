public class swap_first_n_Last {
    public static void main(String[] args) {
        int num = 2333945,rem = 0;
        int temp = 0;
        temp = num % 10;
        int lastval=  temp;
        while (num>0) {
            rem = num%10;
            num = num/10;
        }
        System.out.println(lastval);
    }
}
//pending