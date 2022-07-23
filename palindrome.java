public class palindrome {
        public static void main(String[] args) {
            for (int i = 100; i <=1000; i++) {
                int rem=0,sum=0;
                int num = i,temp=num;                
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
}
