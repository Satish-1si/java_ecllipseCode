package multithreading;

public class thread extends Thread{
	
	public  String thread_name;
	public thread(String str) {
		this.thread_name=str;
	}
	public void run() {

		for(int i=0;i<10;i++) {
			System.out.println(i+"="+this.thread_name);
		}
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
	/*multithreading:-
    1.all thread objects excution at a time start avuthayi
	2.compiler excution time ni==>all thread that compiler time ni equal ga share chesukuntayi
	3.but multithreading lo==>okka sari excute chesinapudu vachi order another time excute chesinapudu order change avuthudi.
	4.suppose okka thread excute avakapothe immediatly another thread excute avipoythudi
	5.multithreading lo threads excution ni manam predit ===>cheyalemu(appudu a thread excute avuthudoo avariki teliyadu)
	6.  thread_object print chesthe vache output ===>Thread[Thread_name,size,Threadgroup]
	7.thread_object ki name set cheyali anata===>thread_obj.setName("name")
	8.yaa thread appudu excute avuthudoo avaki theliyadu==>but  yaa thread  appudu excute avalo manam set  cheyavachu
	  by using 
	     ===>thread_object.s.setPriority("field_name")          [OR]
	     ===>thread_object.s.setPriority(PRIORITY_RANGE)
     *TYPES OF FIELD_NAMES              PRIORITY_RANGE
     1.Thread.MAX_PRIORITY                              1.   10
     2.Thread.NORM_PRIORITY                           2.   5 (DEFAULT)
     3.Thread.MIN_PRIORITY                                3.   1
	                                                                          4.DIRECTLY GIVE ==>0 TO 10
	#Note:-
	antha thread method tho thread ni set chesinaa ===>thread excution anadi complete gaa sytem excution meda  dependent avuthudi.
	kavabati ==>thread method tho thread ni set  chesthenatha mathranaa(by using pritioty tho)  order change avadu
	 but thread excution end avinapudu priorty ni base chesukunu that particular thread end chesthudi......
	i.e [yaa operation-system kudaa ==>manam set chesinaa thread-priotys patichikodu.]
	
	*/
		   thread child_obj_0=new thread("main");
		   Thread parent_obj_0=new Thread();
		    parent_obj_0.sleep(30);;
	 //thread-1
      thread child_obj_1=new thread("one");
      Thread parent_obj_1=new Thread(child_obj_1);
      parent_obj_1.setName("one");
      parent_obj_1.start();
     parent_obj_1.setPriority(3);
      System.out.println( parent_obj_1);
    

     
      //thread-2
      thread child_obj_2=new thread("second");
      Thread parent_obj_2=new Thread(child_obj_2);
      parent_obj_2.setName("two");
      parent_obj_2.start();
      parent_obj_1.setPriority(2);
      System.out.println(      parent_obj_2);
      
      //thread-3
      thread child_obj_3=new thread("thrid");
      Thread parent_obj_3=new Thread(child_obj_3);
      parent_obj_3.setName("three");
      parent_obj_3.start();
      parent_obj_1.setPriority(1);
      System.out.println(      parent_obj_3);

      System.out.println("satish amnepalli");

	}

}
