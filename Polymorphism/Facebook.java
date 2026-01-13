class Facebook extends SAPP{
	@Override
	public void openable(){
		System.out.println("OPENED");
	}
	@Override
	public void signin(){
		System.out.println("SIGN IN");
	}
	@Override
	public void signout(){
		System.out.println("SIGN OUT");
	}
	@Override
	public void signup(){
		System.out.println("SIGN UP");
	}
	@Override
	public void closable(){
		System.out.println("CLOSED");
	}
}