package com.strings.ravindra;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

       // String str = "AAABBCCDDDEFGH";
		 String str ="geeksforgeeg";
        char input[] = str.toCharArray();
        int len = removeDuplicates(input);
        
        
        for(int i=0; i < len; i++){
            System.out.print(input[i] + " ");
        }
        
        System.out.println();
        
        char input1[] = str.toCharArray();
        int len1 = removeDuplicates1(input1);
        
        for(int i=0; i < len1; i++){
            System.out.print(input1[i] + " ");
        }
    }
    

    public static int removeDuplicates(char input[]){
        int slow = 0;
        int fast = 0;
        int index = 0;
        while(fast < input.length){
            while(fast < input.length && input[slow] == input[fast]){
                fast++;
            }
            input[index++] = input[slow];
            slow = fast;
        }
        return index;
    }
    
    //need to correct
   public static int removeDuplicates1(char input[]){
	   
	   int k=0; int i=1;
	   while(i<input.length){
		   while(input[i] == input[i-1]){
			  i++;
		   }
		   input[k++]=input[i-1];
		   i++;
	   }
	   
	   return  k;
   }
}

