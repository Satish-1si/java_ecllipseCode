package rajesh_data;

import java.util.HashMap;

public class count_dup {
	//{ =2, a=4, r=1, s=1, t=2, h=1, i=2, k=2, l=1, n=2, o=1}
	public static void main(String[] args) {
		String str="ahsok kiran nittala";
		HashMap<String,Integer> h=new HashMap();
		
		for(Object arg:str.toCharArray()) {
			 String s1=arg+"";
			if(h.containsKey(s1)) {
				
				h.put(s1,h.get(s1)+1);
			}
			else {
				h.put(s1,1);
			}
		}
		System.out.println(h);
		
	}

}
