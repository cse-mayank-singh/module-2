class ConstructorChaining{
	String name;
	int id;
	String email;
	String dob;
	long salary;
	long contact;
	char gender;
	ConstructorChaining(String name,int id){
		this.name=name; //calling super() of object class automatically by compiler
		this.id=id;
	}
	ConstructorChaining(String name,int id,String email,String dob){
		this(name,id); //call line 9
		this.email=email;
		this.dob=dob;
	}
	ConstructorChaining(String name,int id,String email,String dob,long salary,long contact,char gender){
		this(name,id,email,dob);  //calling line 13
		this.salary=salary;
		this.contact=contact;
		this.gender=gender;
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
