package question11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
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

    public String toCSV() {
        return studid + "," + name + "," + degree + "," + email;
    }

    @Override
    public String toString() {
        return studid + " " + name + " " + degree + " " + email;
    }
}

