package system.school;

public class Staff {
    private String name;
    private String id;
    private String grade;
    private String gender;

    public Staff(String name, String id, String grade, String gender) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.gender = gender;
    }
    public String role() {
        return "The role of Staff is to support the school";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }
}
