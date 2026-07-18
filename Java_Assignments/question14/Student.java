package question14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

class Student implements Serializable {
    private int studid;
    private String name;
    private String degree;
    private String email;

    public Student(int studid, String name, String degree, String email) {
        this.studid = studid;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    @Override
    public String toString() {
        return studid + " " + name + " " + degree + " " + email;
    }
}

