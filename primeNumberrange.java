// what is real for loop :-- we can learn from here
//pending for loop full
public class primeNumberrange {
    public static void main(String[] args) {
        int count=0;
        for (int j = 1; j <= 100; j++) {
            int num = j,i;
            for ( i = 2; i < num; i++) {   // for loop revolve 100% only in Prime Number 
                if (num%i == 0) {
                    break;
                }
             }
             if (i == num) {
                 System.out.println(i);
                 count++;
             }
             if (count==10) {
                break;
             }
        }
        // System.out.println(count);
        
    }
}



