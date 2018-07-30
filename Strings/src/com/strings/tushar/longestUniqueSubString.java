package com.strings.tushar;

//Java program to find the length of the longest substring
//without repeating characters
public class longestUniqueSubString
{
   
  static final int NO_OF_CHARS = 256;
   
  static int longestUniqueSubsttr(String str)
  {
	  int current_length=1;
	  int maxLength =1;
	  
	  int[] table = new int[NO_OF_CHARS];
	  table[str.charAt(0)] =0;
	  
	  for(int i=1;i<str.length();i++){
		  
		 int  previousIndex = table[str.charAt(i)];
		 
		 if(previousIndex == -1 || i-current_length >previousIndex){
			 current_length++;
		 }else{
			 current_length  = i-previousIndex;
			 if(current_length > maxLength)
				 maxLength = current_length;
		 }
		 
		
		 
		 table[str.charAt(i)]=i;
	  }
	  
		 if(current_length > maxLength)
			 maxLength = current_length;
	  
	  return maxLength;
  }
   
  /* Driver program to test above function */
  public static void main(String[] args) 
  {
      String str = "ABDEFGABEF";
      System.out.println("The input string is "+str);
      int len = longestUniqueSubsttr(str);
      System.out.println("The length of "
              + "the longest non repeating character is "+len);
  }
}
//This code is contributed by Sumit Ghosh
