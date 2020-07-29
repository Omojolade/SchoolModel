package system.school;

/**
 * Implementation of Inheritance, Non-Academic Staff is Subclass of Staff
 */
public class NonAcademicStaff extends Staff {
    private int salary;
    private String role;
    public NonAcademicStaff(String name, String id, String grade, String gender, int salary, String role) {
        super(name, id, grade, gender);
        this.salary = salary;
        this.role = role;
    }
    @Override
    public String role() {
        return "The role of a non-academic staff is for administrative duties";
    }
    public int getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }
}
