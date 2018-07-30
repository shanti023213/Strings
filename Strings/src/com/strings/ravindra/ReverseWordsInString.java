package com.strings.ravindra;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "This is a    class";
		System.out.println(reverseWords(str.toCharArray()));
		System.out.println(reverseWords1(str.toCharArray()));
	}

	public static char[] reverseWords(char[] str){
		
		int start =0;
		for(int i=0;i<str.length;i++){
			while(i<str.length && str[i] !=' '){
				i++;
			}
			reverse(str,start,i-1);
			start =i+1;
		}
		
		reverse(str,0,str.length-1);
		return str;
	}
	
	public static void reverse(char[] str, int start, int end){
		while(start<end){
			char temp = str[start];
			str[start] =  str[end];
			str[end] = temp;
			start++;
			end--;
		}
	}
	
	public static char[] reverseWords1(char[] str){
		
		reverse(str,0,str.length-1);
		int wordStart =0;
		
		for(int i=0;i<str.length;i++){
			
			while(i<str.length && str[i] !=' '){
				i++;
			}
			if(wordStart!=i)
			{
			reverse(str,wordStart,i-1);
			}
			wordStart =i+1;
		}
		
		
		return str;
	}
}