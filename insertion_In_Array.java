// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Insertion_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int pos = 1;
        int item = 60;
        int arr[] = new int[size+1];
        // {12,23,46,7, _ }
        System.out.println("Enter elements in array");
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        
        // logic
        for(int i = arr.length-1;i>pos;i--){
            arr[i] = arr[i-1];
        }

        arr[pos] = item;

        // // arr[1]  = 60;
        
        
        // printing array
        System.out.println("elements in array are ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}