package leetcode.easy;

import java.util.Arrays;
import java.util.Stack;

/*
 * Input is an array in which every element occurs twice except one. Find that element
 * Sorted the array first, then iterate through the array, by comparing two elements at a time,
 * if it's not equal, return left of  the compared element.
 */
public class SingleNumber {
	
	public static int singleNumber(int []arr)
	{
		if(arr.length==1) return arr[0];
		Arrays.sort(arr);
		//{1,1,2,2,4};
		int i =1;
		int n = arr.length;
		while(i<n)
		{
			if(arr[i]==arr[i-1]) {
				i+=2;
				continue;
			}
			else
				return arr[i-1];
				
		}
		return arr[i-1];
	}
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {4,1,2,1,2,4,3,5,3}));
	}

}
