public class swap_first_n_Last {
    public static void main(String[] args) {
        int num = 234768975,temp = num,temp2=temp,count = 0;

        int lastDIg = num%10;

        while (num>0) {
            num = num/10;
            count++;
        }

        int firstDig = temp / (int)Math.pow(10, count-1);
        
        int midDig = temp2 % (int)Math.pow(10, count-1);
        int swap = lastDIg;
        swap = swap * (int)Math.pow(10, count-1);
        swap = swap+midDig;  
        swap = swap-lastDIg;    
        swap = swap + firstDig;
        System.out.println(swap);
        
    }
}