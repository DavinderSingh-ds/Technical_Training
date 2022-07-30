import java.util.Scanner;

public class TransposeArray_rows_and_cols_not_same {
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
        // printing 
        System.out.println("this is 2d array :");
        

        // v. imp.     reverse also cols and rows
        for(int i =0;i<cols;i++){
            for(int j = 0;j<rows;j++){
                //only reverse i and j
                 System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        
        
    }
}
