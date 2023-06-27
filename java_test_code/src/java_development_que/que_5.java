package java_development_que;

import java.util.Arrays;
import java.util.HashMap;

public class que_5 {

	public static void main(String[] args) {
		String str="aaabbc";
		HashMap<String,Integer> map=new HashMap<>();
		for (char ch:str.toCharArray()) {
		      if(! map.containsKey(ch+"")) {
		    	  map.put(ch+"", 1);
		      }
		      else {
		    	  map.put(ch+"",map.get(ch+"")+1);
		      }
		}
		String result="";
		for(String i:map.keySet()) {
			result+=i+map.get(i);
		}
		System.out.println(result);
	}

}
