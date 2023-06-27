package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.google.common.base.Predicate;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.Consumer;

public class flow {

	public flow() {
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	List<Integer> list=List.of(1,1,12,3,14,5,6,7,0);
      Stream<Integer> duplicates= list.stream().distinct();
      Stream<Integer> order= duplicates.sorted();
      Stream<Integer> ture_data= order.filter(arg->arg%2==0);
     ture_data.map(arg->Stream.of(arg*3,arg*2,arg*4)).map(arg->arg.toArray()).forEach(arg->System.out.println(arg));;
      
      Predicate<String> p=(String arg)->(arg.length()>10)? true:false;
      int[ ] i=new int[10];
  	
     
	}

}
