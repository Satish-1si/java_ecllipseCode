package java_test_code;

public class programms {
	int no=10;
	//typeofData+accesmodifiers+returnType+methodNmae+(parameters)+body
	String instance_update (int a) {
		no=a;
		return "instance no can be updated";
	}
	static int no_1;
	public static String static_update (int a) {
		no_1=a;
		return "static no can be updated";
	}

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		programms obj=new programms();//==>{no:100,string:"sai}101
		programms obj1=new programms();//==>{no:100,string:"sai}102
		//static data  access/passing==>2ways
		System.out.println(obj.static_update(100));
		System.out.println(obj.no_1);
		System.out.println(static_update(10000));
		System.out.println(obj.no_1);
		//instance data  access/passing==>1ways
		System.out.println(obj.instance_update(200));
		System.out.println(obj.no);
		//reference using
		programms obj2=obj1;		           
		System.out.println(obj2.no=1);
		System.out.println(obj1.no);
		//constructors
		

                 

		

	}

    

	
}








