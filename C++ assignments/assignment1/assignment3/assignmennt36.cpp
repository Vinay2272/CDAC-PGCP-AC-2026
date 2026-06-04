#include<iostream>
using namespace std;

void area(int side){
    cout<<side*side;
}

void area(int length,int breadth){
    cout<<"\n"<<length*breadth;
}
int main(){
    area(10);
    area(20,30);
}