interface FirstInterface {
	char gender='M'; // after compilation becomes  public  static final char
	static void method(){
		System.out.println("Static interface method");
	}
	public void nonStaticMethod();    // after compilation becomes public "abstract" void
}