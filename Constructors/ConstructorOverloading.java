class ConstructorOverloading{
	String name;
	int id;
	String email;
	String dob;
	long salary;
	long contact;
	char gender;
	ConstructorOverloading(String name,int id){
		this.name=name;
		this.id=id;
	}
	ConstructorOverloading(String email,String dob){
		this.email=email;
		this.dob=dob;
	}
	ConstructorOverloading(long salary,long contact,char gender){
		this.salary=salary;
		this.contact=contact;
		this.gender=gender;
	}
	ConstructorOverloading(String name,int id, String email){
		this.name=name;
		this.id=id;
		this.email=email;
	}
	public void display(){
		System.out.println("===================Details are as follows=============== " ); 
		System.out.println("Name: "+name ); 
		System.out.println("Id: "+id ); 
		System.out.println("email: "+email ); 
		System.out.println("dob: "+dob ); 
		System.out.println("salary: "+salary ); 
		System.out.println("contact: "+contact ); 
		System.out.println("gender: "+gender ); 
	}
}