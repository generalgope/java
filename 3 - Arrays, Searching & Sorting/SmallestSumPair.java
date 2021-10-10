// Work in progress...

class SmallestSumPair {
	public static void main(String[] args) {
		int[] nums1 = {1, 7, 11};
		int[] nums2 = {2, 4, 6};
		int size = 2 * (nums1.length * nums2.length);
		int[] pairs = new int[size];
		int[] sums = new int[size/2];
		int k = 3;
		
		// Step 1: Make all possible pairs and store them in pairs[]
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
		
		// Step 2: Add each element in the pair and store the sum in sum[]
		// Step 3: Find the smallest value (sum) in sum[]
		// Step 4: Output the pair (from pairs[]) which has the smallest sum
		
		/*
		for (int p = 0; p < sums.length; p++) {
			System.out.print(sums[p] + " ");
		}
		*/
	}
}



