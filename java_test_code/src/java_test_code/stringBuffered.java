package java_test_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class stringBuffered {

	
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		stringBuffered obj=new stringBuffered();
		
		//addAll
		ArrayList arr=new ArrayList();
		Collections.addAll(arr, -1,11,2,3,3,126,0,411,5);
		System.out.println(arr);
		
		//sort
        Collections.sort(arr);
        System.out.println(arr);
        
        //reverse()
        Collections.reverse(arr);
        System.out.println(arr);
        //reverseOrder()
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);



        }


}
