#include<iostream>
using namespace std;

class SortArray
{
    int arr[10];   

public:


    void input()
    {
        cout << "Enter 10 elements:\n";
        for(int i = 0; i < 10; i++)
        {
            cin >> arr[i];
        }
    }


    void sortArray()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = i + 1; j < 10; j++)
            {
                if(arr[i] > arr[j])
                {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    
    void display()
    {
        cout << "Sorted Array:\n";
        for(int i = 0; i < 10; i++)
        {
            cout << arr[i] << " ";
        }
    }
};

int main()
{
    SortArray obj;

    obj.input();        
    obj.sortArray();
    obj.display();      

    return 0;
}