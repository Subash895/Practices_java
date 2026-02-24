
public class AgainPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="SubbuS";
		String reversed="";
		for (int i=word.length()-1;i>=0;i--) {
			reversed+=word.charAt(i);
		}
		if (word.equals(reversed)) {
			System.out.println("Palindrome  "+reversed);
		}
		else {
			System.out.println("Not a Palindrome  "+reversed);
		}
	}

}
