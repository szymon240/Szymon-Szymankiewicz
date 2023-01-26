#ifndef SYSTEM_FOR_RESTAURANT_ORDERS_MEALS_H
#define SYSTEM_FOR_RESTAURANT_ORDERS_MEALS_H
#include <iostream>
#include <string>
#include <vector>

class Product {
public:
    std::string name;
    float price;
    float discount;
    virtual void giveDiscount() = 0;
};

class Dish : public Product {
public:
    Dish(std::string a, float b);
    void giveDiscount();
};


class Drink : public Product {
public:
    Drink(std::string a, float b);
    void giveDiscount();
};


#endif
