#include<iostream>
using namespace std;

int main(){

    int arr[]={7,6,4,3,8,9};
    int count=0;
    int oddcount=0;
    for(int i=0;i<6;i++){
        if(arr[i]%2==0){
            count++;
        }
        else{
            oddcount++;
        }
    }
    cout<<"total even numbers in array :"<<count;
    cout<<"\ntotal odd numbers in array :"<<oddcount;


}