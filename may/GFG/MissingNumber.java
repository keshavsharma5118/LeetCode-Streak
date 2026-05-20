class Solution {
    int missingNum(int arr[]) {
        int size   = arr.length;
        long n = size+1;
        
        long totalSum = n*(n+1)/2;
        long currentSum = 0;
        
        for(int i = 0 ; i < size ; i++){
            currentSum += arr[i];
        }
        
        return (int)(totalSum - currentSum);
    }
}
