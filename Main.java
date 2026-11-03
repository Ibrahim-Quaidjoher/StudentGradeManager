public class Main {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        
        manager.addStudent(new Student("Ali", 101, 85.5));
        manager.addStudent(new Student("Sara", 102, 92.0));
        
        manager.showAllStudents();
    }
}