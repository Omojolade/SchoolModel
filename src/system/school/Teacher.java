package system.school;

/**
 * Implementation Of Inheritance, Teacher is a Subclass of Staff
 */
public class Teacher extends Staff {
    private int salary;
    private String taughtCourse;
    public Teacher(String name, String id, String grade, String gender, int salary, String taughtCourse) {
        super(name, id, grade, gender);
        this.salary = salary;
        this.taughtCourse = taughtCourse;
    }

    @Override
    public String role() {
        return "The role of a teacher is to teach and guide students";
    }

    public String teach() {
        return "Teach a course";
    }

    public int getSalary() {
        return salary;
    }

    public String getTaughtCourse() {
        return taughtCourse;
    }
}
