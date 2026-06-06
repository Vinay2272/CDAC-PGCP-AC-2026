#include<iostream>
#include<map>
#include<fstream>
using namespace std;

class StudentRecord
{
    map<int, string> student;

public:

    // 1. Add Record
    void addRecord()
    {
        int roll;
        string name;

        cout << "Enter Roll Number: ";
        cin >> roll;
        cout << "Enter Name: ";
        cin >> name;

        student[roll] = name;
        cout << "Record Added!\n";
    }

    // 2. Display Records
    void displayRecords()
    {
        if(student.empty())
        {
            cout << "No records found!\n";
            return;
        }

        cout << "\nStudent Records:\n";
        for(auto x : student)
        {
            cout << "Roll No: " << x.first 
                 << " Name: " << x.second << endl;
        }
    }

    // 3. Save to File
    void saveToFile()
    {
        ofstream file("students.txt");

        for(auto x : student)
        {
            file << x.first << " " << x.second << endl;
        }

        file.close();
        cout << "Records saved to file!\n";
    }
};

int main()
{
    StudentRecord obj;
    int choice;

    do
    {
        cout << "\n--- Student Record System ---\n";
        cout << "1. Add Record\n";
        cout << "2. Display Records\n";
        cout << "3. Save to File\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice)
        {
            case 1:
                obj.addRecord();
                break;

            case 2:
                obj.displayRecords();
                break;

            case 3:
                obj.saveToFile();
                break;

            case 4:
                cout << "Exiting program...\n";
                break;

            default:
                cout << "Invalid choice!\n";
        }

    } while(choice != 4);

    return 0;
}