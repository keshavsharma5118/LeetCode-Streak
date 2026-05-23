class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
       int n = arr.length;
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       HashMap<Integer, Integer> map = new HashMap<>();
       
       
       for(int i = 0; i < n ; i++){
           if(map.containsKey(arr[i])){
               map.put(arr[i], map.get(arr[i])+1);
           }
           else {
               map.put(arr[i],1);
           }
        }
        for(int key: map.keySet()){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(key);          // number
            temp.add(map.get(key)); // frequency
            
            list.add(temp);
        }
       return list;
    }
}