package rajesh_data;
//use:at a time 2different ref_id tho same content vunna 2 object kavali anapudu ==>clonemethod use chesthamu
public class clone_Method implements Cloneable {

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException {
		clone_Method obj=new clone_Method();
		System.out.println(obj);//rajesh_data.clone_Method@515f550a
		System.out.println(obj.hashCode());//1365202186

		clone_Method obj1=(clone_Method)obj.clone();
		System.out.println(obj);//rajesh_data.clone_Method@515f550a
		System.out.println(obj1 instanceof Cloneable );//212628335
		
		//both are sme object but both reference are different
		String str=(obj.getClass().getSimpleName());
		System.out.println(obj);
	}
	
}
