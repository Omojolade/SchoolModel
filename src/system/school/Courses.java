package system.school;

public class Courses {
    private String courseTitle;
    private String courseId;

    public Courses(String courseTitle, String courseId) {
        this.courseTitle = courseTitle;
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseId() {
        return courseId;
    }
}
