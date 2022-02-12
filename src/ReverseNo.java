
public class ReverseNo {
	public int isReverse (int num) {
		// 1234
		int reverse = 0;
		int remainder = 0;
		
		while (num > 0) {
			remainder = num % 10;	// 4
			num = num / 10;		// 123
			reverse = (reverse * 10) + remainder; //4
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		ReverseNo rev = new ReverseNo();
		System.out.println(rev.isReverse(102));
	}

}
