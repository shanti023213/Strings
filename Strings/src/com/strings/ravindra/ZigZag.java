package com.strings.ravindra;

public class ZigZag {
	
	static void printZigZagConcat(String str, int n)
	{
	    // Corner Case (Only one row)
	    if (n == 1)
	    {
	      	System.out.println(str);      
	        return;
	    }   
	 
	    // Find length of string
	    int len = str.length();
	 
	    // Create an array of strings for all n rows
	    StringBuffer[] arr = new StringBuffer[n];
	    for(int i=0;i<arr.length;i++){
	    	arr[i] = new StringBuffer();
	    }
	 
	    // Initialize index for array of strings arr[]
	    int row = 0;
	    boolean down=false; // True if we are moving down in rows, 
	               // else false
	 
	    // Travers through given string
	    for (int i = 0; i < len; ++i)
	    {
	        // append current character to current row
	        arr[row].append(str.charAt(i));
	 
	        // If last row is reached, change direction to 'up'
	        if (row == n-1)
	          down = false;
	 
	        // If 1st row is reached, change direction to 'down'
	        else if (row == 0)
	          down = true;
	 
	        // If direction is down, increment, else decrement
	        if(down)
	        	row++;
	        else
	        	row--;
	        } 
	    
	 
	    // Print concatenation of all rows
	    for (int i = 0; i < n; ++i)
	     	System.out.println(arr[i]); 
	}
	 
	// Driver program
	public static void main(String[] args)
	{
	    String str = "GEEKSFORGEEKS";
	    int n = 3;
	    printZigZagConcat(str, n);
	    //return 0;
	}
}
