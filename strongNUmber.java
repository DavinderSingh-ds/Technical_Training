public class strongNUmber {
    public static void main(String[] args) {
        int num = 145,temp=num,sum = 0;

        while (num>0) {
            int rem = num%10;
            int fact = 1;
            for (int i = rem; i >1; i--) {
                 fact = fact*i;
            }
            sum = sum+fact;
            num = num/10;         
        }
        System.out.println(sum);

        if (sum == temp) {
            System.out.println("Strong Number");
        }else{
            System.out.println("Not Strong Number");
        }
    }
}
