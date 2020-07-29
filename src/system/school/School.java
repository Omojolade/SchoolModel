package system.school;

import java.util.List;

/**
 * Implementation of Composition
 */

public class School {
    /* field variables*/
    private Principal principal;
    private List<Teacher> teachers;
    private List<NonAcademicStaff> nonAcademicStaff;
    private List<Student> students;
    private List<Courses> courses;
    private List<Class> classes;
    private List<Applicants> applicants;
    /*Constructor to initialize objects*/
    public School(Principal principal, List<Teacher> teachers, List<NonAcademicStaff> nonAcademicStaff, List<Student> students, List<Courses> courses, List<Class> classes, List<Applicants> applicants) {
        this.principal = principal;
        this.teachers = teachers;
        this.nonAcademicStaff = nonAcademicStaff;
        this.students = students;
        this.courses = courses;
        this.classes = classes;
        this.applicants = applicants;
    }
    /*Methods*/
    public String employ() {
        return "Employ a teacher";
    }
    public String admit() {
        return "Admit a student";
    }
    /*Getters*/
    public Principal getPrincipal() {
        return principal;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<NonAcademicStaff> getNonAcademicStaff() {
        return nonAcademicStaff;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public List<Applicants> getApplicants() {
        return applicants;
    }

}
