class SmallestSum {
	public static void main(String[] args) {
		int[] nums1 = {1, 7, 11};
		int[] nums2 = {2, 4, 6};
		int size = 2 * (nums1.length * nums2.length);
		int[] pairs = new int[size];
		int[] sums = new int[size/2];
		int k = 3;
		
		int m = 0;
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
					pairs[m] = nums1[i]; 
					m = m + 1;
					pairs[m] = nums2[j];
					m = m + 1;
			}
		}
		
		for (int x = 0; x < pairs.length; x++) {
			System.out.print(pairs[x] + " ");
		}
		System.out.println("\n");
		
		/*
		for (int p = 0; p < sums.length; p++) {
			System.out.print(sums[p] + " ");
		}
		*/
	}
}



