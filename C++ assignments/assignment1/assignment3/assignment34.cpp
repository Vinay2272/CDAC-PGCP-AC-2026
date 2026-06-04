#include<iostream>
using namespace std;

int main(){

    int arr[5];
    int i;
    cout<<"enter array elements :\n";
   
    for(i=0;i<5;i++){
        cin>>arr[i];
    }
    cout<<"revesed array :";
    for(i=4;i>=0;i--){
        cout<<arr[i];
    }
}