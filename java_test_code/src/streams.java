import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class streams {
	String str="";
	public streams() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings({ "unused", "static-access" })
	public static void main(String[] args) {
		streams s=new streams();
        String[] ch="satis".split("");   
        int i=0;
        String x="M";
        while(i<ch.length/2) {
        	String temp=ch[i];
        	ch[i]=ch[ch.length-i-1];
        	ch[ch.length-i-1]=temp;
        	
        	x+=ch[i];
        
        	i++;

        }
    	
		
        
	 
	    

	}

}
