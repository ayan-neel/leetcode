package leetcode.easy;

public class BinaryAddition {
	
	public static String addBinary(String binary1, String binary2) //this method is not correct for extremely long binary strings
	{
		String result;
		//convert binary to integer.
		long integer1 = 0;
		long integer2 = 0;
		char [] b1 = binary1.toCharArray();
		char [] b2 = binary2.toCharArray();
		for(int i =b1.length-1;i>=0;i--) {
			integer1+=(b1[i]-48)*Math.pow(2, b1.length-1-i);
		}
		for(int i=b2.length-1;i>=0;i--)
			integer2+=(b2[i]-48)*Math.pow(2, b2.length-1-i);
		System.out.println(integer1+","+integer2);
		result = Long.toBinaryString(integer1+integer2);
		return result;
	}
	
	public static String addBinaryV2(String a, String b)
	{
		int i = a.toCharArray().length-1;
		int j = b.toCharArray().length-1;
		char [] binary1 = a.toCharArray();
		char [] binary2 = b.toCharArray();
		char [] result;
		int carry=0;
		int index;
		result = i>j?binary1:binary2;
		index = i>j?i:j;
		while(i>=0&&j>=0)
		{
			if(binary1[i]=='1'&& binary2[j]=='0'||binary1[i]=='0'&&binary2[j]=='1')
			{
				if(carry==0)
					result[index]='1';
				else {
					result[index]='0';
					carry=1;
				}
				index--;
				i--;
				j--;
				continue;
				
			}
			if(binary1[i]=='0'&&binary2[j]=='0')
			{
				 if(carry==0)
					 result[index]='0';
				 if(carry==1)
					 result[index]='1';
				index--;
				i--;
				j--;
				carry=0;
				continue;
			}
			if(binary1[i]=='1'&&binary2[j]=='1')
			{
				if(carry==0) {
					result[index]='0';
					carry=1;
				}
				else {
					result[index]='1';
					carry=1;
				}
				
				index--;
				i--;
				j--;
				continue;
			}
			}
			
			while(i>=0)
			{
				if(carry==0)
					result[index]=binary1[i];
				else {
					if(binary1[i]=='1') {
						result[index]='0';
						carry=1;
					}
					else {
						result[index]='1';
						carry=0;
						
					}
						
				}
				index--;
				i--;
			}
			while(j>=0)
			{
				if(carry==0)
					result[index]=binary2[j];
				else {
					if(binary2[j]=='1') {
						result[index]='0';
						carry=1;
					}
					else {
						result[index]='1';
						carry=0;
						
					}
						
				}
				index--;
				j--;
			}
			for(Character c : result)
				System.out.print(c);
				System.out.println();
			
			if(carry==1)
			{
				char [] result2 = new char[result.length+1];
				result2[0]='1';
				for(int k =0;k<result.length;k++)
					result2[k+1]=result[k];
				return new String(result2);
				
			}
			return new String(result);
				
		}
		
	

	public static void main(String[] args) {
		System.out.println(addBinaryV2("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));

	}

}
