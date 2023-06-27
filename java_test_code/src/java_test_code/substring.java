package java_test_code;

import java.util.ArrayList;
public class substring {
	//not using subString method that time =========>this process will implement
	static String subquery(String str,int no1,int no2) {
		String s1="";
		while(no1<no2+1){
			s1+=str.charAt(no1);
			no1++;
		}
		return s1;
		
	}
	
	static ArrayList<String> subString(String str){
		 int i=0;
		  ArrayList<String> list=new ArrayList<String>();
		 while(i<str.length()) {
			 int j=i;
			 while(j<str.length()) {
				 //list.add(str.substring(i,j+1));//using subString method
				  list.add(  subquery(str, i, j)); //not using substring method ====> passing startindex,endIndex
				 j++;
			 }
			 i++;
		 }
		 return list;
	}
	public static void main(String[] args) {
		
		 String str1="GreeksforGeeks";
		 String str2="GreeksQuiz";
		 ArrayList<String> a1=subString(str1);
		 ArrayList<String> a2=subString(str2);
		 int 	 longest_string_length=0;
		 String longest_string="";
		 for(Object arg:a2) {
			 
			 if(a1.contains(arg)) {
				 int len=String.valueOf(arg).length();
				 if(len>	 longest_string_length) {
					 
					 longest_string_length=len;
					longest_string=(String) arg;
				}
			 }
		 }
		 System.out.println(	 longest_string_length+" "+longest_string);
	}
}
//===============>abcd=======================
//a 0   
//ab 01
//abc 012
//abcd 0123
//b 1
//bc 12
//bcd 123
//c  2
//cd 23
//d 3
