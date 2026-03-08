 /*Write a student class and use it in your program. Store the data of 10 students and
  display the data according to their roll numbers, dates of birth, and total marks.

Implement concepts such as : 
-Classes and Objects
-Constructors
-Parameterized constructors*/



#include <iostream>
using namespace std;

class Studentdata {
private:
    int rollNo;
    string name;
    string dob;     
    float totalMarks;

public:
    
    Studentdata() 
    {
        rollNo = 0;
        name = "";
        dob = "";
        totalMarks = 0.0;
    }

    
    Studentdata(int r, string n, string d, float m) 
    {
        rollNo = r;
        name = n;
        dob = d;
        totalMarks = m;
    }

   
    void display() const 
    {
        cout << "Roll No: " << rollNo<< ", Name: " << name<< ", DOB: " << dob<< ", Total Marks: " << totalMarks << endl;
    }

    
    int getRollNo() const
    { 
        return rollNo;
    }
    string getDOB() const 
    { 
        return dob;
    }
    float getMarks() const 
    { 
        return totalMarks; 
    }
};

int main() {

    
    Studentdata students[10] = {
        Studentdata(5, "Aman", "2005-04-12", 450),
        Studentdata(2, "Riya", "2004-09-21", 480),
        Studentdata(8, "Karan", "2005-01-15", 430),
        Studentdata(1, "Neha", "2004-12-01", 490),
        Studentdata(6, "Rahul", "2005-06-30", 410),
        Studentdata(3, "Simran", "2004-03-18", 470),
        Studentdata(9, "Arjun", "2005-08-22", 420),
        Studentdata(4, "Priya", "2004-11-10", 460),
        Studentdata(7, "Vikas", "2005-02-05", 440),
        Studentdata(10, "Meera", "2004-07-14", 495)
    };

    cout << "\nstudent data\n";
    for (int i = 0; i < 10; i++){
        students[i].display();
    }   
}   