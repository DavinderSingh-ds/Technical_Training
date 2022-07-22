public class sumEvenOdd {
    public static void main(String[] args) {
        int count = 100,evenSum=0,oddSum = 0;
        for (int i = 1; i <= count; i++) {
            if (i%2 == 0) {
                evenSum = evenSum+i;
            }
            else{
                oddSum = oddSum+i;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
