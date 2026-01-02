class Project{				// +Project:class    +means public -means private
	private int id;			// -id:int
	private String name;	// -name:String
	private String desc;  //  -desc:String
	public Project(){
	}
	public Project(int id,String name,String desc){
		this.id=id;
		this.name=name;
		this.desc=desc;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getDesc(){
		return desc;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setDesc(String desc){
		this.desc=desc;
	}
	public void displayProject(){   // +displayProject:void
		 System.out.println("\nProject name is "+getName()+" id is "+getId()+" desc is "+getDesc()+"\n");
	}
}