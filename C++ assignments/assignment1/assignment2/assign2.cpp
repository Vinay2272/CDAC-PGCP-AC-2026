#include<iostream>
using namespace std;

class Employee
{
    int emplID,salary;
    string name;
    static int totalEmployees;
    static string companyName;
    
    public:
    
    Employee(int emp,string n,int sal)
    {
        
        emplID=emp;
        name=n;
        salary=sal;
    
        totalEmployees++;
    }

    void displays(){
        cout<<"EmployeeID :"<<emplID<<"\nname :"<<name<<"\nsalary :"<<salary<<"\tcompany name :"<<companyName<<endl;
    }

    static void totalemp(){
        cout<<"\ntotal number of employess are :"<<totalEmployees;
    }
    


};
string Employee::companyName="ABC";
int Employee::totalEmployees=0;

int main(){
    Employee e1(1,"Rohit",1000);
    e1.displays();
    Employee e2(2,"Omkar",2000);
    e2.displays();
    Employee e3(3,"Nishad",3000);
    e3.displays();
    Employee e4(4,"shri",4000);
    e4.displays();
    Employee e5(5,"gaurav",5000);
    e5.displays();

    Employee::totalemp();
}