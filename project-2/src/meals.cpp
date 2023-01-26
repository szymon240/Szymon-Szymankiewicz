#include "meals.h"

#include <utility>


Dish::Dish(std::string a, float b)
{
    name = std::move(a);
    price = b;
    discount = 0.0;

    std::cout << name << " has been added" << std::endl;
}

Drink::Drink(std::string a, float b)
{
    name = std::move(a);
    price = b;
    discount = 0.0;

    std::cout << name << " has been added" << std::endl;
}

void Dish::giveDiscount() {
    std::cout << "Enter percentage of discount: " << std::endl;
    int temp;
    do {
        try {
            std::cin >> temp;
            if (0 > temp || temp > 100) throw "Expected value between 1 and 100!\nEnter correct value: ";
        }catch (char const *e) {
            this-> discount = 0;
            std::cout << e;
            //return;
        }
        if(0 <= temp && temp <= 100){
            this->discount = temp;
            return;
        }
    } while(0 > temp || temp > 100);
    //this->discount = temp;
}

void Drink::giveDiscount() {
    std::cout << "Enter percentage of discount: " << std::endl;
    int temp;
    do {
        try {
            std::cin >> temp;
            if (0 > temp || temp > 100) throw "Expected value between 1 and 100!";
        }catch (char const *e) {
            this-> discount = 0;
            std::cout << e << std::endl;
            //return;
        }
        if(0 <= temp && temp <= 100){
            this->discount = temp;
            return;
        }
    } while(0 > temp || temp > 100);
    //this->discount = temp;
}