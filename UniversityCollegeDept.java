class University {
    private String name;
    private College college;
    public University(String name) {
        this.name = name;
    }
    public void setCollege(College college) {
        this.college = college;
    }
    public College getCollege() {
        return this.college;
    }
    public void displayUniversity() {
        System.out.println("University Name: " + name);
        if (college != null) {
            college.displayCollege();
        } else {
            System.out.println("No college assigned.");
        }
    }
}
class College {
    private String name;
    private Department department;

    public College(String name) {
        this.name = name;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public Department getDepartment() {
        return this.department;
    }
    public void displayCollege() {
        System.out.println("  College Name: " + name);
        if (department != null) {
            department.displayDepartment();
        } else {
            System.out.println("  No department assigned.");
        }
    }
}
class Department {
    private String name;
    private Student student;
    public Department(String name) {
        this.name = name;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return this.student;
    }

    public void displayDepartment() {
        System.out.println("    Department Name: " + name);
        if (student != null) {
            student.displayStudent();
            student.readProject();
        } else {
            System.out.println("    No student assigned.");
        }
    }
}