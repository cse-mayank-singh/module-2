interface SecondInterface{
	public static void sm(){
		System.out.println("Static method of da interface");   //cannot be used by implement class
	}
	public default void nsm1(){
		System.out.println("Non static default method of da interface");   //optional for implements class to provide body for default
	}
	public void nsm2();     //compiler will change it to abstract
}