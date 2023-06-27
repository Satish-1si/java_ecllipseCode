package java_test_code;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.common.base.Predicate;

public class loading {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
//    WebDriverManager.chromedriver().setup();
//    ChromeDriver d=new ChromeDriver();
//    d.get("https://www.google.com");
		
		BufferedWriter writer=new BufferedWriter(new FileWriter("./satish.txt",true));
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("satish");
		arr.add("manepalli");
		arr.add("prasad");
		arr.add("venkateswara rao");arr.add("Lakshmi");arr.add("padma");
		ArrayList<String> arr1=new ArrayList<String>(arr);
		for(Object str:arr1) {
			String s=(String)str;
			writer.write(s+"\n");

		}
		writer.close();

}
}