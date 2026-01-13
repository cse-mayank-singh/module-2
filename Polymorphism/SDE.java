class SDE extends Employee {
    String techStack;
    SDE(int id, String name, String techStack) {
        super(id, name);
        this.techStack = techStack;
    }
    @Override
    public void reverseKT() {
        System.out.println("SDE giving reverse KT");
    }
    @Override
    public void task() {
        System.out.println("SDE coding in " + techStack);
    }
    @Override
    public void employeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
        System.out.println("Tech Stack: " + techStack);
    }
}