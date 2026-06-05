#include<iostream>
using namespace std;

int main()
{
    int a, b;

    cout << "Enter two numbers:\n";
    cin >> a >> b;
    a = a + b;
    b = a - b;
    a = a - b;

    cout << "After swapping:\n";
    cout << "a = " << a << " b = " << b;
}