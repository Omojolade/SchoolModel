package system.school;

public class Student {
    private String name;
    private String id;
    private String gender;
    private String course;

    public Student(String name, String id, String gender, String course) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.course = course;
    }

    public String take() {
        System.out.println("Take a course");
        return "Take a course";
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }
}
