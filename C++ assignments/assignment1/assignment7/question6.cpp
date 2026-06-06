#include<iostream>
#include<vector>
using namespace std;


class Item
{
public:
    int itemId;
    string itemName;
    float price;

    void input()
    {
        cout << "Enter Item ID: ";
        cin >> itemId;

        cout << "Enter Item Name: ";
        cin >> itemName;

        cout << "Enter Price: ";
        cin >> price;

        
        if(price < 0)
        {
            throw price;
        }
    }

    void display()
    {
        cout << "ID: " << itemId 
             << " Name: " << itemName 
             << " Price: " << price << endl;
    }
};

int main()
{
    vector<Item> cart;
    int choice;

    do
    {
        cout << "\n--- Shopping Cart Menu ---\n";
        cout << "1. Add Item\n";
        cout << "2. Display Items\n";
        cout << "3. Calculate Total Bill\n";
        cout << "4. Exit\n";
        cout << "Enter choice: ";
        cin >> choice;

        switch(choice)
        {
            case 1:
            {
                Item obj;
                try
                {
                    obj.input();
                    cart.push_back(obj);   
                    cout << "Item added!\n";
                }
                catch(float p)
                {
                    cout << "Error: Invalid price (" << p << ")\n";
                }
                break;
            }

            case 2:
            {
                if(cart.empty())
                {
                    cout << "Cart is empty!\n";
                }
                else
                {
                    for(auto x : cart)
                    {
                        x.display();
                    }
                }
                break;
            }

            case 3:
            {
                float total = 0;
                for(auto x : cart)
                {
                    total += x.price;
                }
                cout << "Total Bill = " << total << endl;
                break;
            }

            case 4:
                cout << "Exiting...\n";
                break;

            default:
                cout << "Invalid choice!\n";
        }

    } while(choice != 4);

    return 0;
}