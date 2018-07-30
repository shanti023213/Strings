package com.strings.tushar;

import java.util.HashMap;
import java.util.Map;

public class AnagramOfFirstAsSubstring {

	public static void main(String[] args) {
		   String str2 = "BACDGABCDA";
	       String str1 = "ABCD";
		   anagramSubStringSearch(str1,str2);

	}

	public static void anagramSubStringSearch(String str1, String str2){
		
		int[] table = new int[256];
		int[] stringTable= new int[256];
		
		for(int i=0;i<str1.length();i++){
			table[str1.charAt(i)]++;
			stringTable[str2.charAt(i)]++;
		}
		
		for(int i=str1.length();i<str2.length();i++){
			
			if(compare(table,stringTable)){
				System.out.println(i-str1.length());
			}
			
			stringTable[str2.charAt(i)]++;
			stringTable[str2.charAt(i-str1.length())]--;
			
		}
		
		if(compare(table,stringTable)){
			System.out.println(str2.length()-str1.length());
		}
		
	}
	
	public static boolean compare(int[] table1, int[] table2){
		
		for(int i=0;i<table1.length;i++){
			if(table1[i] !=table2[i]){
				return false;
			}
		}
		
		return true;
	}
	  
}
