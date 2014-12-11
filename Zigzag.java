public class Zigzag {

	public static void main(String[] s) {

		String string = "PAYPALISHIRING";
	    String result=	convert(string, 3);
		System.out.println(""+result);
	}

	// 第一行是 0 4 8
	// 第二行是 1 3 5
	// 第三行是 2 6 10

	//

	// 这是三行的情况
	// 如果是4行的话　４　２　
	// 如果是5行的话 5 3 1
	// 如果是6 行的话 6 4 2 6
	// 7行的话 7 5 3 1

	// 第一行是能够%4的 nrows+nrows-2 第二列
	// 那么第一行的就是一个等差数列的和的值
	// 第二行挨个的值是 1 7 等差数列的值的+1
	// 第三行 2 8
	// 第几行要参与进去 第 x0开始 行 挨个占数组中的index 从左到右依次是 x x行的字母个数是 总的字母个数 除以 等差数列的和
	// 第 x行 从左到右的值的index 是 x

	// 一个for循环搞定的话 你必须知道 久的 index 在新的index中的地方 。。。

	// 1 在第3个位置 4在第1 8在第 2 3 在第4 2 在第6 6在7

	// oldIndex 和 nrows 还有一个条件是 string的长度 得到新的index
	// oldIndex string/sum 有多少个重复的块 第一行就有多少个数 oldIndex string/sum

	// 第一行的个数加上第二行的个数

	// 分双行或者是单行 。。。。

	// 先看单行
	// newIndex= string/sum(nRows) 第一行 第二行是第一行的两倍-1 第三行是第二行的两倍 -1
	// *(sum(oldIndex)) //只是第一列
	//
	// 主要的问题解决是 根据oldindex 得到新的index
	private static int twoNFang(int n) {

		int mitu = 1;
		for (int i = 0; i < n; i++) {
			mitu *= 2;
		}
		return mitu;
	}

	// 显示成图形时 第n行的字母的个数
	//
	private static int countNChar(int indexRow, int coun1Char) {
		return (twoNFang(indexRow + 1) - 1) * coun1Char
				- (twoNFang(indexRow + 1) - indexRow - 1);
	}

	// 显示成图形时， 前N行的和的个数
	private static int sumNRowsCoutNchar(int num, int coun1Char) {

		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += countNChar(i, coun1Char);
		}
		return sum;
	}

	private static String convert(String str, int nrows) {
		int strLen = str.length();
		StringBuffer[] buffer = new StringBuffer[nrows];
        //使用这个初始化，空指针错误
		/*for (StringBuffer stringBuffer : buffer) {
			stringBuffer = new StringBuffer();
		}*/
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = new StringBuffer();
		}
		int indexStr = 0;
		int indexBuffer;
		while (indexStr < strLen) {
			// o~nrow
			for (indexBuffer = 0; indexBuffer < nrows && indexStr < strLen; indexBuffer++) {
				buffer[indexBuffer].append(str.charAt(indexStr++));
			}
			// nrow~0
			for (indexBuffer = nrows-2; indexBuffer > 0 && indexStr < strLen; indexBuffer--) {
				buffer[indexBuffer].append(str.charAt(indexStr++));
			}
		}
		for (int i = 1; i < buffer.length; i++) {
			buffer[0].append(buffer[i]);
		}

		return buffer[0].toString();

	}

	/*
	 * private static void convert(String str, int nrows) { StringBuffer str1 =
	 * new StringBuffer(); StringBuffer str2 = new StringBuffer(); StringBuffer
	 * str3 = new StringBuffer();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * for (int i = 0; i < str.length(); i += 4) { str1.append(str.charAt(i)); }
	 * for (int i = 1; i < str.length(); i += 2) { str1.append(str.charAt(i)); }
	 * for (int i = 2; i < str.length(); i += 4) { str1.append(str.charAt(i)); }
	 * str1.append(str2).append(str3); System.out.println("结果是" +
	 * str1.toString()); }
	 */
	// 7 5 3 1 // 8 6 4 2
	private static int sumN(int n) {
		int count = (n + 1) / 2;
		int a1 = n % 2;
		int an = n;
		int sum = (a1 + an) * count / 2;
		return sum;
	}

}
