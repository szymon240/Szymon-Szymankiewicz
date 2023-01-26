#ifndef SYSTEM_FOR_RESTAURANT_ORDERS_MENU_H
#define SYSTEM_FOR_RESTAURANT_ORDERS_MENU_H
#include "bill.h"
#include "meals.h"

void addDish(std::vector<Bill> & bills);
void addDrink(std::vector<Bill> & bills);
void alcoholicDrinksChoice(std::vector<Bill> & bills, int choice);
void alcoholicDrinks();
void appetizersChoice(std::vector<Bill> & bills, int choice);
void appetizersMenu();
void dessertsChoice(std::vector<Bill> & bills, int choice);
void dessertsMenu();
void mainCoursesChoice(std::vector<Bill> & bills, int choice);
void mainCoursesMenu();
void nonAlcoholicDrinksChoice(std::vector<Bill> & bills, int choice);
void nonAlcoholicDrinks();
void pizzaChoice(std::vector<Bill> & bills, int choice);
void pizzaMenu();
void menu();


#endif //SYSTEM_FOR_RESTAURANT_ORDERS_MENU_H
