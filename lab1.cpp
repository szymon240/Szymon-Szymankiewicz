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
    std::cout<<"jestem ptak i mam wiek: "<<  age <<std::endl;
}

void Bird::play(){
    std::cout<<"Ptak bawi się z "<<toyName.name<<std::endl;
}

int main() {
    Bird ptak;
    ptak.age = 2;
    Toy zabawka;
    zabawka.name = "pilka";
    ptak.toyName = zabawka;
    ptak.introduction();
    ptak.play();
    return 0;
}
