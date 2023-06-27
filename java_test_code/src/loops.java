
public class loops {
	static String process(String str) {
		String x="";
		for(char ch:str.toCharArray()) {
			x=ch+x;

		}
		return (x+" ");

	}

	public static void main(String[] args) {
	
		String[] str="java is".split(" ");
		String result="";
		for(String s:str) {
			result+=process(s);
			
		}
		System.out.println(result);
		
		

	}

}
