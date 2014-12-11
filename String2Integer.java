import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*实现atoi
 * 特殊情况
 * 1.包含出数字之外的其他字符
 *   a.小数点应该也是特殊符号。比如String str="1.223";也是不符合要求的。
 * 2.只包含数字，但是转换后的大于了2^32-1
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

 The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

 If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

 If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * 从第一个不是空格的开始算，如果有符号(+或者-)选择一个，假如(++2)返回0
 * */
public class String2Integer {

	public static void main(String[] args) {

		System.out.println("" + Integer.parseInt("45874"));
		atoi("asdf");
		atoi("124");
		atoi("23fr5");
	}

	public static int atoi(String str) {
		long result = 0;
		boolean hasNumDiggit = false;
		boolean hasSign=false;
		boolean hasTwoSign = false;
		int plus = -1;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ' && !hasNumDiggit&&!hasSign) {// space
				continue;
			} else if ((str.charAt(i) == '+' || str.charAt(i) == '-')
					&& !hasNumDiggit) {
				hasSign=true;
				if (plus == -1) {
					plus = str.charAt(i);
					continue;
				} else if (plus == str.charAt(i - 1)) {
                    break;
				}
			} else if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
				hasNumDiggit = true;
				result = result * 10 + (str.charAt(i) - '0');
				if (result > Integer.MAX_VALUE) {
					break;
				}
			} else {
				break;
			}
		}
		// 最后判断应该返回Integer.MAX_VALUE还是Integer.MIN_VALUE
			if (result>Integer.MAX_VALUE) {
				if (plus=='-') {
					result =Integer.MIN_VALUE;
				}else {
					result=Integer.MAX_VALUE;
				}
				return (int)result;
			}
		if (plus == '-') {
			result = -1 * result;
		}

		return (int) result;
	}
}
