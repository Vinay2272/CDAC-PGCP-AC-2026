package Question4.StudentMap;

import java.util.Date;
import java.util.Objects;

public class Student {
    private int sid;
    private String name;
    private String degree;
    private double marks;

    public Student(int sid, String name, String degree, double marks) {
        this.sid = sid;
        this.name = name;
        this.degree = degree;
        this.marks = marks;
    }

    public String getDegree() {
        return degree;
    }

    public int getSid() {
        return sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return sid == s.sid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid);
    }

    @Override
    public String toString() {
        return sid + " " + name + " " + degree + " " + marks;
    }
}
