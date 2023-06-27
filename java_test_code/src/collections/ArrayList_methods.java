package collections;
import java.util.*;
public class ArrayList_methods extends ArrayList {

	

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
    //arrayList constructors
		ArrayList arr=new ArrayList();
		ArrayList arr1=new ArrayList(List.of("a",1,2,3,4,5));
		ArrayList arr2=new ArrayList(16);
		System.out.println("=========================================================================");

	//add
		//add @ single object
		boolean b=arr.add("sai");arr.add(1);arr.add(true);
		System.out.println(b+" "+arr);
		for(char a:arr.toString().toCharArray()) {
			System.out.println(a);
		}
		//add @ single object by using location
		arr.add(arr.size()-1,"charan");arr.add(arr.size()-1,true);arr.add(arr.size()-1,"object");
		System.out.println(b);
		System.out.println(arr);
		//add @ collection  
		boolean result1=arr.addAll(arr1);
		System.out.println(result1+" "+arr);
		//add @ collection by using location  
		boolean result2=arr.addAll(0,List.of("swapnil","sai",1,2,3,4,5,6,7,8,9));
		System.out.println(result1+" "+arr);
		System.out.println("=========================================================================");
	//remove 
		//remove ==>using element
		boolean r=arr.remove("sai");
		System.out.println(arr+" "+r);
		//remove ==>using location 
		Object s=arr.remove(0);
		String str1=(String)s;
		System.out.println(str1);
		//remove collection ===>using collection 
		System.out.println("arrr========="+arr);
		arr.removeAll(List.of(1,2,3,4,5,6,7));
		System.out.println(arr);
		//!remove collection ===>using collection 
		arr.retainAll(List.of(1,2,3,4,5,6,7));
		System.out.println(arr);
		System.out.println("=========================================================================");

//contains:element present or not
		//contains==>element present or not checking
		boolean p=arr1.contains("a");
		System.out.println(p);
		boolean q=arr1.containsAll(List.of(1,2,3,4,5,"a"));
		System.out.println(q);
		System.out.println("=========================================================================");

//equals:both content are same
		boolean bp=arr1.equals(List.of("a",1,3,2,4,5));
		System.out.println(bp);
		System.out.println("=========================================================================");

//isEmpty:if the array is empty 
		boolean x=arr.isEmpty();
		System.out.println(x);
		System.out.println("=========================================================================");

//convert arryList <--->string 
		String strs=arr1.toString();
		System.out.println(strs);
		System.out.println("=========================================================================");
//convert ArrayList <---> array 
		Object[] app=arr1.toArray();
		System.out.println(app);
		System.out.println("=========================================================================");
//clear the arrayList 
		arr1.clear();
		System.out.println(arr1);
		System.out.println("=========================================================================");
//copy the arrayList 
		Object obj=arr1.clone();
		ArrayList array=(ArrayList) obj;
		System.out.println("=========================================================================");
//sorting:-
		char[] rs= {10,21,3,4,5,6,100};
		int i=0;
		while(i<rs.length-1) {
			int j=i;
			while(j<rs.length) {
				if(rs[i]<rs[j]) {
				char tem=rs[i];
				 rs[i]=rs[j];
				 rs[j]=tem;
				 
				}
				 
				j++;
			}
			i++;
		}
		System.out.println(Arrays.toString(rs));
		
		
		HashSet H=new HashSet(List.of(1,100,1000,10000));
		ArrayList xpp=new ArrayList(H);
		Collections.sort(xpp);
		System.out.println(xpp);
		ArrayList_methods  objs=new ArrayList_methods ();
		objs.add(100);objs.add(2000);objs.add(300);
//		System.out.println(objs.removeRange(i, i));
		
		
		
		

		

	}

}
