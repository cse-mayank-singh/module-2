// class StudentClass{
// 	int Id;
// 	String name;
// 	long contactNo;
// 	StudentClass(int Id,String name,long contactNo){
// 		this.Id=Id;
// 		this.name=name;
// 		this.contactNo=contactNo;
// 	}
// 	static{
// 		System.out.println("STUDENT OBJECT CREATED!");
// 	}
// 	public void read(){
// 		System.out.println("\nStudent Details\n========================\n");
// 		System.out.println("Id: "+Id);
// 		System.out.println("Name: "+name);
// 		System.out.println("Contact: "+contactNo);
// 	}
// }
class StudentClass{
	// private int id;
	// private String name; //cant be accessed directly
	// public int getid(){
	// 	return id;
	// }
	// public void setid(int id){
	// 	this.id=id;
	// }
	private String name;
	private int id;
	private String passw;
	private long contact;
	private String mail;
	StudentClass(String name, int id, String passw, long contact,String mail){
		this.name=name;
		this.id=id;
		this.passw=passw;
		this.contact=contact;
		this.mail=mail;
	}
	public void setPassword(String passw){
		this.passw=passw;
	}
	public void getDetails(){
		System.out.println("Name is "+name+" id is "+id+" pass is "+passw + " contact "+contact+" mail "+ mail);
	}
}