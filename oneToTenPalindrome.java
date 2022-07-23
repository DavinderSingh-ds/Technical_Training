public class oneToTenPalindrome {
    public static void main(String[] args) {
        int num = 12321,temp=num,rem=0,sum=0;
        while (num>0) {
            rem = num%10;
            num = num/10;
            sum = (sum*10)+rem;
        }   
        System.out.println(sum);

        if(sum == temp){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }
}