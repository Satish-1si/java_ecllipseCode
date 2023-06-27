import java.util.Arrays;
import java.util.List;

public class sub_child_partener  extends abstact{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		sub_child_partener obj=new  sub_child_partener ();
		int[] i=new int[10];
		Integer[][] j= {{1,2,3},{1,2,3}};
		i[0]=1;i[1]=2;i[2]=3;i[3]=4;
		Arrays.sort(i);
		Arrays.fill(i, 4,6, 1000);
		int index=Arrays.binarySearch(i,1000);
		int[] s= {1,2,34,5};
		boolean b=Arrays.equals(i,s );
		System.out.println(b); 
		System.out.println(index);
		System.out.println(Arrays.toString(i));
		String[] x="satishisagoodboy".split("");String[] y="satishboy".split("");
		List<String> arr=Arrays.asList(x);
		System.out.println(arr);
		//		Arrays.tostring(arr);===>return string
		//		Arrays.sort(arr);===>void 
		//		Arrays.binaraysearch(arr,item);===>int
		//		Arrays.equals(obj1,obj2);===?boolean
		//		Arrays.fill(arr,fill_item,start,end);===>void
		//		Arrays.mismatch(arr[],arr[]);===>mismatch index
		//		Arrays.asList(wrapper_class_arr_only_covert);===>list
		//		Arrays.copyOf(array,Range_of_elements);====>
		//		Arrays.copyOfRange(array,Start_Range_of_elements,end_range_of_elements);
		//      Arrays.deepToString(multi_dimensional_array)\
		//		Arrays.deepequals(mularr1,mularr2);
		Integer[] z= {1,2,3,4};
		Integer[] c=Arrays.copyOfRange(z, 2,4);
		int[][] ap= {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepEquals(ap,ap));
		System.out.println(Arrays.deepToString(j));
		System.out.println(Arrays.asList(c));
		List str=Arrays.asList("uppanadra movie watch for uppanadra boy".split(" "));
		String[] str1="uppanadra boy".split(" ");
		String ing="";
		System.out.println("========================");
		for(String arg1:str1) {
			if(str.contains(arg1)) {
				long l=str.stream().filter(xp->xp.equals(arg1)).count();;
				System.out.println(arg1+" "+l);

			}
		}

		Integer[] no= {1,2,3,10,12,24,1000};
		int no1=0;int no2=no.length;
		while(no1<no2) {
			int sec=no1;
			while(sec<no.length) {
				if(no1<no2) {
					int temp=no[no1]; 
					no[no1]=no[sec];
					no[sec]=temp;
				}

				sec++;


			}
			no1++;
		}
		System.out.println(Arrays.asList(no));

      

	}




	@Override
	void abs_metthod(int arg) {
		if(arg<=200) {
			System.out.println("you are not satify");
		}
		else{
			System.out.println("you  satify");

		}

	}

}
