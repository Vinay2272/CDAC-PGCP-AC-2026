#include<iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    int arr[n];   // simple array
    cout << "Enter elements:\n";

    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // Step 1: Find largest
    int largest = arr[0];
    for(int i = 1; i < n; i++)
    {
        if(arr[i] > largest)
        {
            largest = arr[i];
        }
    }

    // Step 2: Find second largest
    int second = -1;   // assume no second largest

    for(int i = 0; i < n; i++)
    {
        if(arr[i] > second && arr[i] < largest)
        {
            second = arr[i];
        }
    }

    cout << "Second Largest = " << second;

    return 0;
}