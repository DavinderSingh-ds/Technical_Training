import java.util.Scanner;  
public class insertionArray   
{  
    public static void main(String[] args)   
    {  
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] array = new int[size+1];
        //arr  = {12 23 34 45 56 _ }
        int pos = 2;
        System.out.println("Enter elements in array : "); 
        for(int i=0; i<array.length-1; i++)  
        {   
            array[i]=sc.nextInt();  
        }  
        int m = 1;
        for(int i = pos; i<array.length-1;i++){
                array[array.length-m] =  array[array.length-1-m]; 
                m++;
        }  
        array[pos] = 4;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }  
} 