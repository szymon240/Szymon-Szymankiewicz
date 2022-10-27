#include <iostream>
#include <string>

class Shovel
{
public:
    std::string source;
    int length;
    int usage;
    Shovel(std::string x, int y, int z);
    void actualUsage();
    void dig();
    void repair();
};

Shovel::Shovel(std::string x, int y, int z)
{
    source = x;
    length = y;
    usage = z;
}

void Shovel::actualUsage()
{
    std::cout << "This shovel can dig "<<usage<<" more times"<<std::endl;
}

void Shovel::dig()
{
        usage--;
}

void Shovel::repair()
{
    usage+= 5;
    std::cout<<"This shovel has been fixed"<<std::endl;
}

int main() {
    Shovel shovel("wooden", 2, 10);
    Shovel shovel1("diamond", 2, 30);

    shovel1.actualUsage();
    shovel1.dig();
    shovel1.actualUsage();

    shovel.actualUsage();
    shovel.dig();
    shovel.repair();
    shovel.actualUsage();
    return 0;
}
