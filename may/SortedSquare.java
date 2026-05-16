class Solution {
 // ex - input = [-2,-1,0,2,4,5];
    public int[] squareSorted(int nums[]){
        ArrayList<Integer> newNum = new ArrayList<>();
        int size=nums.length;
        int negCount=0;
        int p1=0;
        int p2=0;
        int [] newArray = new int[size];  
        for(int i =0; i<size; i++)
        {
                if(nums[i]<0)
                {
                 negCount++;
                }
        }
    // from the above code we got:  neg_count = 2;
    // so what have two index negative = 0->(neg_count)
    // now we are going to square the elements     
        for(int k = 0; k<size; k++)
        {
            nums[k] = nums[k]*nums[k];
        }
    // we got the new array = [4,1,0,4,16,25]
    // now we need to make it sorted output shoud be = [0,1,4,4,16,25]
    // so we can make it by comparing and adding into the ArrayList
    // IF(NUMS[NEG_COUNT-i-1]> NUMS[NEG_COUNT+I]){
        p1=negCount-1;
        p2=negCount;
         for(int j = 0; j< size; j++)
         {
             
            if(p1>=0 && p2<size)
            {
                 if(nums[p1]<=nums[p2] )
                 {
                    newNum.add(nums[p1]);
                    p1--;
                 }
                 else 
                 {
                    newNum.add(nums[p2]);
                    p2++;
                 }
            } 
            else if(p1>=0)
                {
                newNum.add(nums[p1]);
                p1--;
                }
            else if(p2<size)
                {
                newNum.add(nums[p2]);
                p2++;
                }
         }
        for(int ikj =0; ikj<size ; ikj++)
           {
           newArray[ikj]=newNum.get(ikj);
           }
        return newArray;
    }
    

    // Main Function;
    public static void main(String args [])
    {
    Solution s1 = new Solution();
        int nums[] = {-2,-1,5,6,7,8};
        int ans[] =s1.squareSorted(nums);
        System.out.println(Arrays.toString(ans));
    }
}