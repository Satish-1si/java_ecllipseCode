package java_test_code;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class programming {

	public programming() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     while(sc.hasNext()) {
    	 String str1=(sc.nextLine());
    	 List l=List.of("@","$","",",","\"","\'"," ","&",".","-",",",":");
         String str="";
         for(String arg:str1.split("")) {
        	 if(!l.contains(arg)) {
        	  str+=(arg);

        	 }
         }
         StringBuffer buff=new StringBuffer("sss");
         StringBuffer buff1=new StringBuffer("sss");


         System.out.println(buff.equals(buff1));        



     }
	}

}
//
//
