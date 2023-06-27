package rajesh_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unused")
public class comparator implements Comparable<comparator> {

	int age;
	String name;
	boolean pass;
	public comparator(int no,String str,boolean bool) {
		this.age=no;this.name=str;this.pass=bool;
		
	}
	public String toString() {
		return String.format("{age:%s name:%s pass:%s}", age,name,pass);
		
	}
	
	public static void main(String[] args) {
		comparator obj=new comparator(24,"sai",true);
		comparator obj1=new comparator(25,"sita",false);
		comparator obj2=new comparator(24,"janaki ram",true);
		comparator obj3=new comparator(26,"sita ram",false);
		comparator obj4=new comparator(27,"surya",true);
		comparator obj5=new comparator(27,"syam",false);
		comparator obj6=new comparator(29,"raj tarun",true);
		ArrayList<comparator> arr=new ArrayList<>(List.of(obj,obj1,obj2,obj3,obj4,obj5,obj6));
		Collections.sort(arr);
		System.out.println(arr);
	}
	@Override
	public int compareTo(comparator o) {       
		if(o.age==30) {               //1,-1,0
			return 0;
		}
		else if(o.age < 30) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
