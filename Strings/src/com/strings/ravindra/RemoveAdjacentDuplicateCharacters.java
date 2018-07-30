package com.strings.ravindra;

import java.util.Iterator;
import java.util.Vector;

public class RemoveAdjacentDuplicateCharacters {



    /**
     * Checks the character in the Character Vector at the given index
     * and if duplicates are present next to it, removes the character and its duplicates  
     * @param vector Character Vector to test
     * @param index index of the character to test and remove
     * @return true if any character was removed else false
     */
    private static boolean removeAdjacents(Vector<Character> vector, int index)
    {
        char val = vector.elementAt(index);
        boolean result = false;
        while( ( index < vector.size()-1 ) && (vector.elementAt(index+1) == val) )
        {
            vector.remove(index+1);
            if( !result )
                result = true;
        }
        
        if(result)
         vector.remove(index);
        return result;
    }
    
    /**
     * Initializes a Character Vector containing the elements from a given string
     * @param input The given string 
     * @return Character Vector
     */
    private static Vector<Character> initVector(String input)
    {
        char[] inputArray = input.toCharArray();
        Vector<Character> output = new Vector<Character>(input.length());
        
        for( int i = 0; i < inputArray.length; i++)
        {
            output.add( inputArray[i] );
        }
        
        return output;
    }
    
    /**
     * Process the string for adjacent duplicates and removes it from the string
     * @param input The string to process
     * @return A string with duplicates removed
     */
    private static String processString(String input)
    {
        Vector<Character> output = initVector(input);
        
        int currIndex = 0;
        while( currIndex >= 0 && currIndex < output.size()-1)
        {
            currIndex = (removeAdjacents( output, currIndex)) ? 
                    ( (currIndex<=0) ? currIndex: currIndex-1) :  currIndex+1;
        }
        
        return vectorToString( output );
    }
    
    /**
     * A string representation of the characters in the vector
     * @param vector A vector of Characters
     * @return A string with the characters in the vector concatenated
     */
    private static String vectorToString (Vector<Character> vector)
    {
        StringBuffer result = new StringBuffer();
        
        Iterator<Character> iter = vector.iterator();
        while( iter.hasNext() )
        {
            result.append(iter.next());
        }
        return result.toString();
    }
    
    public static void main(String args[])
    {
        System.out.println( "azxxzy" + " --> " + processString( "azxxzy") ); // ay
        //System.out.println( "azxxzy" + " --> " + removeDuplicates( "azxxzy") ); // ay
        
        System.out.println( "geeksforgeeg" + " --> " + processString( "geeksforgeeg") ); // gksfor
        System.out.println( "geeksforgeeg" + " --> " + removeDuplicates( "geeksforgeeg") ); 
        
        System.out.println( "caaabbbaacdddd" + " --> " + processString( "caaabbbaacdddd") ); // Empty String
        System.out.println( "caaabbbaacdddd" + " --> " + removeDuplicates( "caaabbbaacdddd") ); 
        
        System.out.println( "acaaabbbacdddd" + " --> " + processString( "acaaabbbacdddd") ); // acac
        System.out.println( "acaaabbbacdddd" + " --> " + removeDuplicates( "acaaabbbacdddd") ); 
    }
    
    
    public static String removeDuplicates(String str){
    	
    	return removeAdjacentDuplicates(str.toCharArray(),str.length());
    
    }
    
    public static String removeAdjacentDuplicates(char[] str, int end){
    	
    	if(end==0){
    		return null;
    	}
    	
    	if(end==1){
    		return String.valueOf(str[0]);
    	}
    	
    	int k=0;
    	int i=0;
    	
    	for(i=1;i<end;i++){
    		
    		if(str[i]!=str[i-1]){
    			str[k++] = str[i-1];
    		}else{
    			
    		while(i<end && str[i] ==str[i-1]){
    			i++;
    		}
    		
    		}
    	}
    	
    	if(i-1<end){    	
    	str[k++] = str[i-1];
    	}
    	if(k== end){
    		
    		StringBuffer buf = new StringBuffer();
    		for(int j=0;j<k;j++){
    			buf.append(str[j]);
    		}
    		
    		return buf.toString();
    	}
    	return removeAdjacentDuplicates(str,k);
    }
    }
