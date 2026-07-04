package Question4;

import java.util.HashSet;

public class TestEmployeeHashSet {
    public static void main(String[] args) {
        HashSet<EmployeeClass> set = new HashSet<>();

        set.add(new EmployeeClass(1, "Vinay", 50000, "IT", "Dev"));
        set.add(new EmployeeClass(2, "Amit", 60000, "HR", "Manager"));
        set.add(new EmployeeClass(1, "Rahul", 70000, "IT", "Lead")); // Duplicate ID

        for (EmployeeClass e : set) {
            System.out.println(e);
        }
    }
}
