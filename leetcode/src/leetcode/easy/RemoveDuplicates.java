package leetcode.easy;

public class RemoveDuplicates {
	public static int removeDuplicates(int[]nums)
	{
		int i;
		int j=0;
		int index=0;
		for(i=0;i<nums.length;i=j){

			while(j<nums.length&&nums[i]==nums[j]) j++;
			nums[index]=nums[i];
			index++;
			
		}
		return index;
	}
	public static void main(String [] args)
	{
		int nums[] = {1,1,2,3,4};
		int index=removeDuplicates(nums);
		for(int i=0;i<index;i++)
			System.out.println(nums[i]);
		
	}
}


