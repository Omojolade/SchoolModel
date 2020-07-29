package system.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    @Test
    void expel() {
        Principal principal = new Principal("Tope", "1", "grade14","Female",300000, "Overseeing");
        String actual = principal.expel();
        assertEquals("Expelled", actual);
    }

    @Test
    void admit() {
        Principal principal = new Principal("Tope", "1", "grade14","Female",300000, "Overseeing");
        String actual = principal.admit();
        assertEquals("Admitted", actual);
    }
    @Test
    void role() {
        Principal principal = new Principal("Tope", "1", "grade14","Female",300000, "Supervise");
        String actual = principal.role();
        assertEquals("The role of Staff is to support the school", actual);
    }
    @Test
    void promote() {
        Promotable principal = new Principal("lade", "4", "grade10","Male",250000,"Supervise");
        String actual = principal.promote();
        assertEquals("Staff is due for promotion, PROMOTE!!", actual);
    }



}