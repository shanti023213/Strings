package com.strings.ravindra;

public class RobotMovesCircularOrNot {

	 public static void main(String[] args)
	    {
		 char[] path = {'G','L','G','L','G','L','G'};
		 System.out.println("Circular Moves:"+isCircular(path));
		 
	    }
/*	
	 
	 E
N	      S
	 W
	 
*/
	 
	 public static boolean isCircular(char[] path){
		 
		 int x=0;int y=0; int dir =0;  //E-0,N-1, W-2,S-3
		 
		 for(int i=0;i<path.length;i++){
			 
			 if(path[i]=='L'){
				 
				dir= (dir+1)%4;;
				
			 }else if(path[i]=='R'){
				 if(dir==0)
					 dir = 3;
				 else
				 dir = dir-1;
			 }else{
				 
				 if(dir== 0){
					 	y++;
				 }else if(dir==2){
					 y--;
				 }else if(dir==1){
					 x--;
				 }else if(dir==3){
					 x++;
				 }
			 }
		 }
		 
		 if(x==0 && y==0){
			 return true;
		 }
		 return false;
	 }
	 


}
