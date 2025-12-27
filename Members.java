class Members{
	Members(){
		System.out.println("Constructor Called, object was created");
	}
	public static int sv;
	public static void sm() {
		System.out.println("sm()");
	}
	static{
		System.out.println("static");
	}
	public String nsv;
	public void nsm(){
		System.out.println("nsm()");
	}
	{
		System.out.println("non static");
	}
}