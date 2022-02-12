
public class CheckPalindrome {
	
	public boolean isPalindrome (String s) {
		int forward = 0;
		int backward = s.length() - 1;
		
		while (forward < backward) {
			if(Character.toLowerCase((s.charAt(forward))) != Character.toLowerCase(s.charAt(backward))) {
				return false;
			}
			
			forward++;
			backward--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		CheckPalindrome cp = new CheckPalindrome();
		
		System.out.println(cp.isPalindrome("Soosos"));
	}

}
