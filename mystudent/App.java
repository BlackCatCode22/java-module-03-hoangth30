package mystudent;

public class App {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Hoang", 28, "S001");
        Student student2 = new Student("Kai", 27, "S002");

        // Display student information using the toString method
        System.out.println(student1);
        System.out.println(student2);
    }
}