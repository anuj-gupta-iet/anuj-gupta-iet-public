package intermediate;


public class WhatWillBeTheOutputOne {
	public static void main(String[] args) {
		m1(5);
	}

	static int m1(int i) {
		System.out.println(i);
		if (i == 1) {
			return 1;
		}
		int n = m1(i - 1);
		System.out.println(n);
		return n;
	}
}
