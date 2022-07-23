

class armstrong{
    public static void main(String[] args) {
        int num = 153,temp=num;
        int rem = 0,sum = 0;
        int count = 0;
        while(temp>0)
        {
            temp = temp/10;
            count ++;
        }
        temp = num;
        // System.out.println(count);
        while (num>0) {
            rem = num%10;
            num = num/10;
            sum = sum + (int) Math.pow(rem, count);
        }
        System.out.println(temp);
        System.out.println(sum);
        if (temp==sum) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not a armstrong number");
        }
    }
}