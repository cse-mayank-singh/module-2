class Father{
	public void method(){
		System.out.println("Future is dark!");
	}                                              //alert for compiler that overriding is happening highly recommended 
	public final void marrige(){                  //final method cant be overrided!!!!!!!!!!!
		System.out.println("Arrange Marrige!");
	}
	public BasicCalculator buyCalculator(){
		return new BasicCalculator();
	}
}