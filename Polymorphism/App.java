class App{
	public static void execute() {

		                                  //method overloading
		// System.out.println(AdditionPoly.add(1,2));
		// System.out.println(AdditionPoly.add(1,2,3));
		// System.out.println(AdditionPoly.add(1.1,2.2));
		// System.out.println(AdditionPoly.add(1.1,2.2,3.3));
		// System.out.println(AdditionPoly.add(1,2.2,3));
		// System.out.println(AdditionPoly.add(1,2.2));
		// System.out.println(AdditionPoly.add(1.2,2));

		                                  //method overriding
		// Son obj=new Son();
		// obj.method();
		// // obj.marrige();   //error as 1.final method cant be overrided  2. static methods cant be overrided
		// System.out.println(obj.buyCalculator());

		                                  //constructor overloading
		// ConstructorOverloading obj1=new ConstructorOverloading("Mayank",12);
		// obj1.display();
		// ConstructorOverloading obj2=new ConstructorOverloading("Mayank@gmail.com","12/12/12");
		// obj2.display();
		// ConstructorOverloading obj3=new ConstructorOverloading(5000000l,9676476474l,'M');
		// obj3.display();
		// ConstructorOverloading obj4=new ConstructorOverloading("Mai",12,"Mayank@gmail.com");
		// obj4.display();

		                               //Constructor Chaining
		// ConstructorChaining obj=new ConstructorChaining("Mayank",12);
		// obj.display();
		// ConstructorChaining obj1=new ConstructorChaining("Mayank",12,"maya@gmail.com","DOB");
		// obj1.display();
		// ConstructorChaining obj2=new ConstructorChaining("Mayank",12,"maya@gmail.commom","DOB1",987908798l,8768769867l,'M');
		// obj2.display();

		                               // internal constructor chaining 
		//-->son extends father and have a constructor sun(){print("sun")} and father having constructor father(){print("father()")}
		//output will be-> son \n father

		                              //abstraction
		// Punjabforabstract obj=new Punjabforabstract();
		// obj.fun();
        
        // Employee.company = "Google";
        // Employee e = new SDE(101, "Tony", "Backend");
        // e.entry();
        // e.login();
        // e.meeting();
        // e.task();
        // e.reverseKT();
        // e.employeeInfo();
        // e.logout();

                                      //interfaces
        // SubInterface obj =new SubInterface();
        // obj.nonStaticMethod();
        // FirstInterface.method();
        // System.out.println(FirstInterface.gender);
        // System.out.println(SubInterface.gender);

                                     //default keyword in interfaces
        // SecondSubInterface obj=new SecondSubInterface();
        // obj.nsm2();
        // obj.nsm1();

                                   //Multiple Interface Inheritation 
        // Facebook obj=new Facebook();
        // obj.openable();
        // obj.signup();
        // obj.signin();
        // obj.signout();
        // obj.closable();

                                   //Non Primitive Typecasting
		// NonPrimitiveTypecasting.UpcastingDowncasting();

		                              //Boxing and Unboxing;
		BoxingAndUnboxing.boxing();
		BoxingAndUnboxing.autoboxing();
		BoxingAndUnboxing.unboxing();
		BoxingAndUnboxing.autounboxing();
	}	
}