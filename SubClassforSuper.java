class SubClassforSuper extends SuperClass{
	public int superVar=2;
	public void superFun(){
		System.out.println("Sub class function activated");
	}
	public void displaySuperInfo(){
		System.out.println("Super variable "+super.superVar);
		super.superFun(); //only immediate parent checked not grandparent
	}
	public void displaySubInfo(){
		System.out.println("Sub variable "+this.superVar);
		this.superFun();
	}
}