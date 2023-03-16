package leetcode.easy;

public class ArrayofDigits {
	public static int[] plusOne(int [] digits)
	{
		int i = digits.length-1;
		int result[];
		int carry=0;
		//[1,2,3]
		while(i>=0)
			if(digits[i]==9) {
				digits[i]=0;
				i--;
				carry=1;
				continue;
				}
			else {
				digits[i]++;
				carry=0;
				break;
			}
		if(carry==1) {
			result = new int[digits.length+1];
			result[0]=carry;
			for(int j=0; j<digits.length;j++)
				result[j+1] = digits[j];
			return result;
			
		}
		else
			return digits;
			
				
			
		
		}
	public static void main(String []args)
	{
		int [] result = plusOne(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3});
		for(Integer i : result)
			System.out.print(i+"");
		
	}

}
