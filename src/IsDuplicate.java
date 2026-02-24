
public class IsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,2,21,1,3,4,5,1,4,};
		for (int i=0;i<arr.length;i++) {
			boolean isDuplicate=false;
			for (int j=0;j<i;j++) {
				if (arr[i]==arr[j]) {
					isDuplicate=true;
					break;
					}
			}
			if(!isDuplicate)
				System.out.println(""+arr[i]);
		}

	}
}