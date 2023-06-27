package test._codes;

import java.util.ArrayList;

import com.beust.jcommander.Strings;

public class program_2 {      /*quetion :-2*/

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		String str="ABCAB";
		ArrayList remove_duplicates=new ArrayList();//[]
		for(char arg:str.toCharArray()) {
			if(remove_duplicates.contains(arg+"")) {
				remove_duplicates.remove(arg+"");
			}
			else {
				remove_duplicates.add(arg+"");
			}
		}
		String result="unique data is :- ";
		for(Object data:remove_duplicates) {
			result+=data;
		}
		System.out.println(result);
		
		
		
	  
		
	}
	

}
