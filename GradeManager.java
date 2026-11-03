import java.util.ArrayList;
import java.util.List;

public class GradeManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("--- Student Records ---");
        for (Student s : students) {
            s.displayStudent();
        }
    }
}