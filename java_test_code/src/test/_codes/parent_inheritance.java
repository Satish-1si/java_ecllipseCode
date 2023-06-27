package test._codes;


//purpose:one calss data can be resuble in any another class by using inheritence
//inheritence achieve:4 ways;
            //1.single 2.multilevel 3.multiple 4.hirachiral
//apply for-->single inheritence;
public class parent_inheritance {/*quetion 3(parent)*/
    
	static String collage_name;//static data;
	int roll_no; //instance data;
	String name;//instance data;
	boolean result_;//instance data;
	public parent_inheritance() {
		
	}
	public parent_inheritance(String arg,boolean arg1,String arg2,int arg3 ) {
		this.name=arg;
		this.result_=arg1;
		this.roll_no=arg3;
		collage_name=arg2;
		
	}
	public String toString() {
		return String.format("{name:%s ,result_:%s ,roll_no:%s ,collage_name:%s}",name,result_,roll_no,collage_name);
	}
	
	public static void main(String[] args) {
		parent_inheritance obj=new parent_inheritance("satish",true,"bvc collage",135);
		System.out.println(obj.toString());//{name:parasd ,result_:false ,roll_no:145 ,collage_name:bvc collage}

	}

}
