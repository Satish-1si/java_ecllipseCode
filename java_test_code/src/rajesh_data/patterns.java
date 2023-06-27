package rajesh_data;

public class patterns {
      static void top_to_bottom(String s) {
    	  int count=-1;
  		for(char c:s.toCharArray()) {
  			count=count+1;
  			

  			System.out.println(s.substring(0,count+1));
  			
  		}
      }
  		 private static char[] StringBuffer(String substring) {
		// TODO Auto-generated method stub
		return null;
	}
		static void bottom_to_top(String s) {
  			 int count=s.length();
  	  		for(char c:s.toCharArray()) {
  	  			count=count-1;
  	  			if(count!=s.length()-1) {
  	  			System.out.println(s.substring(0,count+1));
  	  			}
  	  		}
  	  		}
  		 

      
	public static void main(String[] args) {
		String s="satish";
	     top_to_bottom(s);
		bottom_to_top( s);
		
		
	}

}

//s 0
//sa 01
//sat 012
//sati 0123
//satis 01234
//satish 012345
//satis
//sati
//sat
//sa
//s
//
//
//satish
//a       s     
//t        i
//i        t
//s       a
//hsitas






      
