package com.strings.ravindra;

public class MaxOccuringCharacterInaString {

	public static void main(String[] args) {
			String str = "Max occurring character is";
	        System.out.println("Max occurring character is" +
	                            getMaxOccuringChar(str));

	}
	
	
	// consider spaces, if its first max or last max if its first then here ' '.or last max then r 
	//so kinda ask those to interviewer
	public static char getMaxOccuringChar(String str){
		
		int[] arr = new int[256];
		
		for(int i=0;i<str.length();i++){
			arr[str.charAt(i)]++;
		}
		int max =0; char maxElement=' ';
		for(int i=0;i<str.length();i++){
			if(arr[str.charAt(i)]>max){
				max = arr[str.charAt(i)];
				maxElement = str.charAt(i);
			}
		}
		return maxElement;
	}

}
