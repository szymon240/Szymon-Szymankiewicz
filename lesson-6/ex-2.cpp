#include <iostream>
#include <cmath>

class Number{};

class Logarithm : public Number{
private:
    double base, argument;
public:
    double doubleValue() { return log(this->argument) / log(this->base);}
    Logarithm(double inputBase, double inputArgument) {
            if (inputBase < 0) throw "Wrong base! Base must be higher than 0.";
            if (inputBase == 1) throw "Wrong base! Base can't be equal to 1.";
            if (inputArgument < 0) throw "Wrong argument! Argument must be higher than 0.";
            this->base = inputBase;
            this->argument = inputArgument;
            std::cout<<inputBase<<" "<<inputArgument<<"\n";
    }
};


int main() {
    try {
        Logarithm a(2,3);
        Logarithm b(-3,4);
        Logarithm c(1,5);
        Logarithm d(3,-5);
    }
    catch(char const* e){
        std::cout<<e<<std::endl;
    }
    return 0;
}
