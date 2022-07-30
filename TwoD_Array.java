// diagonal sum
import java.util.Scanner;
class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); //2
        int cols = sc.nextInt(); //3
        int arr[][] = new int[rows][cols];
        System.out.println("Enter element in array :");
        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //logic
        int sum = 0;
         for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){
               if(i == j){
                   sum = sum + arr[i][j];
               }
            }
        }
        
        System.out.println(sum);
        
        
        
        // printing 
        // System.out.println("this is 2d array :");
        
        // for(int i =0;i<rows;i++){
        //     for(int j = 0;j<cols;j++){
        //          System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        
    }
}