import java.util.Arrays;

public class ReverseArray {
	public int[] toReverseArray(int[] arr) {
		int firstIndex = 0;
		int lastIndex = arr.length - 1;
		
		for(int i = 0; i <= arr.length - 1; i++) {
			
			while(firstIndex < lastIndex) {

				arr[firstIndex] = arr[firstIndex] + arr[lastIndex]; //10+20 = 30
				arr[lastIndex] = arr[firstIndex] - arr[lastIndex];	//30-20 = 10
				arr[firstIndex] = arr[firstIndex] - arr[lastIndex];	//30-10 = 20
				
				firstIndex++;
				lastIndex--;
			}
			
			if (firstIndex == lastIndex) {
				break;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] bArray = {1,2,3,4};
		
		ReverseArray sol = new ReverseArray();
		System.out.println(Arrays.toString((sol.toReverseArray(bArray))));
		
	}
}
