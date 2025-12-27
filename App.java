/*
Performing CIRUD Operations on Student class type object
write a java program to display the multiplication table for the given integer type input, forward/backward , even/odd table;
*/
/*
Performing CIRUD Operations on Student class type object
1. display square,cube,suareroot,cuberoot of the given integer type number;
*/
// public static void execution() {
// 		/*{
// 		Employee.company="Capgemini";
//     	Employee.city="Pune";
//     	Employee.state="Maharashtra";
//     	Employee.country="INDIA";
//     	Employee emp1=new Employee();
//     	Employee emp2=new Employee();
//     	Employee emp3=new Employee();
//     	Employee emp4=new Employee();

//     	// Initialize emp1
//         emp1.id = 101;
//         emp1.name = "Rahul Sharma";
//         emp1.mailId = "rahul.sharma@capgemini.com";
//         emp1.contact = "9876543210";
//         emp1.aadharNo = "1234-5678-9012";
//         emp1.panNo = "ABCDE1234F";
//         emp1.DOB = "1990-05-12";
//         emp1.age = 35;
//         emp1.gender = "Male";
//         emp1.maritalStatus = "Married";
//         emp1.branch = "Corporate";
//         emp1.dept = "IT";
//         emp1.salary = 85000;
//         emp1.reportingManager = "Anita Desai";
//         emp1.designation = "Senior Developer";
//         emp1.role = "Backend Engineer";
//         emp1.incentive = 5000;
//         emp1.UAN = "UAN123456";
//         emp1.YOE = 10;

//         emp2.id = 102;
//         emp2.name = "Priya Verma";
//         emp2.mailId = "priya.verma@capgemini.com";
//         emp2.contact = "9123456780";
//         emp2.aadharNo = "2345-6789-0123";
//         emp2.panNo = "PQRSX5678Y";
//         emp2.DOB = "1995-08-20";
//         emp2.age = 30;
//         emp2.gender = "Female";
//         emp2.maritalStatus = "Single";
//         emp2.branch = "Corporate";
//         emp2.dept = "HR";
//         emp2.salary = 65000;
//         emp2.reportingManager = "Rajesh Kumar";
//         emp2.designation = "HR Executive";
//         emp2.role = "Recruitment Specialist";
//         emp2.incentive = 3000;
//         emp2.UAN = "UAN234567";
//         emp2.YOE = 6;

//         // Employee 3
// 		emp3.id = 103;
// 		emp3.name = "Amit Sharma";
// 		emp3.mailId = "amit.sharma@capgemini.com";
// 		emp3.contact = "9876543210";
// 		emp3.aadharNo = "3456-7890-1234";
// 		emp3.panNo = "ABCDS1234Z";
// 		emp3.DOB = "1990-03-15";
// 		emp3.age = 35;
// 		emp3.gender = "Male";
// 		emp3.maritalStatus = "Married";
// 		emp3.branch = "Corporate";
// 		emp3.dept = "Finance";
// 		emp3.salary = 85000;
// 		emp3.reportingManager = "Neha Gupta";
// 		emp3.designation = "Senior Financial Analyst";
// 		emp3.role = "Budget Planning Specialist";
// 		emp3.incentive = 5000;
// 		emp3.UAN = "UAN345678";
// 		emp3.YOE = 10;

// 		// Employee 4
// 		emp4.id = 104;
// 		emp4.name = "Sneha Iyer";
// 		emp4.mailId = "sneha.iyer@capgemini.com";
// 		emp4.contact = "9988776655";
// 		emp4.aadharNo = "4567-8901-2345";
// 		emp4.panNo = "LMNOP6789K";
// 		emp4.DOB = "1998-11-10";
// 		emp4.age = 27;
// 		emp4.gender = "Female";
// 		emp4.maritalStatus = "Single";
// 		emp4.branch = "Corporate";
// 		emp4.dept = "IT";
// 		emp4.salary = 72000;
// 		emp4.reportingManager = "Arun Mehta";
// 		emp4.designation = "Software Engineer";
// 		emp4.role = "Backend Developer";
// 		emp4.incentive = 4000;
// 		emp4.UAN = "UAN456789";
// 		emp4.YOE = 5;

// 		Employee[] employees = {emp1, emp2, emp3, emp4};
//         for (Employee emp : employees) {
//             emp.displayEmployeeDetails();
//             emp.entry();
//             emp.login();
//             emp.shortBreak();
//             emp.task();
//             emp.taskUpdate();
//             emp.meeting();
//             emp.reverseKT();
//             emp.longBreak();
//             emp.logout();
//             emp.exit();
//             System.out.println("--------------------------------------------------");
//         }}*/
//         // StudentClass std1=new StudentClass();//create
//         // std1.Id=1;
//         // std1.name="Mayank";
//         // std1.contactNo=9876543210l;//Insert
//         // std1.read(); //read
//         // std1.Id=2; //update
//         // std1.read();
//         // std1=null; //delete
// }
import java.util.Scanner;
class App {
    // public static void execution() {
    //     Scanner sc = new Scanner(System.in);
    //     boolean exit = false;
    //     StudentClass student=null;
    //     while (!exit) {
    //         System.out.println("\n************ STUDENT MENU *************");
    //         System.out.println("1. Create Student");
    //         System.out.println("2. Insert / Update Student Data");
    //         System.out.println("3. Read Student Data");
    //         System.out.println("4. Delete Student");
    //         System.out.println("5. Exit");
    //         System.out.print("Enter choice: ");
    //         int choice = sc.nextInt();
    //         switch (choice) {
    //             case 1:
    //                 student = new StudentClass();
    //                 System.out.println("Student object created.");
    //                 break;
    //             case 2:
    //                 if (student != null) {
    //                     System.out.print("Enter Id: ");
    //                     student.Id = sc.nextInt();
    //                     System.out.print("Enter Name: ");
    //                     student.name = sc.next();
    //                     System.out.print("Enter Contact No: ");
    //                     student.contactNo = sc.nextLong();
    //                     System.out.println("Student data saved/updated.");
    //                 } else {
    //                     System.out.println("Create student first!");
    //                 }
    //                 break;
    //             case 3:
    //                 if (student != null) {
    //                     student.read();
    //                 } else {
    //                     System.out.println("No student to display.");
    //                 }
    //                 break;
    //             case 4:
    //                 if (student != null) {
    //                     student = null;
    //                     System.out.println("Student deleted.");
    //                 } else {
    //                     System.out.println("No student exists.");
    //                 }
    //                 break;
    //             case 5: // EXIT
    //                 exit = true;
    //                 System.out.println("....Exiting application...");
    //                 break;
    //             default:
    //                 System.out.println("Invalid choice!");
    //         }
    //     }
    // }
    public static void ftable(int num){
    	for(int i=1;i<11;i++){
    		System.out.println(num + "X" + i + "==" + num*i);
    	}
        System.out.println("==================================");
    }
    public static void btable(int num){
    	for(int i=10;i>0;i--){
    		System.out.println(num + "X" + i + "==" + num*i);
    	}
        System.out.println("==================================");
    }
    public static void table(){
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Starting Range");
    	int start=sc.nextInt();
    	System.out.print("Enter Ending Range");
    	int end=sc.nextInt();
    	if(end>start){
    		for(int i=start;i<=end;i++){
                if(i%2==0){
                    ftable(i);
                }
            }
    	}
    	if(start>end){
            for(int i=start;i>=end;i--){
                if(i%2!=0){
                    btable(i);
                }
            }
    	}
    }
    public static void Powers(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number to be squared: ");
        int sinit=sc.nextInt();
        System.out.print("Enter Number to be cubed: ");
        int cinit=sc.nextInt();
        int s=sinit*sinit;
        int c=cinit*cinit*cinit;
        System.out.println("Square is: "+ s);
        System.out.println("Cube is: "+ c);
        System.out.print("Enter Number for square root: ");
        double n=sc.nextInt();
        double low = 0, high = n, mid;
        double precision = 1e-6;
        while (high - low > precision) {
            mid = (low + high) / 2;

            if (mid * mid <= n)
                low = mid;
            else
                high = mid;
        }
        System.out.println("square root: "+low);
        System.out.print("Enter Number for cube root: ");
        double num=sc.nextInt();
        low = 0; 
        high = num;
        precision = 1e-6;
        while (high - low > precision) {
            mid = (low + high) / 2;

            if (mid * mid * mid <= num)
                low = mid;
            else
                high = mid;
        }
        System.out.println("cube root: "+low);
    }
    public static void exec(){
        Scanner sc = new Scanner(System.in);
        StudentClass student = null;
        boolean exit = false;
        while (!exit) {
            System.out.println("========Student CRUD Menu=========");
            System.out.println("1. Create Student");
            System.out.println("2. Read/View Details");
            System.out.println("3. Update Password");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Password: ");
                    String pass = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    long phone = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    student = new StudentClass(name, id, pass, phone, email);
                    System.out.println("Student created successfully!");
                    break;
                case 2:
                    if (student != null) {
                        student.getDetails();
                    } else {
                        System.out.println("No student exists. Please create first.");
                    }
                    break;
                case 3:
                    if (student != null) {
                        System.out.print("Enter new password: ");
                        String newPass = sc.nextLine();
                        student.setPassword(newPass);
                        System.out.println("Password updated successfully!");
                    } else {
                        System.out.println("No student exists to update.");
                    }
                    break;
                case 4:
                    if (student != null) {
                        student = null; // delete object
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("No student exists to delete.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting CRUD menu.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.\n");
            }
        }
    }
    public static void CarEngineMedia(){
        MediaPlayer mediaPlayer=new MediaPlayer("SONY",10);
        Engine engine=new Engine(500,"CHAIN");
        Car car=new Car("Audi","White",engine);//Constructor Dependency Injection ; for composition ;  strong dependency
        car.displayCarDetails();
        car.getEngine().displayEngineDetails();
        car.setMediaPlayer(mediaPlayer);    //setter method dependency injection for aggregation  //Aggregation, setting from outside ; independent 
        car.getMediaPlayer().displayMediaPlayer();
    }
}
