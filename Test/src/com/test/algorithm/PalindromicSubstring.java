package com.test.algorithm;

/**
 * 回文数：“回文数”就是正读倒读都一样的整数。 如奇数个数字：98789，这个数字正读是98789 倒读也是98789。 偶数个数字3223也是回文数。字母
 * abcba 也是回文。
 *
 */
public class PalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromicSubstring p = new PalindromicSubstring();
		String s = "saddas";
		System.out.println(p.longestPalindrome(s));
	}

	public String longestPalindrome(String s) {
		if (s.isEmpty()) {
			return null;
		}

		if (s.length() == 1) {
			return s;
		}

		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			// 得到最长的回文中间的i(s.length为奇数)
			String tmp = helper(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}

			// 得到最长的回文中间的i和i+1(s.length为偶数)
			tmp = helper(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}

		return longest;
	}

	//根据i获取s中的回文数
	public String helper(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}
}
