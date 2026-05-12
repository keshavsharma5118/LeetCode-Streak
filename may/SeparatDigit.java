import java.util.ArrayList;
class Solution {
    public int[] separateDigits(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            int k = 0;
            // first loop created for traversing from back and digit extraction 
            for(int i = nums.length-1; i>=0; i--){
                while(nums[i]>0){
                 int digit = nums[i]%10;
                 list.add(digit);
                 nums[i]/=10;
                }
            }
            // array initialization 
            int [] answer = new int[list.size()];
           
           // reversal loop and add to answer array
            for(int j=list.size()-1; j>=0 ; j--){
                answer[k]= list.get(j);
                k++;
                }
            // return statement
            return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {13,25,83,77};
        int [] result = s.separateDigits(nums);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
    
}