#include<iostream>
using namespace std;

class Books{
    int bookId;
    string title;
    string author;
    int price;
    public:
    void input();
    void display();
};

void Books :: input(){
    cout<<"Enter Book details :\n"<<endl;

    cout<<"enter book-Id :";
    cin>>bookId;

    cout<<"\nenter book title :";
    cin>>title;

    cout<<"\nenter author :";
    cin>>author;

    cout<<"\nenter books price :";
    cin>>price;
}

void Books :: display(){
    cout<<"\nBook-Id :"<<bookId<<endl;
    cout<<"Book Title :"<<title<<endl;
    cout<<"Book author :"<<author<<endl;
    cout<<"Book Price :"<<price<<endl;
}

int main(){
    Books obj[4];

    cout<<"enter details of four Books:"<<endl;

    for(int i=0; i<4; i++){
        obj[i].input();
    }

    cout<<"\nshow book details :"<<endl;
    for(int i=0; i<4; i++){
        obj[i].display();
    }

}