#include <iostream>

class Vehicle {
public:
    virtual void check_type()=0;
};

class Car: public Vehicle{
private:
    int m_speed;
public:
    void check_type()
    {
        std::cout<<"This vehicle is a car."<<std::endl;
    }
    Car(int x);
};

Car::Car(int x)
{
    m_speed = x;
    std::cout<<"This vehicle's max speed is "<<m_speed<<std::endl;
}

class Train: public Vehicle{
public:
    void check_type()
    {
       std::cout<<"This vehicle is a train."<<std::endl;
    }
};

int main() {

    Train b;
    Car a(100);

    a.check_type();
    b.check_type();
    return 0;
}
