
package rajesh_data;

public class rajesh_collage extends Object{
	
	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {
		String str="satish1244567@#$%^&*(";
		String string="";
		for (Character st:str.toCharArray()) {
		
			 if(!Character.isLetterOrDigit(st)) {
				   string+=(st+"");
			 }
		}
		int no=(Character.getNumericValue('h'));
		String strs=Character.toString('1');
		System.out.println(no);
		
		@SuppressWarnings("removal")
		//str to int
		//int to int
		Integer old_1= new Integer(100); //old
		Integer no1=Integer.valueOf(100);//new
		System.out.println(no1*300);
		@SuppressWarnings("removal")
		Integer old_2 = new Integer("100");//old
		Integer no2=Integer.valueOf("100");//new
		System.out.println(no2*200);
		
		//Inter_data can be convert from str-->2ways
		String tostring=Integer.toString(100);//tostring(int)
		System.out.println(tostring+1233);
		System.out.println(old_2.toString()+100);//obj.tostring()
		//intergerObject ===> convertInto otherPrimitiveTypes		
				short s=old_2.shortValue();
				double d=old_2.doubleValue();
				long l=old_2.longValue();
				int i= old_2.intValue();
				float f=old_2.floatValue();
		        System.out.println(s);
		        System.out.println(l);
		        System.out.println(d);
		        System.out.println(i);
		        System.out.println(f);
		//stringno data can be convert primitive datatype--> 2ways
		        int primitive=Integer.parseInt("200");
		        System.out.println(primitive);
		        int pri=Integer.valueOf("100");		    
		        System.out.println("============================================================");
				System.out.println(String.valueOf(s)+".........");System.out.println(String.valueOf(l));System.out.println(String.valueOf(i));
				System.out.println(String.valueOf(d));System.out.println(String.valueOf(f));
                 
				 
				
		        
   //wrapperClass.toString(primitive_datatype) 
   //obj_ref.tostring();
				//===2===
   //wrapperClass_obj.primitiveDatatype_Value()--->mana dagiraa vunnaa no_obj ni particular primitive kinda convert chesthunamu
		        
		        
		






		
	}
	
}