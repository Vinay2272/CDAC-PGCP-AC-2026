package question13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

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

