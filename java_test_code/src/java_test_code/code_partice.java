package java_test_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.google.common.collect.HashBiMap;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

@SuppressWarnings("unused")
public class code_partice {
	public  int are=100;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		code_partice obj=new code_partice();
		String[] str="Nittin and hi mom went to park last Friday Nittin's Mom observed that the weather was tool cool if reverse the number 1331 then we also get 1331".split(" ");
		ArrayList result=new ArrayList();
		for(String str1:str) {
			int length=str1.length()-1;//6
			int i=0;
			String rev="";
			if(length >1) {
				while(length>=i) {
					rev+=((str1.charAt(length)));
					length=length-1;
				}
				if((rev.toUpperCase()).equals(str1.toUpperCase())) {
					result.add(str1);
				};
			}

		}       
		int intial=0;
		HashMap map=new HashMap();
		while(intial<result.size()) {
			String single_value=(String) result.get(intial);
			long i=result.stream().filter((arg->single_value.equalsIgnoreCase((String) arg))).count();
			map.put(single_value.toUpperCase(),i);
			intial++;
		}
		System.out.println(map);




	}






}

