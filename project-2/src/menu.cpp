#include "menu.h"
#include "meals.h"


bool askForDiscount()
{
    int answer;
    std::cout << "Do you want to add discount? " << std::endl;
    std::cout << "1. Yes" << std::endl;
    std::cout << "2. No" <<std::endl;
    std::cin >> answer;

    if (answer==2) return false;
    return true;
}

void nonAlcoholicDrinks()
{
    std::cout << "1. Mineral water" << std::endl;
    std::cout << "2. Sparkling water" << std::endl;
    std::cout << "3. Apple juice" << std::endl;
    std::cout << "4. Orange juice" << std::endl;
    std::cout << "5. Cola" << std::endl;
    std::cout << "6. Sprite" << std::endl;
}

void nonAlcoholicDrinksChoice(std::vector<Bill> & bills, int choice)
{
    int dish;
    std::cout << "Chose an appetizer to add" << std::endl;
    std::cin >> dish;
    switch(dish)
    {
        case 1: {
            Drink a = Drink("Mineral water", 1.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 2: {
            Drink a = Drink("Sparkling water",1.5);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 3: {
            Drink a = Drink("Apple juice",2.49);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 4: {
            Drink a = Drink("Orange juice",2.49);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 5: {
            Drink a = Drink("Cola",4.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 6: {
            Drink a = Drink("Sprite",4.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        default:
            std::cout << "Invalid menu option. Please try again" << std::endl;
    }
}

void alcoholicDrinks()
{
    std::cout << "1. Glass of red wine" << std::endl;
    std::cout << "2. Glass of white wine" << std::endl;
    std::cout << "3. Beer" << std::endl;
    std::cout << "4. Vodka shot" << std::endl;
}

void alcoholicDrinksChoice(std::vector<Bill> & bills, int choice)
{
    int dish;
    std::cout << "Chose an appetizer to add" << std::endl;
    std::cin >> dish;

    switch(dish)
    {
        case 1: {
            Drink a = Drink("Glass of red wine", 5.49);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 2: {
            Drink a = Drink("Glass of white wine",5.99);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 3: {
            Drink a = Drink("Beer",4.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 4: {
            Drink a = Drink("Vodka shot",2.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        default:
            std::cout << "Invalid menu option. Please try again" << std::endl;
    }
}

void appetizersMenu()
{
    std::cout << "1. Mozzarella sticks" << std::endl;
    std::cout << "2. Cheddar Biscuits" << std::endl;
    std::cout << "3. Mac & cheese" << std::endl;
    std::cout << "4. Onion rings" << std::endl;
}

void appetizersChoice(std::vector<Bill> & bills, int choice)
{
    int dish;
    std::cout << "Chose an appetizer to add" << std::endl;
    std::cin >> dish;

    switch(dish)
    {
        case 1: {
            Dish a = Dish("Mozzarella sticks", 3.99);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 2: {
            Dish a = Dish("Cheddar Biscuits",5.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 3: {
            Dish a = Dish("Mac & cheese",9.5);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 4: {
            Dish a = Dish("Onion rings",2.49);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        default:
            std::cout << "Invalid menu option. Please try again" << std::endl;
    }
}

void mainCoursesMenu()
{
    std::cout << "1. Fried chicken" << std::endl;
    std::cout << "2. Mashed potatoes" << std::endl;
    std::cout << "3. French fries" << std::endl;
    std::cout << "4. Spaghetti with meatballs" << std::endl;
    std::cout << "5. Lasagna" << std::endl;
    std::cout << "6. Chicken Pesto" << std::endl;
    std::cout << "7. Greek salad" << std::endl;
}

void mainCoursesChoice(std::vector<Bill> & bills, int choice)
{
    int dish;
    std::cout << "Chose a main course to add" << std::endl;
    std::cin >> dish;

    switch(dish)
    {
        case 1: {
            Dish a = Dish("Fried chicken", 12.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 2: {
            Dish a = Dish("Mashed potatoes",7.89);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 3: {
            Dish a = Dish("French fries",9.5);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 4: {
            Dish a = Dish("Spaghetti with meatballs",13.49);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 5: {
            Dish a = Dish("Lasagna",8.99);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 6: {
            Dish a = Dish("Chicken Pesto",7.49);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 7: {
            Dish a = Dish("Greek salad",10.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        default:
            std::cout << "Invalid menu option. Please try again" << std::endl;
    }
}


void pizzaMenu()
{
    std::cout << "1. Margherita" << std::endl;
    std::cout << "2. Pepperoni" << std::endl;
    std::cout << "3. Veggie" << std::endl;
    std::cout << "4. Meat lovers" << std::endl;
}

void pizzaChoice(std::vector<Bill> & bills, int choice)
{
    int dish;
    std::cout << "Chose pizza to add" << std::endl;
    std::cin >> dish;

    switch(dish)
    {
        case 1: {
            Dish a = Dish("Margherita", 5.5);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 2: {
            Dish a = Dish("Pepperoni",6.5);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 3: {
            Dish a = Dish("Veggie",7.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 4: {
            Dish a = Dish("Meat lovers",7.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        default:
            std::cout << "Invalid menu option. Please try again" << std::endl;
    }
}


void dessertsMenu()
{
    std::cout << "1. Apple pie" << std::endl;
    std::cout << "2. Cheesecake" << std::endl;
    std::cout << "3. Cinnamon rolls" << std::endl;
    std::cout << "4. Cannoli" << std::endl;
}

void dessertsChoice(std::vector<Bill> & bills, int choice)
{
    int dish;
    std::cout << "Chose a dessert to add" << std::endl;
    std::cin >> dish;

    switch(dish)
    {
        case 1: {
            Dish a = Dish("Apple pie", 5.5);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 2: {
            Dish a = Dish("Cheesecake",11.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 3: {
            Dish a = Dish("Cinnamon rolls",4.0);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        case 4: {
            Dish a = Dish("Cannoli",7.5);
            if (askForDiscount()) a.giveDiscount();
            bills[choice - 1].order.push_back(a.name);
            bills[choice - 1].sum += a.price - (a.price*(a.discount/100));
            break;
        }
        default:
            std::cout << "Invalid menu option. Please try again" << std::endl;
    }
}

void addDish(std::vector<Bill> & bills)
{
    int dish;
    int choice = choseTable(bills);
    std::cout << "Chose type of dish" << std::endl;

    std::cout << "1. Appetizers" << std::endl;
    std::cout << "2. Pizza" << std::endl;
    std::cout << "3. Main courses" << std::endl;
    std::cout << "4. Desserts" << std::endl;

    std::cin >> dish;

    std::cout << "Chose dish to add to the receipt: " << std::endl;
    switch(dish)
    {
        case 1:
            appetizersMenu();
            appetizersChoice(bills, choice);
            break;
        case 2:
            pizzaMenu();
            pizzaChoice(bills, choice);
            break;
        case 3:
            mainCoursesMenu();
            mainCoursesChoice(bills, choice);
            break;
        case 4:
            dessertsMenu();
            dessertsChoice(bills, choice);
            break;
        default:
            std::cout << "Invalid menu option. Please try again" << std::endl;
    }
}

void addDrink(std::vector<Bill> & bills)
{
    int drink;
    int choice = choseTable(bills);
    std::cout << "Chose type of drink" << std::endl;

    std::cout << "1. Non-alcoholic drinks" << std::endl;
    std::cout << "2. Alcoholic drinks " << std::endl;

    std::cin >> drink;

    std::cout << "Chose drink to add to the receipt: " << std::endl;
    switch(drink)
    {
        case 1:
            nonAlcoholicDrinks();
            nonAlcoholicDrinksChoice(bills, choice);
            break;
        case 2:
            alcoholicDrinks();
            alcoholicDrinksChoice(bills, choice);
            break;
        default:
            std::cout << "Invalid menu option. Please try again" << std::endl;
    }
}

void menu()
{
    int choice ;
    std::vector<Bill> bills;
    Balance card = Balance("card", 0.0);
    Balance cash = Balance("cash", 0.0);
    while(true) {
        std::cout << "---------------------" << std::endl;
        std::cout << "Point of Sales Menu" << std::endl;
        std::cout << "---------------------" << std::endl;

        std::cout << "1. Create bill" << std::endl;
        std::cout << "2. Add meal" << std::endl;
        std::cout << "3. Add drink" << std::endl;
        std::cout << "4. Close bill" << std::endl;
        std::cout << "5. Check bill" << std::endl;
        std::cout << "6. Balance of the day" << std::endl;
        std::cout << "7. Exit" << std::endl;

        try {
            std::cin >> choice;
            if (1 > choice || choice > 7) throw "Expected value between 1 and 7!";
        }

        catch (char const* e){
            std::cout << e << std::endl;
            continue;
        }
        switch(choice) {
            case 1:{
                Bill a;
                bills.push_back(a);
                break;}
            case 2:
                addDish(bills);
                break;
            case 3:
                addDrink(bills);
                break;
            case 4:
                closeBill(bills, card, cash);
                break;
            case 5:
                checkBill(bills);
                break;
            case 6:
                checkBalance(card, cash);
                break;
            case 7:
                exit(0);
            default:
                std::cout << "Invalid menu option. Please try again" << std::endl;
        }
    }
}