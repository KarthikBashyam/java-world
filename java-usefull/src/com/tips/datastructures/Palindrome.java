package com.tips.datastructures;

public class Palindrome {

	public static void main(String[] args) {

		int n = 565;

		int r;

		int sum = 0;
		int temp = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not A Palindrome");
		}
		
		System.out.println(isPal("abbaa"));		
		
		String str = "abbaa";
		
		while(str.length() > 0) {
			
			if(str.charAt(0) == str.charAt(str.length() -1)) {
				
				str = str.substring(1, str.length() - 1);
			} else {
				System.out.println("Not a palindrome");
				break;
			}
		}
	}
	
	public static boolean isPal(String s) {
		
		if(s.length() == 0 || s.length() == 1) {
			return true;
		}
		
		if(s.charAt(0) == s.charAt(s.length() - 1)) {
			
			return isPal(s.substring(1,s.length() - 1));
			
		}
		
		return false;
		
	}
	
	

}
