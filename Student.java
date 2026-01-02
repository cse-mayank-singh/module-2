class Student{				// +Student:class    +means public -means private
	private int id;			// -id:int
	private String name;	// -name:String
	private String contact;  //  -String:long
	private Project project;
	public Student(){
	}
	public Student(int id,String name,String contact){
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getContact(){
		return contact;
	}
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setContact(String contact){
		this.contact=contact;
	}
	public void displayStudent(){   // +displayStudent:void
		 System.out.println("\n================\nStudent name is "+getName()+" id is "+getId()+" contact number is "+getContact()+"\n");
	}
	public void setProject(Project project){
		this.project=project;
	}
	public Project getProject(){
		return project;
	}
	public void createProject(Project project){
		if(this.getProject()==null && project!=null){
			this.setProject(project);
			System.out.println("Project Created");
		}else{
			System.out.println("Project Not Created");
		}
	}
	public void readProject(){
		if(this.project!=null){
			this.getProject().displayProject();
		}else{
			System.out.println("Project Not Displayed");
		}
	}
	public void updateProject(int id,String name,String desc){
		if(id>0 && name!=null && desc!=null){
			if(this.getProject().getId()==id){
				this.getProject().setName(name);
				this.getProject().setDesc(desc);
				System.out.println("UPDATION WAS DONE");
			}else{
				System.out.println("NO UPDATION WAS DONE");
			}
		}
	}
	public void deleteProject(int id){
		if (this.project == null) {
        System.out.println("ID doesn't exist");
        return;
    	}
		if(id>0&&this.project.getId()==id){
			this.setProject(null);
			System.out.println("Deleted Successfully");
		}
		else{
			System.out.println("NO DELETION WAS DONE");
		}
	}
}