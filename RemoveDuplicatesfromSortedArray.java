package com.run.leetcode;

/**
 * @author Administrator 超出时间了，使用的方法是 遇到相同的使num-- 。
 */
public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] A) {
		int num = A.length;
		if (num == 0 || num == 1) {
			return num;
		}
		int index = 1;

		/*
		 * for (int i = 0; i < A.length - 1; i++) { if (A[i] != A[i + 1]) {
		 * A[index++] = A[i + 1]; } }
		 */
		for (int i = 0; i < A.length - 1;) {
			if (A[i] == A[i + 1]) {
				num--;
				if (i + 2 < A.length) {
					A[i + 1] = A[i + 2];
					i = i + 2;
				}

			} else {
				i++;
			}
		}
		/*
		 * for (int i = 0; i < A.length; i++) { System.out.println(i + "=" +
		 * A[i]); }
		 */
		return num;

	}

	/**
	 * @param A
	 * @return
	 * 接受的方法：使用的方法是遇到不同从0开始往上加
	 */
	public int removeDuplicates1(int[] A) {
		int num = A.length;
		if (num == 0 || num == 1) {
			return num;
		}
		int index = 1;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] != A[i + 1]) {
				A[index++] = A[i + 1];
			}
		}
		return index;

	}

}
