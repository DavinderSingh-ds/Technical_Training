public class factorialRange {
    public static void main(String[] args) {

        for (int num = 3; num <= 7; num++) {
            int fact = 1;
            for (int i = num; i >1; i--) {   
                fact = fact*i;
            }
            System.out.println(fact);
        }
    }
}
