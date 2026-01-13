class SecondSubInterface implements SecondInterface{
	@Override
	public void nsm2(){
		System.out.println("Non static method of da interface");
	}
	@Override
	public void nsm1(){
		System.out.println("Non static default method overrided!!!!!! of da interface");   //optional for implements class to provide body for default
	}
}