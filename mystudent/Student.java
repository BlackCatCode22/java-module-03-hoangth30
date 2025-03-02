package mystudent;

public class Student {
    // Instance variables
    private String name;
    private int age;
    private String studentId;

    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for studentId
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // toString method for displaying student information
    @Override
    public String toString() {
        return "Student [Name=" + name + ", Age=" + age + ", Student ID=" + studentId + "]";
    }
}
