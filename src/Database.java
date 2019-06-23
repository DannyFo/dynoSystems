import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, Employee> mapBase = new HashMap<>();

    protected void save(Employee employee) {
        mapBase.put(employee.getName(), employee);
    }

    public Employee get(String nameToGet, String employeeName) {
        if (mapBase.get(nameToGet).getCompany().equals(mapBase.get(employeeName).getCompany())) {
            return mapBase.get(nameToGet);
        }
        throw new RuntimeException("Forbidden");
    }
}
