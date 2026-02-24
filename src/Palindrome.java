
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="HelleH";
		String reversed = "";
		for (int i=word.length()-1;i>=0;i--) {
			reversed=reversed + word.charAt(i);
			
		}if (word.equals(reversed)) {
			System.out.println("Panildrome");
		}else {
			System.out.println("Not Panlindrome ");
		}
		
	}

}
