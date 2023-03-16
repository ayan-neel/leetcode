package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		//nums1 = [1,2,2,1], nums2 = [2,2]
		int [] result = intersection(new int[] {1,2,2,1}, new int[] {2,2});
		System.out.println(Arrays.toString(result));

	}
	public static int[] intersection(int[]nums1, int []nums2) {
		Arrays.sort(nums1); //{1,1,2,2}
		Arrays.sort(nums2); // {1,1}
		ArrayList<Integer> result = new ArrayList<>();
		if(nums1.length>nums2.length) {
			
			for(int i=0;i<nums2.length;i++) {
				int index = binarySearch(nums1, nums2[i]);
				if(index>=0) {
					System.out.println(index);
					result.add(nums2[i]);
					System.out.println("match found");
				}

			}
			
			
		}
		else {
			for(int i=0;i<nums1.length;i++) {
				int index = binarySearch(nums2, nums1[i]);
				System.out.println(index);
				if(index>=0) {
					result.add(nums1[i]);
					
				}
			}
			
		}
		return result.stream().mapToInt(i->i).toArray();
	}
	private static int binarySearch(int []arr, int item) {
		int hi=arr.length-1;
		int lo = 0;
		int index = search(arr,lo,hi,item);
		return index; 
	}
	private static int search(int []arr,int lo,int hi, int item) {
		if(lo==hi) {
			if(arr[lo]==item) return lo;
			return -1;
		}
		if(lo>hi)
			return -1;
		int mid=lo+(hi-lo)/2;
		if(arr[mid]==-1)
			mid--;
		if(arr[mid]==item) 
			return mid;
		if(arr[mid]<item)
			return search(arr,mid+1,hi,item);
		else
			return search(arr,0,mid,item); 
		
		
	
	} 

}
