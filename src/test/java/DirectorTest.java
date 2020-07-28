import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){
        director = new Director("Vanessa", "FG456789H", 8000, "Marketing", 50000);
    }

    @Test
    public void hasName(){
        assertEquals("Vanessa", director.getName());
    }

    @Test
    public void hasNin(){
        assertEquals("FG456789H", director.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(8000, director.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Marketing", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1000);
        assertEquals(9000, director.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(80, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget(){
        assertEquals(50000, director.getBudget(), 0.1);
    }
}
