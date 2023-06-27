
public class method_overloading {

	public String  ashok(String str ,String str2) {
		String surname=str+str2;
		return surname;
		
	}
    public String ashok(long phone_no) {
    	String no=String.valueOf(phone_no);
		if(no.length()==10) {
			return "valid phone no";
		}
		else {
			return "invalid phone_no";
		}
	}
    public String ashok(boolean result) {
    	if(result==true) {
    		return "you pass";
    	}
    	else {
    		return "you fail";
    	}
   	}
    public method_overloading() {
		System.out.println("*************you have the data plese wait its proccrssing**********");
	}
    public method_overloading(String str, String str2, String num, boolean bool) {
    	this();
    	String one=ashok(str, str2);
    	long l=Long.valueOf(num);
    	String two=ashok(l);
    	String three=ashok(bool);
    	System.out.println(one);
    	System.out.println(two);
    	System.out.println(three);
    	System.out.println("==========processing can be completed============");

    	
    }
	public static void main(String[] args) {
		
		method_overloading obj = new method_overloading("Nittala","Ashok","9123456706",true);
		method_overloading obj1 = new method_overloading("manepalli","satish","9112345678",true);
		method_overloading obj2 = new method_overloading("botcha","vasanta","918595966706",true);
		method_overloading obj3= new method_overloading("akulaa","chandu","9123236706",true);
		method_overloading obj4 = new method_overloading("matta","sai prasad","916797087456706",true);
		method_overloading obj5= new method_overloading("bonthu","sai bhanu","9706",true);
		

		
		
		
	}

}
