package com.strings.ravindra;

public class EqualityOnStringRotations {

	public static void main(String[] args) {
		String str1 ="RAVI";
		String str2 ="AVIR";
		System.out.println(StringRotations(str1,str2));

	}
	
	public static boolean StringRotations(String str1, String str2){
		
		System.out.println((str1+str1).indexOf(str2));
		return ((str1.length()==str2.length()) && (str1+str1).indexOf(str2)!=-1);
	}

}
