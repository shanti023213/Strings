package com.strings.ravindra;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "Max occurring character is ";
		System.out.println(deleteDuplicates(str));
	}
	
	public static String deleteDuplicates(String str){
		HashSet<Character> set = new HashSet<Character>();
		StringBuffer strBuffer = new StringBuffer();
		for(int i=0;i<str.length();i++){
			if(!set.contains(str.charAt(i))){
				set.add(str.charAt(i));
				strBuffer.append(str.charAt(i));
			}
		}
		return strBuffer.toString();
		 
	}

}
