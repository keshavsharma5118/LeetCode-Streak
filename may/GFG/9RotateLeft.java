class Solution {
    
    static void reverseArray(int [] arr , int start, int end){
        for(int i = start, j = end-1; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void rotateArr(int arr[], int d) {
      int n = arr.length;
      d %=n;
      reverseArray(arr, 0 ,d);
      reverseArray(arr, d, n);
      reverseArray(arr, 0, n);
        
    }
}

// i/p :  [1,2,3,4,5], rotate by 2
// o/p :  [3,4,5,1,2];

// from our approach 
// reverseArray(arr,0,d) => [2,1,3,4,5]
// reverseArray(arr,d,n) => 