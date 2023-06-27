package rajesh_data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class triangle {

//5
//4 5 
//3 4 5

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  no1=sc.nextInt();
		int no2=sc.nextInt();
		ArrayList<List> arr=new ArrayList<>();
	
		for(int i=0;i<=no1;i++) {
			List<String> list=Arrays.asList(sc.nextLine().split(" "));
			arr.add(list);
			
		}
		arr.remove(0);
		int index=no1;
		int count=1;
		int result=0;
		int result1=0;
		int result3=0;
		int not=0;
		for(List l:arr) {
			List List_res=(l.subList(index,l.size()));
			if(List_res.size()==count) {
				result+=Integer.parseInt(List_res.get(List_res.size()-1)+"");
				if(count !=1) {
				result1+=Integer.parseInt(List_res.get(0)+"");
			    }
			  if(count==no1) {
				  result3+=(List_res.subList(1,List_res.size()-1 ).size());
			  }
		    	index=index-1;
			 count=count+1;
		}
			else {
				not+=-1;
			}
		
		
		
	}
		if(not==-1) {
			System.out.println(not);
		}
		else {
			int i=(result+result1+result3);
			System.out.printf(result+" "+result1+" "+result3);
		}
		

}
}
