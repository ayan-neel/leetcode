package leetcode.easy;

import java.util.Arrays;

public class RotateArray {

	/*
	 * in v1 we are using a new array to set the elements in their updated positions
	 * to determine position : we are basically checking if the new position is
	 * within the array length index. if it's not, we are configuring the new
	 * position with a simple i-array.length+k computation.
	 * 
	 * Also, step rotation produces redundant result as 0<step<array.length, if
	 * step>=array.length So, we just need to compute the simplified step with
	 * step%array.length
	 */
	public static int[] rotateV1(int[] array, int step) {
		int[] array2 = new int[array.length];
		int k = step % array.length;
		for (int i = 0; i < array.length; i++) {

			int position = i + k <= array.length - 1 ? i + k : i - array.length + k;

			array2[position] = array[i];

		}
		return array2;
	}
	
	/*
	 * This rotation is an in place rotation.
	 * We'll be shifting the elements by 1 for k times (k steps)
	 * In each of the shift - 
	 * We store the last element in a temp variable
	 * Then we shift rest of the elements by one towards right.
	 * After shifting, we assign the last element stored in the temp variable to the first index.
	 * 
	 */

	public static int[] rotateV2(int[] array, int step) {
		int n = array.length;
		
		int k = step % array.length;
		int d=1;
		while(d<=k) {
		int temp = array[n-1];
		for (int i = n-2; i >=0; i--) {
			array[i+1]=array[i];	
		}
		array[0]=temp;
		d++;
		}
		return array;
	}
		


	public static void main(String[] args) {
		int[] result = RotateArray.rotateV2(new int[] { 1, 2, 3, 4 ,5 , 6, 7}, 2);
		System.out.println(Arrays.toString(result));
	}

}
