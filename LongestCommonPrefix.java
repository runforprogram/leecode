

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 */
public class LongestCommonPrefix {
	/**
	 * @param strs 
	 * own solution
	 * @return
	 */
	public String longestCommonPrefix0(String[] strs) {
		if (strs.length < 1) {
			return "";
		}
		String result = "";
		StringBuilder resulttmpBuilder = new StringBuilder();
		int minLen = strs[0].length();
		result = strs[0];
		for (int i = 1; i < strs.length; i++) {
			if (minLen > strs[i].length()) {
				minLen = strs[i].length();
				result = strs[i];
			}
		}
		int i = 0;
		int j = 0;
		while (i < minLen) {
			resulttmpBuilder.append(result.charAt(i));
			for (j = 0; j < strs.length; j++) {
				if (strs[j].startsWith(resulttmpBuilder.toString())) {
					continue;
				} else {
					resulttmpBuilder.deleteCharAt(i);
					break;
				}
			}
			if (j == strs.length) {
				i++;
			} else {
				break;
			}
		}
		return resulttmpBuilder.toString();
	}

	/**
	 * @param 网上的
	 *            ，这个代码写的简短。 拿一个字符串和每个字符串先比较完。
	 * 
	 * @return
	 */
	public String longestCommonPrefix1(String[] strs) {
		if (strs.length == 0)
			return "";
		String str0 = strs[0];
		if (str0.length() == 0)
			return "";
		int rightMostIndex = str0.length() - 1;
		for (int k = 1; k < strs.length; k++) {
			for (int i = 0; i <= rightMostIndex; i++) {
				if ((i > strs[k].length() - 1)
						|| strs[k].charAt(i) != str0.charAt(i))
					rightMostIndex = i - 1;
			}
		}
		return rightMostIndex >= 0 ? str0.substring(0, rightMostIndex + 1) : "";
	}

	/**
	 * @param strs
	 *            另一种想法，一个字符串和每个字符串的第i个字符比较 The first one is apparently not very
	 *            optimal. Imagine only the last string is different from all
	 *            others. You would have wasted so much time comparing the
	 *            previous ones. The second one is the optimal solution. The
	 *            question is equivalent to: what is the fastest way to fail? It
	 *            seems the second one is the only answer.
	 * @return
	 */
	public String longestCommonPrefix2(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if (i == strs[j].length() || strs[j].charAt(i) != c)
					return strs[0].substring(0, i);
			}
		}
		return strs[0];
	}
}
