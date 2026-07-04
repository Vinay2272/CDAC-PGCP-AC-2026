package Question4;

import java.util.Objects;

public class EmployeeClass {
    private int id;
    private String name;
    private double sal;
    private String dept;
    private String designation;

    public EmployeeClass(int id, String name, double sal, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EmployeeClass)) return false;
        EmployeeClass e = (EmployeeClass) obj;
        return this.id == e.id;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sal + " " + dept + " " + designation;
    }
}
