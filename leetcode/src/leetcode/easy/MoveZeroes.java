package leetcode.easy;

import java.util.Arrays;

public class MoveZeroes {
	
	/*
	 *  Basically implemented a bubble sort mechanism, where we are floating the zeroes to the end 
	 *  of the list. One catch is that we need to incrementally block out from the end of the list
	 *  only if a zero is encountered. Which means the second for loop length does NOT depend on the i
	 * , it depends on a counter variable which is incremented only in the event of a zero encounter.
	 */
	public static void moveZeroes(int nums[]) {
		//{1,0,3,0,4}
		//{1,3,0,4,0}
		//{1,3,4,0,0}
		
		
		//{0,0,1}
		//{0,1,0}
		int c=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]!=0&&nums[i+1]==0) {
				exchange(nums,i,i+1);
				continue;
				
			}
			if(nums[i]!=0)
				continue;
			
			for(int j=i;j<nums.length-c-1;j++)
				exchange(nums,j,j+1);
			c++;
		}
		
	}
	private static void exchange(int [] nums, int i, int j ) {
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	public static void main(String[] args) {
		int nums [] = new int[] {0,0,1};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

}
