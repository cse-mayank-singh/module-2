/*create a class employee and declare the following 1variables and 2methods 1.id name mailId contact aadharno panno DOB age gender maritial_status company branch dept salary reporting_manager designation role incentive UAN YOE city state country;
2. displayEmployeeDetails entry login shortBreak task taskUpdate meeting reverseKT longBreak logout exit;
*/
// Write a java program to create a class JavaApplication and create 4 employee class type objects then initialise all the variables and call all the methods.
class Employee{
    int id;
    String name;
    String mailId;
    String contact;
    String aadharNo;
    String panNo;
    String DOB;
    int age;
    String gender;
    String maritalStatus;
    static String company;
    String branch;
    String dept;
    double salary;
    String reportingManager;
    String designation;
    String role;
    double incentive;
    String UAN;
    int YOE;
    static String city;
    static String state;
    static String country;

    // 2. Methods (Behaviors)
    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Contact: " + contact);
        System.out.println("Aadhar No: " + aadharNo);
        System.out.println("PAN No: " + panNo);
        System.out.println("DOB: " + DOB);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Marital Status: " + maritalStatus);
        System.out.println("Company: " + company);
        System.out.println("Branch: " + branch);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
        System.out.println("Reporting Manager: " + reportingManager);
        System.out.println("Designation: " + designation);
        System.out.println("Role: " + role);
        System.out.println("Incentive: " + incentive);
        System.out.println("UAN: " + UAN);
        System.out.println("Years of Experience: " + YOE);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
    }

    public void entry() {
        System.out.println(name + " has entered the office.");
    }

    public void login() {
        System.out.println(name + " has logged in.");
    }

    public void shortBreak() {
        System.out.println(name + " is on a short break.");
    }

    public void task() {
        System.out.println(name + " is working on a task.");
    }

    public void taskUpdate() {
        System.out.println(name + " has updated the task.");
    }

    public void meeting() {
        System.out.println(name + " is attending a meeting.");
    }

    public void reverseKT() {
        System.out.println(name + " is conducting reverse KT.");
    }

    public void longBreak() {
        System.out.println(name + " is on a long break.");
    }

    public void logout() {
        System.out.println(name + " has logged out.");
    }

    public void exit() {
        System.out.println(name + " has exited the office.");
    }
}
      