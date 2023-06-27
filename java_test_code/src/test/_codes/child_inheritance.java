package test._codes;


//parent data can resulible in this child calss
public class child_inheritance extends parent_inheritance {
    public void conduting_exam(String exam) {
    	System.out.println(exam);
    }
    public child_inheritance() {
    	
    }
	public child_inheritance(String arg, boolean arg1, String arg2, int arg3) {
		super(arg, arg1, arg2, arg3);
		
	}
	public String toString() {
		return String.format("{name:%s ,result_:%s ,roll_no:%s ,collage_name:%s}",name,result_,roll_no,collage_name);
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		child_inheritance obj=new child_inheritance("parasd",false,"bvc collage",145);
		System.out.println(obj.toString());//{name:parasd ,result_:false ,roll_no:145 ,collage_name:bvc collage}
		obj.conduting_exam("social eaxam can be conduct");
	}

}
