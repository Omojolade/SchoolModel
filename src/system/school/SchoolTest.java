package system.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    private List<Applicants> applicants = new ArrayList<>();
    private List<Class> classes = new ArrayList<>();
    private List<Courses> courses = new ArrayList<>();
    private List<Student> student = new ArrayList<>();
    private List<NonAcademicStaff> nonacadamicstaff = new ArrayList<>();
    private Principal principal = new Principal("Omolade", "1", "14", "Female", 300000,"Overseeing");
    private List<Teacher> teacher = new ArrayList<>();

    @Test
    void employ() {
        School school = new School(principal, teacher, nonacadamicstaff, student, courses, classes, applicants);
        String actual = school.employ();
        assertEquals("Employ a teacher", actual);
    }


    @Test
    void admit() {
        School school = new School(principal, teacher, nonacadamicstaff, student, courses, classes, applicants);
        String actual = school.admit();
        assertEquals("Admit a student", actual);
    }
}