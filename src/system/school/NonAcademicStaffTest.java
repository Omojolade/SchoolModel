package system.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonAcademicStaffTest {

    @Test
    void role() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff("Omolade", "5","grade5","Female",45000,"admin");
        String actual = nonAcademicStaff.role();
        assertEquals("The role of a non-academic staff is for administrative duties", actual);
    }

    @Test
    void getSalary() {
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff("Omolade", "5","grade5","Female",45000,"admin");
        long actual = nonAcademicStaff.getSalary();
        assertEquals(45000, actual);
    }
}