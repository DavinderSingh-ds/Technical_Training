import java.util.Scanner;
class minElement_in_Matrix {
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

        for(int i = 0;i< rows; i++  ){
            int min = arr[i][0];

            for( int j = 1 ;j< cols;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }


            System.out.println(min);
            System.out.println();
        }
        
        
    }
}
