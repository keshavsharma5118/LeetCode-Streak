// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        
        
        // reversing the n-1 array;
        for(int i = 0, j = n-2; i < j ; i++, j--){
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }  
        
        for( int i = 0 , j = n-1 ; i < j ; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
