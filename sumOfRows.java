import java.util.Scanner;
class sumOfRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); //2
        int cols = sc.nextInt(); //3
        int arr[][] = new int[rows][cols];
        System.out.println("Enter element in array :");
        System.out.println();
        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // printing 
        System.out.println("this is 2d array :");
    
        for(int i = 0;i< rows; i++  ){
            int sum = 0;
            for( int j = 0 ;j< cols;j++){
                sum = sum + arr[i][j];
            }
            System.out.println(sum);
            System.out.println();
        }
        
        
    }
}