public class armstrong_hundred_to_Thousand {
    public static void main(String[] args) {
        for (int i = 101; i <= 10001; i++) {
            int num = i,temp=num,temp2=temp,count=0,rem=0,store=0,sum=0;
            while (num>0) {
                num = num/10;
                count++;
            }
            while (temp>0) {
                rem = temp%10;
                temp = temp/10;
                store = (int)Math.pow(rem, count);
                sum = sum+store;
            }
            System.out.println(sum);
            if (sum == temp2) {
                System.out.println("Armstrong Number");
            }
        }
        
    }
}
