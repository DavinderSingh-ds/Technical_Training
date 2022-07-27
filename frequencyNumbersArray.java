public class frequencyNumbersArray {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,4,4,4,5};
        int frArr[] = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frArr[j] = visited;
                }
            }
            if (frArr[i] != visited) {
                frArr[i] = count;
            }
        }
        for (int i = 0; i < frArr.length; i++) {
            if (frArr[i] != visited) 
            {
                System.out.println(arr[i]+" "+frArr[i]); 
            }    
        }
    }
}
