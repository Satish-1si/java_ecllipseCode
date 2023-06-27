package java_development_que;

public class que_4 {



	public static void main(String[] args) {
	  int no=153; 
	  String str=String.valueOf(no);
	  int len=str.length();
	  int sum=0;
	  for (char arg:str.toCharArray()) {
		int i=Integer.parseInt(arg+"");
		sum+=(Math.pow(i, len));
	  }
	  if(sum==Integer.parseInt(str)) {
		  System.out.println("Amstrong no");
	  }
	  else {
		  System.out.println("not a amstrong no");
	  }
	}

}
