public class frequencyElementArray {
    public static void main(String[] args) {
        int arr[] = new int [] {1, 2, 1, 22,22,34,45};  
        //Array fr will store frequencies of element  
        int fr[] = new int [arr.length];  
        int visited = -1;  

        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        } 
        for (int index = 0; index < fr.length; index++) {
            if (fr[index] != visited) 
            {
                System.out.println(arr[index]+" "+fr[index]); 
            }        
        }
    }
}
