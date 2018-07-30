package com.strings.ravindra;

public class RunLengthEncoding {

	public static void main(String[] args) {
	
		String str = "SSMMMAAARRRRTTTTTTTTTTTTTTTTTT";
		//System.out.println(runLengthString(str));
		System.out.println(runLengthStringAlt2(str.toCharArray()));
	}
	
	public static String runLengthString(String str){
		
		StringBuffer strBuf = new StringBuffer();
		int count =1;
			for(int i=0;i<str.length();i++){
				if((i+1)< str.length() && str.charAt(i) == str.charAt(i+1)){
					count++;
					continue;
				}
				strBuf.append(str.charAt(i));
				strBuf.append(count);
				count =1;
			}
			
		return strBuf.toString();
	}
	
	public static char[] runLengthStringAlt2(char[] str){
		char[] result = new char[str.length*2];
		int count=1; int j=0;
		for(int i=0;i<str.length;i++){
			if(i+1<str.length && str[i] == str[i+1]){
				count++;
				continue;
			}
				if(count<10){
					result[j++] = str[i];
					result[j++] = (char)(count + '0');
				}else{
					result[j++] = str[i];
					j = helper(result, j, count);
				}
				count=1;
			}
		
		
		return result;
	}
	
	public static int helper(char[] result, int index, int count){
		
		int temp = count;
		int len =1;
		while(temp>0){
			len*=10;
			temp = temp/10;
		}
		
		len = len/10;
		while(count>0){
			result[index++] = (char)((count/len)+'0');
			count =count%len;
			len = len/10;
		}
		return index;
	}
	

}
