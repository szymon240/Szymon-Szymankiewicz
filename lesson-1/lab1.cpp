#include <iostream>
#include <string>

class Toy{
public:
    std::string name;
};

class Bird {
public:
    int age;
    Toy toyName;
    void introduction();
    void play();
};

void Bird::introduction(){
    std::cout<<"I'm a bird and I'm "<<  age <<" years old." <<std::endl;
}

void Bird::play(){
    std::cout<<"Bird is playing with "<<toyName.name<<std::endl;
}

int main() {
    Bird bird;
    ptak.age = 2;
    Toy toy;
    zabawka.name = "ball";
    ptak.toyName = toy;
    ptak.introduction();
    ptak.play();
    return 0;
}
