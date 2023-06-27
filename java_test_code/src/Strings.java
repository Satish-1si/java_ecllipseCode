import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Strings {
 @SuppressWarnings("unused")
public static void main(String[] args) {
	 //create string
    String a="sita's husband is ram";
   char ch=a.charAt(0); //charAt(location) 2 ways
   //System.out.println(ch);
  
   String b="sita's husband is ram";
   boolean res=b.equals(a);// match the content@ equal(object)
   System.out.println(res);
   
   int index=a.indexOf("s");//check the @front position
   System.out.println(index);
//   
   int index_location=a.indexOf("s",3);//check the @front position==>location based
   System.out.println(index_location);
//   
   int lastindex=a.lastIndexOf("s");//check the @last position
   System.out.println(a.charAt(lastindex));
//  
   int lastindex_location=a.lastIndexOf("a",18);//check the @last position==>location based
   System.out.println(lastindex_location);
//   
   String ashok= "sathish";
   String ss ="";
   for(int i=0;i<ashok.length();i++) {
	   char c = ashok.charAt(i);
	   if(ss.indexOf(c)== -1) {
		   ss+=c;
	   }
   }
   System.out.println(ss);
 //
   boolean bool=" ".isEmpty();
   System.out.println(bool);
  //string concat 
   String str="ashok ".concat("sai surya");
   System.out.println(str);
   //string repition 
   System.out.println("bhanu ".repeat(3));
   //string formatting 
   System.out.println("satish %s score is %b".formatted("10%",true));
   //startsWith 
   String app="sai is good boy";
   System.out.println(app.lastIndexOf(10));
   
}

}	
