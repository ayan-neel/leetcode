package leetcode.easy;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

	}
	public static int lengthOfLastWord(String word)
	{
		String [] arr = word.split(" "); //split omits blank strings. no need for extra check
		int j=arr.length-1;
		//while(arr[j].isBlank()) j--;
		return arr[j].length();
		
	}

}
