import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class highLightProblem {

	@SuppressWarnings({ "unused", "static-access", "unchecked", "rawtypes" })
	public static void main(String[] args) {
		System.out.println("=================problem1===================");
		int i =1634;//"1634"
		String str=String.valueOf(i);
		int len=str.length();
		int add_=0;
		for(char arg:str.toCharArray()) {
			add_+=(Math.pow(Integer.parseInt(arg+""), len));

		}
		if(add_==i) {
			System.out.println("amstrong no");
		}
		else {
			System.out.println("not amstrong no");
		}
		System.out.println("=================problem2===================");
		for (int h=1;h<=4;h++) {
			System.out.println("* ".repeat(h));     	 
		}
		System.out.println("=================problem3===================");
		int f=6;
		for(int ii=1;ii<=f;ii++) {
			int spaces=(f-ii);
			System.out.println("  ".repeat(spaces)+"* ".repeat(ii));
		}
		System.out.println("=================problem4===================");
		int first=0;                                                  
		int second=1;           
		for(int ip=0;ip<10;ip++) {          
			int result=first+second;  	
			first=second;
			second=result;
			System.out.println(result);
		}
		System.out.println("=================problem5===================");
		int[] arr= {1,2,3,1,2,10};
		int ref=arr[0];
		int o=0;
		while(o<arr.length) {
			if(arr[o]>ref) {
				ref=arr[o];
			}
			o++;
		}
		System.out.println(ref);
		System.out.println("=================problem6===================");
         String dup= "1213245678";
         String check="";
         String duplicates="";
         for (char q:dup.toCharArray()) {
        	 
        	 if(!check.contains(q+"")) {
        		 check+=q+"";
        	 }
        	 else {
        		 duplicates+=q+"";
        	 }
        	 
        	 
         }
         System.out.println(String.format("unique values ===> %s",check));
         System.out.println(String.format("duplicate values ===> %s",duplicates));
         System.out.println(String.join("$","ram","sita","lakmana","hunuma"));
         System.out.println("===============================================================");
         
         
         
         
		






	}

}
