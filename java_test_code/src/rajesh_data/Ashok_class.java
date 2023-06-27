package rajesh_data;

public class Ashok_class extends rajesh_collage  {

	@SuppressWarnings({ "static-access", "unused", "deprecation" })
	public static void main(String[] args) {
		
		Ashok_class obj =new Ashok_class();
			try {
				boolean b=Class.forName(obj.getClass()+"").isInstance(obj);
				System.out.println(b);
				boolean bb=obj instanceof Ashok_class;
				System.out.println(bb);
			} catch (ClassNotFoundException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
