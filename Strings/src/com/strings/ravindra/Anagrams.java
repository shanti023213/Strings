package com.strings.ravindra;

public class Anagrams {

	public static void main(String[] args) {
	

		String a = "seetha";
		String b ="etehsa";
		
		System.out.println("Is anagrams?: "+isAnagram(a,b));

	}

	public static boolean isAnagram(String a , String b){
		
		if(a.length()!=b.length()){
			
			return false;
		}
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		
		for(int i=0;i<a.length();i++){
			
			int j = a.charAt(i);
			System.out.println(j);
			
			count1[a.charAt(i)]++;
			count2[b.charAt(i)]++;
		}
		
		for(int i=0;i<count1.length;i++){
			
			if(count1[i] != count2[i]){
				return false;
			}
		}
		return true;
	}
}
