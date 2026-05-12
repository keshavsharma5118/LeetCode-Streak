
import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int p1, p2;
        int sum;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            p1 = i;
            p2 = size - 1;
            sum = nums[p1] + nums[p2];
            if (sum == target) {
                return new int[]{p1, p2};
            } else if (sum > target) {
                p2--;
            } else if (sum < target) {
                p1++;
            }
        }
         return new int[]{p1, p2};
    }

    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution s = new Solution();
        int[] result = s.twoSum(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
// Dry run 
// #1   sort the array
//  p1   p2  sum     result            decision
//  2    15   17     sum > target      right shift
//  2    11   13     sum > target      right shift 
//  2    7    9      sum = target      return  
