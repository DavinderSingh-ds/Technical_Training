public class frequencyDigit {
    public static void main(String[] args) {
        int num = 595252,rem = 0,storeRem = 0,count = 0,
        rem2= 0 , sum2 = 1,num2 = num;
        ;
        while (num>0) {
            rem = num%10;
            num = num/10;
            storeRem = rem;
            // System.out.println(storeRem);
            while(num2>0)
            {
                rem2 = num2 % 10;
                num2 = num2/10;
                // System.out.println(rem2);
                if (rem2 == storeRem ) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
//pending