package java_test_code;

public class swaping {

    //satish
	public static void main(String[] args) {
    StringBuffer a=new StringBuffer("sai m");
    int i=a.length()-1;
    while(i>=0) {
    	char x=a.charAt(i);
    	a.deleteCharAt(i);
    	a.append(x);
    	i--;
    }
    System.out.println(a);
    
    
  
    
		
   
		

	}

}
