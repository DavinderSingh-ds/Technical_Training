// 1 2 3         7 4 1
// 4 5 6  ====   8 5 2
// 7 8 9         9 6 3

//90 degree rotation   urf / RotateMatrixClockwise

// wallmart package  22 lac ques

public class Pattern_2DArray {
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
            for( int j =cols-1;j>=0;j--){
                //only reverse i and j
                 System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
}
}
