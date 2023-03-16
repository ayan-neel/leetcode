package leetcode.easy;

public class SearchInsertPosition {
	public static int search(int element,int []array,int lo,int hi)
	{
		if(lo>=hi)
			return lo;
		int mid = lo+(hi-lo)/2;
		if (array[mid]==element)
			return mid;
		if(element>array[mid])
			return search(element,array,mid+1,hi);
		else
			return search(element,array,lo,mid);
	}
	public static int searchInsert(int target, int[]array)
	{
		int lo = 0;
		int hi = array.length-1;
		int index = search(target,array,lo,hi);
		if(target>array[index])
			return index+1;
		else
			return index;
	}
	public static void main (String [] args)
	{
		int []a = {1,3,5,6};
		int index = searchInsert(1,a);
		System.out.println(index);
	}

}
