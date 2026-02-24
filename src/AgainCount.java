
public class AgainCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word ="Subbu";
		char[] arr=word.toCharArray();
		for (int i=0;i<arr.length;i++) {
			if (arr[i]=='0')
				continue;
			int count=1;
			for (int j=i+1;j<arr.length;j++) {
				if (arr[j]==arr[i]) {
					count++;
				arr[j]='0';
				}
				
			}
			System.out.println( arr[i]+" "+count);
		}
		
	}

}
