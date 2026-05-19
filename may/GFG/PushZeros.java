class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0;
        int [] temp = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            if(arr[i]!=0)
                temp[j++]=arr[i];
        }
        
        while (j<n){
            temp[j++] = 0;
        }
        
        for(int k = 0 ; k< n ; k++){
            arr[k] = temp[k];
        }
        
    }
}