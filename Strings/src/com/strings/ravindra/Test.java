package com.strings.ravindra;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		String a= "EACBD";
		String b ="EABCD";
		System.out.println("MIn operations" + minOperations(a,b));
	}
	
	public static int minOperations(String a,String b){
		
		if(a.length()!=b.length()){
			return -1;
		}
		int[] arr = new int[256];
		for(int i=0;i<a.length();i++){
			arr[a.charAt(i)]++;
		}
		
		for(int i=0;i<b.length();i++){
			arr[b.charAt(i)]--;
		}
		for(int i=0;i<a.length();i++){
			if(arr[i] !=0){
				return -1;
			}
		}
		
		int result= 0;
		
		for(int i=a.length()-1,j=b.length()-1;i>=0;){
			
			if(a.charAt(i) == b.charAt(j)){
				i--;
				j--;
			}
			else{
				result++;
				i--;
			}
		}
		return result;
	}
	
 
}
