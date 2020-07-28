import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Steve", "BC234567D", 1500);
    }

    @Test
    public void hasName(){
        assertEquals("Steve", developer.getName());
    }

    @Test
    public void hasNin(){
        assertEquals("BC234567D", developer.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(1500, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(2500, developer.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(15, developer.payBonus(), 0.1);
    }
}
