// Swapping contents of two equal sized arrays.

class ArraySwap {
	public static void main(String[] args) {
    //Same logic as swapping values of two integers
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {6, 7, 8, 9, 0};
		int[] temp = new int[array1.length];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = array1[i];
			array1[i] = array2[i];
			array2[i] = temp[i];
		}
		
		for (int j = 0; j < temp.length; j++) {
			System.out.println(" Array 1: " + array1[j] + " Array 2: " + array2[j]);
			
		}
		
	}
}
