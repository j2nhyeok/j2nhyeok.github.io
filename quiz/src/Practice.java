import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		int haha[] = {0,1,2,3,4,5,6,7,8,9,10};
		
		
		
		int[] arr1 = Arrays.copyOfRange(haha,5, 11);
		
		for(int number : arr1) {
			System.out.print(number + " ");
		}
		
	}

}
