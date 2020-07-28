import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Mary", "DE345678F", 2200);
    }

    @Test
    public void hasName(){
        assertEquals("Mary", databaseAdmin.getName());
    }

    @Test
    public void hasNin(){
        assertEquals("DE345678F", databaseAdmin.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(2200, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(3200, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canGetBonus(){
        assertEquals(22, databaseAdmin.payBonus(), 0.1);
    }

}
