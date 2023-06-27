
public class replace_ {
  public static void main(String[] args) {
	replace_ obj=new replace_();
	try {
	String str="ABcABccAB";
	int index=0;
	String s="";
	for(char arg:str.toCharArray()) {
		if(str.charAt(index)!=-1) {
			 char item=str.charAt(index);

			 if(item=='A') {
                 s=s+"f";
				 index=index+1;
			 }
			 else {
				 s=s+"-";
				 index=index+1;
			 }
		}
		
	}
	System.out.println(s);
	}
	catch(StringIndexOutOfBoundsException exe) {
		String st=exe.getMessage();
		System.out.println(st);
	}
}
}
