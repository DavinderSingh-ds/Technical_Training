class anagram{
    public static void main(String[] args) {
        // 123      132  312  132 213   321
        int num1 = 123;
        int num2 = 213;

        int rem=0;
        while (num1>0) {
            rem = num1%10;
            num1 = num1/10;
        }
        System.out.println(rem);
    }
}