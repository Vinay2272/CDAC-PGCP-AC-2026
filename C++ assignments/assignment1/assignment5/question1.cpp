#include<iostream>
using namespace std;

class Analyzer
{
    int *arr;
    int n;

public:
    
    Analyzer(int size)
    {
        n = size;
        arr = new int[n]; 
    }

    
    void input()
    {
        cout << "Enter " << n << " elements:\n";
        for(int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
    }

    
    void findMax()
    {
        int max = arr[0];
        for(int i = 1; i < n; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        cout << "Maximum = " << max << endl;
    }
        
    void findMin()
    {
        int min = arr[0];
        for(int i = 1; i < n; i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        cout << "Minimum = " << min << endl;
    }

    void findAverage()
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        cout << "Average = " << (float)sum / n << endl;
    }

    ~Analyzer()
    {
        delete[] arr; 
    }
};

int main()
{
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    Analyzer obj(n);

    obj.input();
    obj.findMax();
    obj.findMin();
    obj.findAverage();
}