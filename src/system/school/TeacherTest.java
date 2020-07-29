package system.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @Test
    void teach() {
        Teacher teacher = new Teacher("Omolade", "2", "grade2", "Female", 30000, "Java");
        String actual = teacher.teach();
        assertEquals("Teach a course", actual);
    }
    @Test
    void role() {
        Teacher teacher = new Teacher("Omolade", "2", "grade2", "Female", 30000, "Java");
        String actual = teacher.role();
        assertEquals("The role of a teacher is to teach and guide students", actual);
    }
}