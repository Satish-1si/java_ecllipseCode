package java_test_code;

public class objectmethods extends Object implements Cloneable {

	public objectmethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		objectmethods obj=new objectmethods();
		System.out.println((objectmethods)obj.clone());
	}
	public String toString() {
		//return super.toString();
		return "class:1==>pass the data";
		
	}
	public int hashcode() {
		//return super.hashCode();
		return 135;
	}
//	public boolean equals(Object obj) {
//		if(this==obj) 
//			return true;
//		if(obj==null)
//			return false;
//		if(this.getClass()!=obj.getClass()) {
//			return false;
//		}
		
		
	}
	

