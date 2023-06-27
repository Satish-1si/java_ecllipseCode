package java_development_que;

import java.util.LinkedList;
import java.util.Stack;

public class quetion_3 {
	LinkedList<Object> stack=new LinkedList<>();
	public Object add(Object ele) {
		if(this.stack.size()<10) {
			return stack.add(ele);
		}
		else {
			return ("stack is full");
		}
		
	}
	public Object remove() {
		if(this.stack.size()!=0) {
			
				Object obj=stack.removeLast();
				return obj;
		}
		else {
			return ("stack have no ele ==>empty");
		}
	
	}

public void check_the_length_of_stack() {
		System.out.println(this.stack.size());
	}
	public static void main(String[] args) {
		quetion_3 obj=new quetion_3();
		//adding the ele in stack:-
		Object str6=obj.add("sita");System.out.println(str6);
		Object str1=obj.add("satish");System.out.println(str1);
		Object str2=obj.add("sai");	System.out.println(str2);
		Object str3=obj.add("ramu");System.out.println(str3);
		Object str4=obj.add("lakshmi");System.out.println(str4);
		Object str5=obj.add("sita");System.out.println(str5);
		//show the stack elements:
		System.out.println(obj.stack);
		//remove the last element:
		System.out.println(obj.remove());
		//show the stack elements:
		System.out.println(obj.stack);
		//show the length stack 
		obj.check_the_length_of_stack();
		
		
	}

}
