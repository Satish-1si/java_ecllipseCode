
public interface inteface { 
	void data(String arg);
	static void method(String str) {
		System.out.println(str);
	}
	default void method1(String str) {
		System.out.println(str);
	}
	final static String app ="sai" ;
}
