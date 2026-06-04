#include<iostream>
using namespace std;

int main()
{
    int arr[]={3,5,6,3,2};
    
    int temp=0;
    for(int i=0;i<5;i++){
        
      if (arr[i]>temp){
        temp=arr[i];
    }
   
    
    }
    cout<<"largest element in array :"<<temp;
}