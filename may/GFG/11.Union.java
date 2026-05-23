class Solution {
	public static ArrayList<Integer> findUnion(int a[], int b[]) {
		int n = a.length;
		int m = b.length;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int i = 0, j = 0;
		
		while (i<n && j<m) {
			if (i>0 && a[i - 1] == a[i]) {
				i++;
				continue;
			}
			if (j>0 && b[j - 1] == b[j]) {
				j++;
				continue;
			}
			
			if (a[i]<b[j]) {
				list.add(a[i]);
				i++;
			}
			else if (b[j]<a[i]) {
				list.add(b[j]);
				j++;
			}
			else {
				list.add(a[i]);
				i++;
				j++;
			}
		}
		
		// if element left in a[] -> add to list
		
		while (i<n) {
			if (i>0 && a[i - 1] == a[i]) {
				i++;
				continue;
			}
			list.add(a[i]);
			i++;
		}
		
		while (j<m) {
			if (j>0 && b[j- 1] == b[j]) {
				j++;
				continue;
			}
			list.add(b[j]);
			j++;
		}
		return list;
	}
}


// class Solution {
//     public static ArrayList<Integer> findUnion(int a[], int b[]) {
//        int n1 = a.length;
//        int n2 = b.length;
//        int [] arr = new int[n1+n2];
//        ArrayList<Integer> list = new ArrayList<>();
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0; i < n1 ; i++){
//            arr[i] = a[i];
//        }
//        for(int j =0; j<n2; j++){
//            arr[n1+j] = b[j];
//        }
//        Arrays.sort(arr);
       
//        for(int k = 0; k < arr.length; k++){
//            if(!set.contains(arr[k])){
//                set.add(arr[k]);
//                list.add(arr[k]);
//            }
//        }
//        return list;
       
//     }
// }