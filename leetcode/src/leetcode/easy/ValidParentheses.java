package leetcode.easy;


import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
	
	public static boolean isValid(String input)
	{
		HashMap<Character,Character> brackets = new HashMap<>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
																	put('(',')');
																	put('{','}');
																	put('[',']');
		}};
		char[]array = input.toCharArray();
		Stack<Character> stack = new Stack<>();
		if(array.length%2!=0)
			return false;
		for(int i=0;i<array.length;i++)
		{
			if(brackets.containsKey(array[i]))
				stack.push(array[i]);
			else
			{
				if(stack.isEmpty())
					return false;
				if(array[i]!=brackets.get(stack.pop()))
					return false;
					
			}
		}
		return(stack.isEmpty());
	}
	public static void main(String []args)
	{
		System.out.println(isValid("([])"));
		
	}

}
