class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n ; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                list.add(arr[i]);
                
            }
        }
        return list;
    }
}