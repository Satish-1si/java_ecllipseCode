import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class regular_expression {

	static public boolean result(String str1,String str2) {
		  Pattern p=Pattern.compile(str1)  ;
		  Matcher m=p.matcher(str2);
		  return m.find();
		  
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// . ==>denotes the any charcter
	     System.out.println(result("..tis.","satish"));//that place lo yee character yavinna vundavachu(but charcter ravalli)
	     //^string ==>starts the string
	     System.out.println(result("^satish","satish good boy"));//starts with boy
	     //^string ==>ends the string
	     System.out.println(result("boy$"," good boy"));//ends with boy
	     //[abc] ==>any one charcter vandali
	     System.out.println(result("[sa]","saxcxp"));//any one the charcter contain string
	     System.out.println(result(".[sa]ti[es]h","satish"));
	     //[abc] ==>any one charcter vanda kudadu
	     System.out.println(result("[^sa]","ti"));//no one the charcter contain string
	     //1.  \\d ==>contains no
	     System.out.println(result("satish\\d","satish9"));//after string ==>grantry no vundalli
	     //2.  \\D ==>contains non nos
	     System.out.println(result("satish\\D","satishrt"));//after string ==>non digits vundali (aplabates ,sysmbools)	    
	     //3.  \\s===>contains space
	     System.out.println(result("satish\\s","satish "));//after string ==>grantry space vundalli
	     //4.  \\S===>contains not space
	     System.out.println(result("satish\\S","satishsdd"));//after string ==>non space vundali (aplabates ,sysmbools)
        //5.  \\String===>contains space
	     System.out.println(result("satish\\ boy","satish boy"));//after string ==>this word vundali
	     //6.  \\contains square bracket
	     System.out.println(result("s\\[atis\\]h","s[atis]h"));//using square brackets write ===>using double slahes;
	     //  1.eg:\\[    2.eg:\\[[    3.eg:\\]]]]]
	     System.out.println(result(".a[ti]*..{1,}",""));// 1. * ==>   0 or more times
	     System.out.println(result(".a[ti]+..","satish"));// 2. +  ==>  atleast one time
	     System.out.println(result(".a[ti]{1}..","satish"));//3.  {range}==> these times
	     System.out.println(result(".a[ti]{1,2}..","satitish"));//4.  {x,y}==>x to y times range vundali
	     System.out.println(result(".a[ti]{2,}..","satitish"));//5.   {x,}===>x or greater range vundalli

	     System.out.println(result("satish\\{2} | prasad","satish satish is a"));
	     
	     String text = "one two three one two ";
	     System.out.println(text.replaceAll("[e]{2}"," @"));

	     
              Stream<Integer> s=Stream.of(1,2,3,4);
              s.forEach(x->System.out.println(x));





	     
	
	}

}
