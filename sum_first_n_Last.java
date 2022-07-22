public class sum_first_n_Last {
    public static void main(String[] args) {
        int num = 12309,rem=0,temp=0,lastValue = 0;
        temp = num%10;
        lastValue = temp;
        while (num>0) {
            rem = num%10;
            num = num/10;

        }
        int sum = lastValue+rem;
        System.out.println(lastValue);
        System.out.println(rem);
        System.out.println(sum);
    }
}
