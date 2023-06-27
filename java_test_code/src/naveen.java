
public class naveen extends dad {
	static float height;
	String work;
	String assests;
	public naveen(String arg2,String arg3,float arg) {
		this.work=arg2;this.assests=arg3;height=arg;
	}
	public naveen(float arg,String arg2,String arg3) {
		this(arg2,arg3,arg);
	}
	void dadproperty() {
		super.assests="10 acars";
		System.out.println(super.assests);
		System.out.println(this.assests);
	}

	public static void main(String[] args) {
		naveen obj=new naveen((float)5.5,"agriculture","10 acars");
		
		System.out.println(obj.assests);
		System.out.println(obj.work);
		System.out.println(obj.height);
	


	}

}
