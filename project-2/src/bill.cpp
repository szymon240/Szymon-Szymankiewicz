#include "bill.h"

Bill::Bill()
{
    std::string n;
    std::cout << "Insert name for the bill: "<<std::endl;
    std::cin >> name;

    std::cout <<"Bill "<< name << " has been created" << std::endl;
}


Balance::Balance(std::string b, float c)
{
    method = b;
    balance = c;
}

void closeBill(std::vector<Bill> & bills, Balance& card, Balance& cash)
{
    int payment;
    int choice = choseTable(bills);
    std::cout << "Chose payment method" << std::endl;
    std::cout << "1. Card" << std::endl;
    std::cout << "2. Cash" << std::endl;

    try {
        std::cin >> payment;
        if (1 > payment || payment > 2) throw "Expected value between 1 and 2!";
    }

    catch (char const* e){
        std::cout << e << std::endl;
    }
    switch (payment) {
        case 1:{
            bills[choice - 1].method = "Card";
            card.balance += bills[choice - 1].sum;
        }
        case 2: {
            bills[choice - 1].method = "Cash";
            cash.balance += bills[choice - 1].sum;
        }
    }

    std::cout << "Name: " << bills[choice-1].name << std::endl;
    std::cout << "Payment: " << bills[choice-1].method << std::endl;
    std::cout << "Sum: " << bills[choice-1].sum << std::endl;

    std::cout <<"Bill " << bills[choice-1].name << " has been closed" << std::endl;
    bills.erase(bills.begin()+choice-1);
}

int choseTable(std::vector<Bill> & bills) {
    std::cout << "Chose a table" << std::endl;
    for (int i = 0; i < bills.size(); ++i) {
        std::cout << i + 1 << ". " << bills[i].name << std::endl;
    }

    int choice;
    std::cin >> choice;
    return choice;
}

void checkBill(std::vector<Bill> & bills)
{
    int table;
    table = choseTable(bills);

    std::cout << "---------------------" << std::endl;
    std::cout << "Bill balance" << std::endl;
    std::cout << "---------------------" << std::endl;
    std::cout << "Name: " << bills[table-1].name << std::endl;
    std::cout << "Sum: " << bills[table-1].sum << std::endl;
    std::cout << "Order: \n";
    for (auto & i : bills[table-1].order) {
        std::cout <<"- " << i << std::endl;
    }
}

void showTime()
{
    time_t raw_time;
    time(&raw_time);
    tm* time_info = localtime(&raw_time);

    char time_str[9];
    strftime(time_str, sizeof(time_str), "%H:%M:%S", time_info);

    std::cout << "Actual time: " << time_str << std::endl;
}

void checkBalance(Balance& card, Balance& cash)
{
    std::cout << "---------------------" << std::endl;
    std::cout << "Balance of the day" << std::endl;
    showTime();
    std::cout << "---------------------" << std::endl;
    std::cout << "Method: " << card.method << std::endl;
    std::cout << "Balance: " << card.balance << std::endl;
    std::cout << "---------------------" << std::endl;
    std::cout << "Method: " << cash.method << std::endl;
    std::cout << "Balance: " << cash.balance << std::endl;
}