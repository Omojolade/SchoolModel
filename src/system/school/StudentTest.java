package system.school;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StudentTest {

    @Test
    void take() {
        Student student = new Student("Joy", "1", "Female", "Java");
        String actual = student.take();
        assertEquals("Take a course", actual);
    }
}