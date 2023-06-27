package rajesh_data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class method_overiding {

	                            
		
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		int[] arr= {1,2,3,1,2,3,3,4,5,10,100};
	      ArrayList<Integer> re=new ArrayList();                   
	      ArrayList<Integer> du=new ArrayList();

	      for(int arg:arr) {
	          if(!re.contains(arg)) {
	              re.add(arg);
	          }
	          else {
	        	  
	              re.remove(arg);
	          }
	      }                      
	      System.out.println(re);
	      System.out.println(du);	
	}

};		

	
		

	


	
	

