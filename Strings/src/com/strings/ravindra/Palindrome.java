package com.strings.ravindra;

public class Palindrome {

	public static void main(String[] args) {
		String str ="madam";
		System.out.println(isPalindrome(str.toCharArray()));
	}
	
	public static boolean isPalindrome(char[] str){
		int start =0; int end = str.length-1;
		
		while(start<end){
			if(str[start] == str[end]){
			char temp = str[end];
			str[end] = str[start];
			str[start] =temp;
			start++;
			end--;
			}else{
				return false;
			}
		}
		return true;
	}

}
