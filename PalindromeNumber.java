public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		int tmp = x;
		long result = 0;
		if (x < 0) {
			return false;
		}
		if (x==0) {
			return true;
		}
		while (tmp > 0) {
			int diggit = tmp % 10;
			result = result * 10 + diggit;
			tmp = tmp / 10;
		}
		if (x==(int)result) {
			return true;
		}
		return false;
	}

}
