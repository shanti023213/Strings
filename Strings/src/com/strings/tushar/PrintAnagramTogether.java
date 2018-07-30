package com.strings.tushar;

import java.util.ArrayList;
//An efficient program to print all 
//anagrams together    
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PrintAnagramTogether 
{
	  public void print(String[] string){
	        Map<String,List<Integer>> invertedIndex = new LinkedHashMap<String,List<Integer>>();
	        int index = 0;
	        for(String str : string){
	            char [] charArray = str.toCharArray();
	            Arrays.sort(charArray);
	            String newString = new String(charArray);
	            if(invertedIndex.containsKey(newString)){
	                List<Integer> pos = invertedIndex.get(newString);
	                pos.add(index);
	            }else{
	                List<Integer> pos = new ArrayList<Integer>();
	                pos.add(index);
	                invertedIndex.put(newString, pos);
	            }
	            index++;
	        }
	        for(List<Integer> result  : invertedIndex.values()){
	            for(Integer i : result){
	                System.out.println(string[i]);
	            }
	        }
	    }
	    
	    public static void main(String args[]){
	        String str[] = {"cat","dog","tac","god","act"};
	        PrintAnagramTogether pat = new PrintAnagramTogether();
	        pat.print(str);
	    }
	    
	}

//This code is contributed by Sumit Ghosh
