package system.school;

public class Applicants {
    private String name;
    private String id;
    private int age ;

    public Applicants(String name, String id) {
        this.name = name;
        this.id = id;
        this.age = 18;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
