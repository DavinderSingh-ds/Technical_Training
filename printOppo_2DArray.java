// 1 2 3         3 2 1
// 4 5 6  ====   6 5 4
// 7 8 9         9 8 7
// Ans 

import java.util.Scanner;
public class printOppo_2DArray {
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
        
        for(int i =0;i<rows;i++){
            for(int j = cols-1;j>= 0;j--){
                //only reverse i and j
                 System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    
}
}
