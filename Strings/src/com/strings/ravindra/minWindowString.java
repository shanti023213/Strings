package com.strings.ravindra;

import java.util.HashMap;
import java.util.Map;

public class minWindowString {
	
	public static void main(String[] args){
		
        String str = "ADOBECODEBANCDDD";
        String pat = "ABC";
      
        System.out.println("Min Window String: "+ minWindowString(str,pat));
	}
	
	public static String minWindowString(String str1, String str2){
		
		HashMap<Character,Integer> str2Map = new HashMap<Character,Integer>();
		
		for(int i=0;i<str2.length();i++){
			if(str2Map.containsKey(str2.charAt(i))){
				str2Map.put(str2.charAt(i), 1+str2Map.get(str2.charAt(i)));
			}else{
				
			}str2Map.put(str2.charAt(i), 1);
		}
		HashMap<Character,Integer> str1Map = new HashMap<Character,Integer>();
		int left=0; String result="";int count=0; int minLength =Integer.MAX_VALUE;
		
		for(int i=0;i<str1.length();i++){
			
			char element = str1.charAt(i);
			
			if(str2Map.containsKey(element)){
				if(str1Map.containsKey(element)){
					
					if(str1Map.get(element)<str2Map.get(element)){
						
						count++;
					}
					str1Map.put(element, 1+str1Map.get(element));
				}else{
					
					count++;
					str1Map.put(element, 1);
				}
				
			}
			
			if(count==str2.length())
			{
				char leftElement = str1.charAt(left);
				while(!str1Map.containsKey(leftElement) || str1Map.get(leftElement)>str2Map.get(leftElement)){
					if(str1Map.containsKey(leftElement) && str1Map.get(leftElement)>str2Map.get(leftElement)){
						str1Map.put(leftElement, str1Map.get(leftElement)-1);
					}
					left++;
					leftElement = str1.charAt(left);
				}
				
				if(minLength> i-left+1){
					
					minLength= i-left+1;
					result = str1.substring(left, i+1);
				}
				
			}	
			
			
			
		
		}
		
		return result;
		
	}

}
