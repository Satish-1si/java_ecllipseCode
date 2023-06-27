package java_test_code;

public class rev {

	public static void main(String[] args) {
	    String str="naveen is a romantic boy";
	    int i=str.length()-1;
	    String s1="";
	    while(i>=0) {
	    	s1+=str.charAt(i);
	    	i--;
	    }
	   String result="";
	    for(String sa:s1.split(" ")) {
	    	int ii=0;
	    	String r1="";
	    	while(ii<sa.length()) {
	    		r1=(sa.charAt(ii))+r1;
	    		ii++;
	    	}
	    	result+=(r1+" ");
	    }
      System.out.println(result);
	}

}
