#include <iostream>
#include <cmath>

class Number{};

class Logarithm : public Number{
private:
    double base, argument;
public:
    double doubleValue() { return log(this->argument) / log(this->base);}
    Logarithm(double inputBase, double inputArgument) {
        try {
            if (inputBase < 0) throw 1;
            if (inputBase == 1) throw 2;
            if (inputArgument < 0) throw 3;
            this->base = inputBase;
            this->argument = inputArgument;
            std::cout<<inputBase<<" "<<inputArgument<<"\n";

        }
        catch (int a) {
            if (a == 1) {std::cout<<"Wrong base! Base must be higher than 0."<<std::endl;}
            if (a == 2) {std::cout<<"Wrong base! Base can't be equal to 1."<<std::endl;}
            if (a == 3) {std::cout<<"Wrong argument! Argument must be higher than 0."<<std::endl;}

        }
    }
};


int main() {
    std::cout << "Hello, World!" << std::endl;
    Logarithm a(2,3);
    Logarithm b(-3,4);
    Logarithm c(1,5);
    Logarithm d(3,-5);
    return 0;
}
