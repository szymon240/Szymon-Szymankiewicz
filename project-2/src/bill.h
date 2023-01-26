#ifndef SYSTEM_FOR_RESTAURANT_ORDERS_BILL_H
#define SYSTEM_FOR_RESTAURANT_ORDERS_BILL_H
#include <iostream>
#include <string>
#include <vector>
#include <ctime>

class Bill {
public:
    std::string method;
    std::vector<std::string> order;
    std::string name;
    float sum;
    Bill();

};

class Balance {
public:
    std::string method;
    float balance;
    Balance(std::string b, float c);
};

void closeBill(std::vector<Bill> & bills, Balance& card, Balance& cash);
void checkBill(std::vector<Bill> & bills);
void checkBalance(Balance& card, Balance& cash);
void showTime();

int choseTable(std::vector<Bill> & bills);

#endif
