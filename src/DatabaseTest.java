import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DatabaseTest {
private Database database = new Database();
private Employee requestedEmployee1 = new Employee("Franklin", "OST");
private Employee requestedEmployee2 = new Employee("Ocean", "BJC");
private Employee requestingEmployee = new Employee("Mandela", "OST");

    @Before
    public void setUp() {
        database.save(requestedEmployee1);
        database.save(requestedEmployee2);
        database.save(requestingEmployee);
    }
    @Test
    public void get() {
        Employee e1 = database.get("Franklin","Mandela");
        Assert.assertEquals(e1,requestedEmployee1);
    }
    @Test(expected = Exception.class)
    public void get1() {
        database.get("Ocean","Mandela");
    }

}