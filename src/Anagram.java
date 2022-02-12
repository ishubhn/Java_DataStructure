import java.util.Arrays;

public class Anagram {

	public boolean isAnagram (char[] s1, char[] s2) {
		if (s1.length != s2.length) return false;
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for (int i = 0; i < s1.length;i++) {
			if(s1[i] != s2[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram a = new Anagram();
		System.out.println(a.isAnagram("ower".toCharArray(), "flowre".toCharArray()));
	}

}
