public class palindrome {
        public static void main(String[] args) {
                int rem=0,sum=0;
                int num = 151,temp=num;                
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
