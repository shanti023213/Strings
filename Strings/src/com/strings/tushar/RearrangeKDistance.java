package com.strings.tushar;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//egsekfekresog
//egsekfekresog
//egkegkesfesor
class CharNode implements Comparable<CharNode>{
	
	Character element;
	int frequency;
	
	public CharNode(Character element,int frequency){
		this.element =element;
		this.frequency =frequency;
	}

	@Override
	public int compareTo(CharNode o1) {
		return o1.frequency -this.frequency;
	}
	
}

public class RearrangeKDistance {

	public static void main(String[] args) {
		String str ="geeksforgeeks";
		rearrangeString(str,3);

	}

	public static void rearrangeString(String str, int distance){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				
				map.put(str.charAt(i), 1+map.get(str.charAt(i)));
			}else{
				map.put(str.charAt(i), 1);
			}
		}
		
		PriorityQueue<CharNode> queue = new PriorityQueue<CharNode>();
		for(Character key:map.keySet()){
			
			if(map.get(key) > Math.ceil(str.length()*1.0/distance)){
				System.out.println("Rearrangement Not possible");
				return;
			}
			
			queue.add(new CharNode(key,map.get(key)));
		}
		int start=0; int current =0;
		char[] result = new char[str.length()];
		
		while(!queue.isEmpty()){
			
			/*CharNode c = queue.poll();
			int freq= c.frequency;
			while(freq>0){
				result[start]=c.element;
				start= start+distance;
				if(start>=str.length()){
					++current;
					start= current;
				}
				freq--;
			}*/
			
			CharNode p = queue.poll();
            int i =0;
            while(i < p.frequency){
                result[start] = p.element;
                start = start + distance;
                if(start >= str.length()){
                    current++;
                    start = current;
                }
                i++;
            }
			
		}
		
		String str1= new String(result);
		System.out.println(str1);
		
	}
}
