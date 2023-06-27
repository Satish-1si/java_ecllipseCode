package test._codes;

import java.util.Arrays;

public class program1 {//quetion 2

	public static void main(String[] args) {
		String str="qwertyuiopasdfghjklzxcvbnmA";
		String vowels="";
		String consonants="";
		for(char arg:str.toCharArray()) {
			 String store="aeiou";
			  if(store.contains(arg+"")) {
				  vowels+=(arg);
			  }
			  else {
				  consonants+=(arg);
			  }
		}
		String[] ch=vowels.split("");
		String[] ch_1=consonants.split("");
		Arrays.sort(ch);
		Arrays.sort(ch_1);
		System.out.println("vowels:"+Arrays.toString(ch)+"==>"+vowels.length());
		System.out.println("consonants:"+Arrays.toString(ch_1)+"==>"+consonants.length());
		

	}

}
