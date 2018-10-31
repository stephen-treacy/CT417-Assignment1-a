
package com.mycompany.assignment1parta;

import com.mycompany.assignment1parta.Course;
import com.mycompany.assignment1parta.Module;
import com.mycompany.assignment1parta.Student;

import java.util.ArrayList;
import org.joda.time.DateTime;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Shop
 */
public class FullTest {
    
    private Student tstudent;
    private Module tmodule;
    private Course tcourse;

    ArrayList<Course> testCourses = new ArrayList<Course>();
    ArrayList<Student> testStudents = new ArrayList<Student>();
    ArrayList<Module> testModules = new ArrayList<Module>();

    @Before
    public void setUp() {

        tcourse = new Course("BCT", new DateTime("2014-09-05"), new DateTime("2019-05-20"));
        tstudent = new Student("Test Student", 21, "21/02/1997", "15337333");
        tmodule = new Module("Software Engineering", "CT417", tstudent, tcourse);
        

    }

    @Test
    public void testStudent() {
        Course[] course = new Course[10];
        course[0] = tcourse;

        tstudent.setName("Stephen Treacy");
        tstudent.setAge(21);
        tstudent.setDOB("21/02/1997");
        tstudent.setID("1335333");

        assertEquals(tstudent.getDOB(), "21/02/1997");
        assertEquals(tstudent.getUsername(), "Stephen Treacy21");
        assertEquals(tstudent.getID(), "153373363");

    }

    @Test
    public void testModule() {
        Student[] stu = new Student[10];
        stu[0] = tstudent;

        Course[] course = new Course[10];
        course[0] = tcourse;

        tmodule.setStudents(stu);
        tmodule.setName("CT417");
        tmodule.setCourses(course);

        assertEquals(tmodule.getStudents()[0].getName(), "Stephen Treacy");
        assertEquals(tmodule.getName(), "CT417");
        assertEquals(tmodule.getCourses()[0].getName(), "BCT");

    }

    @Test
    public void CP_Tests() {
        Module[] mod = new Module[10];
        mod[0] = tmodule;
        tcourse.setModules(mod);
        assertEquals(tcourse.getModules()[0].getName(), "CT417");

    }
}
