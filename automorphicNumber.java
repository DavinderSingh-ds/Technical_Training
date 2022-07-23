public class automorphicNumber {
    public static void main(String[] args) {
        int num = 25,temp = num,rem=0,count=0;
        int sq = num * num;
        while (num>0) {
            num = num/10;
            count++;
        }
        int div = (int) Math.pow(10, count);
        rem = sq%div;
        System.out.println(rem);

        if (rem == temp) {
            System.out.println("Automorphic Number");
        }else{
            System.out.println("Not Automorphic Number");
        }
        
    }
}
