package java_development_que;

public class quetion_1 {

	

	public static void main(String[] args) {
		System.out.println("======================quetion:-1=============================");
		String a="aB1";
		for(char ch:a.toCharArray()) {
			
			if(Character.isUpperCase(ch) ) {
				System.out.println("upper :"+ch);
			}
			else if ( Character.isLowerCase(ch)) {
				System.out.println("lower :"+ch);
			}
			else {
				System.out.println("Other :"+ch);
			}
		}

	}

}
