class Solution {
	public ArrayList<Integer> intersect(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> result = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0 ; i < n ; i++) {
			set.add(a[i]);
		}
		for (int j = 0 ; j < m ; j++) {
			set1.add(b[j]);
		}
		int i = 0;
		while (i < n) {
			if (set.contains(a[i]) &&
			set1.contains(a[i])) {
				result.add(a[i]);
			}
			i++;
		}
		
		for (int x : result) {
			list.add(x);
		}
		return list;
	}
}

