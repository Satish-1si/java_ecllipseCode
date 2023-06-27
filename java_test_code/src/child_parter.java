
public class child_parter extends abstact {
    
	public static void main(String[] args) {
		child_parter obj=new child_parter();
		obj.abs_metthod(200);
		System.out.println(0/(1*100));

	}

	@Override
	void abs_metthod(int arg) {
		if(arg>=200) {
			System.out.println("satisfy data");
		}
		else {
		System.out.println("not statis .");
		}
	}

}
