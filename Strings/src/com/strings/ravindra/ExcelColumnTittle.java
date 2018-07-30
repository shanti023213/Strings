package com.strings.ravindra;

public class ExcelColumnTittle {
	
	    private static void printString(int columnNumber)
	    {
	        StringBuilder columnName = new StringBuilder();
	 
	        while (columnNumber > 0)
	        {
	            // Find remainder
	            int rem = columnNumber % 26;
	 
	            // If remainder is 0, then a 
	            // 'Z' must be there in output
	            if (rem == 0)
	            {
	                columnName.append("Z");
	                columnNumber = (columnNumber / 26) - 1;
	            }
	            else 
	            {
	                columnName.append((char)((rem - 1) + 'A'));
	                columnNumber = columnNumber / 26;
	            }
	        }
	 
	        // Reverse the string and print result
	        System.out.println(columnName.reverse());
	    }
	 
	    // Driver program to test above function
	    public static void main(String[] args)
	    {
	    	//printString(26);
	        printString(78);
	        printString(53);
	        printString(80);
	        printString(676);
	        printString(702);
	        printString(705);
	    }
	}
	 
	// This code is contributed by Harikrishnan Rajan}


