abstract class Employee{
	int id;
	String name;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	static String company;
	public void entry(){
		System.out.println("Entry ho gayi");
	}
	public void login(){
		System.out.println("Login ho gayi");
	}
	public void meeting(){
		System.out.println("Meeting Chal rahi hai");
	}
	public abstract void reverseKT();
	public abstract void task();
	public abstract void employeeInfo();
	public void logout(){
		System.out.println("Login ho gayi");
	}	
}