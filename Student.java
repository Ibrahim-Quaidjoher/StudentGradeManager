public class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + " | Grade: " + grade);
    }
}