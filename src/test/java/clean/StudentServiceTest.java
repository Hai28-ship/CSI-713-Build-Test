package clean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService service;

    @BeforeEach
    void setUp() {
        service = new StudentService();
        service.addStudent(new Student("Alice", 3.2));
        service.addStudent(new Student("Bob", 3.9));
        service.addStudent(new Student("Charlie", 3.5));
    }

    @Test
    void testGetTopStudent() {
        Student top = service.getTopStudent();
        assertNotNull(top);
        assertEquals("Bob", top.getName());
    }

    @Test
    void testGetAverageGPA() {
        double avg = service.getAverageGPA();
        assertEquals((3.2 + 3.9 + 3.5) / 3, avg, 0.0001);
    }
}
