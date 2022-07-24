public class fibonacciSeriesRecursion{
    int n = 5;

    public static int fun(int a,int b,int n){
        if (n==5) {
            return 0;
        }
            int c = a+b;
            System.out.print(c+ " ");
            fun(b,c,n+1);
            return 0;

        }
    public static void main(String[] args) {
            int a = 0;
            int b = 1;
            int count = 1;
            System.out.print(a+ " "+b+" ");
            fun(a,b,count);

        
    }
}
