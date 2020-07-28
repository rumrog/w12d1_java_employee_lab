import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("John", "AB123456C", 2000, "Sales");
    }

    @Test
    public void hasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void hasNin(){
        assertEquals("AB123456C", manager.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(2000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
       assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(3000, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(20, manager.payBonus(), 0.1);
    }
}
