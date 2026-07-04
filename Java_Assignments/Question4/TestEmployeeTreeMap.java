package Question4;

import java.util.TreeMap;

public class TestEmployeeTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, EmployeeClass> map = new TreeMap<>();

        map.put(3, new EmployeeClass(3, "Ravi", 55000, "Sales", "Exec"));
        map.put(1, new EmployeeClass(1, "Vinay", 50000, "IT", "Dev"));
        map.put(2, new EmployeeClass(2, "Amit", 60000, "HR", "Manager"));

        for (EmployeeClass e : map.values()) {
            System.out.println(e);
        }
    }
}
