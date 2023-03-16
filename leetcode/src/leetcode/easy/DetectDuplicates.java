package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DetectDuplicates {
	public boolean detectDuplicates(int []arr)
	{
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		if(set.size()==arr.length) return false;
		return true;
		
	}

}
