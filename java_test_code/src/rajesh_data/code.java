package rajesh_data;

import java.util.Arrays;

public class code {
	
	char[ ]  ch;
	static String str_(char[] str) {
		String c="";
		for(char ch:str) {
			c+=ch;
		}
		return c;
		
		
	}
	 void process_data(int i) {
		int count=-1;
		char[] s=this.ch;
		for(char str:s) {
			count=count+1;
			if(count!=i) {
			char[] sp=s;
			char tem;
			tem=sp[count];
			sp[count]=sp[i];
			sp[i]=tem;
			
			System.out.println(str_(sp));
		
			}
			
		}
	 }
			
	
	public static void main(String[] args) {
		code obj=new code();
		String s= "satish";
		obj.ch=s.toCharArray();
		int count=-1;
		for (char c:s.toCharArray()) {
			count=count+1; 
				obj.process_data(count);
				
		

		}
		

	}

}

//
//asi
//ias
//asi
//sia
//ias
//sia
//






//s
//sa
//sat
//sati
//satis
//satish
//satis
//sati
//sat
//sa
//s
//
//
//satish
//a       s     
//t        i
//i        t
//s       a
//hsitas







