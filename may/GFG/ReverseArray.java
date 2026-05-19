// class Solution {
//     public boolean isSorted(int[] arr) {
//         int n = arr.length;
//         boolean flag = false;
    
//     // if  n = 8
//     // i - 1-> 6;
    
//         if ( n == 1){
//         flag = true;
//         return flag;
//         }
//         for(int i =0; i<n-1; i++ ){  
            
//             if(arr[i]<=arr[i+1])
//                 {
//                   flag  = true;
//                 }
//             else
//                 {
//              flag = false;
//              return flag; 
//                 }   
//         }
//         return flag; 
        
//     }
// }


// OPTIMIZED CODE 

class Solution {
 public boolean isSorted(int [] arr){
    int n = arr.length;
    
    for(int i = 0 ; i<n-1; i++){
        if(arr[i]>arr[i+1])
            return false;
        }
    return true;
 }
}