public class Armstrong2 {
    public static void main(String[] args) {
        for (int j = 1; j <= 153; j++) {
            int num = j,temp=num,temp2 = temp,count=0,rem = 0,sum=0;
            while (num>0) {
                num = num/10;
                count++;
            }
            while (temp>0) {
                rem = temp%10;
                temp = temp/10;
                int d = (int)Math.pow(rem,count);
                sum = sum+d;
            }

            if (sum == temp2) {
                System.out.println(sum+" "+"Armstrong");
                }
            }
    }
}
