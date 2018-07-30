package com.strings.ravindra;

public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println("First Non repeating char : " + firstNonRep(str.toCharArray()));
	}
	
	public static char firstNonRep(char[] str){
		
		int[] arr = new int[256];
		
		for(int i=0;i<str.length;i++){
			arr[str[i]]++;
		}
		
		char result = ' ';
		for(int i=0;i<str.length;i++){
			if(arr[str[i]] ==1){
				result = str[i];
				break;
			}
		}
		return result;
	}

}
