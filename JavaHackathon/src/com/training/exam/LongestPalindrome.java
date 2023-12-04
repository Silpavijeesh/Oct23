package com.training.exam;

public class LongestPalindrome {
	public static String longestPalindrome(String s) {
		if(s == null || s.length() < 1) return" "; //no string if s.length<1
		int start=0, end=0;
		for(int i=0;i<s.length();i++) {
			int len1=expandAroundCenter(s,i,i);//to handle odd number palindrome.i will comare with i
		                                              //only.i for left j for right,i--,j++
	        int len2=expandAroundCenter(s,i,i+1);//to handle even number palindrome.i will be compare with i+1.
	                                              //i for left and i+1 for right.
	        
	        int len=Math.max(len1, len2); 
			if(len>end-start) {
				start=i-(len-1)/2;
				end=i+len/2;
			}
			}
	      return s.substring(start, end+1);
	}
	private static int expandAroundCenter(String s,int left,int right) {
		int L=left,R=right;
		while(L>=0 && R<s.length()&&s.charAt(L)==s.charAt(R) ) {
			L--;
			R++;
		}
		return R-L-1;
	}
	
		public static void main(String[] args) {
		System.out.println(longestPalindrome("abaddttdd"));

	}

}
