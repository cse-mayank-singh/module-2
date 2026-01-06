class App{
	public static void execute() {
		// System.out.println(AdditionPoly.add(1,2));
		// System.out.println(AdditionPoly.add(1,2,3));
		// System.out.println(AdditionPoly.add(1.1,2.2));
		// System.out.println(AdditionPoly.add(1.1,2.2,3.3));
		// System.out.println(AdditionPoly.add(1,2.2,3));
		// System.out.println(AdditionPoly.add(1,2.2));
		// System.out.println(AdditionPoly.add(1.2,2));  // overloading

		//overriding
		Son obj=new Son();
		obj.method();
		// obj.marrige();   //error as 1.final method cant be overrided  2. static methods cant be overrided
		System.out.println(obj.buyCalculator());
	}
}