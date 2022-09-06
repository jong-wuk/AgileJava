import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    public static final String NAME = "wook";

    @Test
    void testCreate() {
        Student student = new Student(NAME);
        try {
            Field name = Student.class.getDeclaredField("name");
            name.setAccessible(true);
            name.set(student,"jong");
            System.out.println(student.getName());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        assertEquals(NAME, student.getName());
    }
}