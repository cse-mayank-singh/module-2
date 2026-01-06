class Son extends Father{
	@Override                                               //alert for compiler that overriding is happening highly recommended 
	public void method(){
		System.out.println("Future is bright!");
	}
	// @Override                                             
	// public final void marrige(){
	// 	System.out.println("Love Marrige!");                //error, final method cant be overrided!!!!!!!!!!!
	// }
	@Override
	public BasicCalculator buyCalculator(){                 //condition scietificcalculator should be extending basiccalculator
		return new ScientificCalculator();
	}
}