package system.school;

/** OOP Concepts used here are Inheritance
 *  Interface and Encapsulation
 */
public class Principal extends Staff implements Promotable {
    private int salary;
    private String role;
    /* Constructor to initialize an object*/
    public Principal(String name, String id, String grade, String gender, int salary, String role) {
        super(name, id, grade, gender);
        this.salary = salary;
        this.role = role;
    }

    public String expel() {
        System.out.println("Expel a student");
        return "Expelled";
    }

    public String admit() {
        Applicants applicants = new Applicants("Faith", "12");
        if (applicants.getAge() >= 18) {
            System.out.println("Admit an applicant");
        }
        return "Admitted";
    }

    public int getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    /*Implementation of Interface by the principal class*/
    public String promote() {
        return "Staff is due for promotion, PROMOTE!!";
    }
}
