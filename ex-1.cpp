#include <iostream>
#include <string>

class Thermometer {
public:
    float scale;
    int min;
    int max;
    std::string unit;
    Thermometer(float x, int y, int z, std::string a);
    Thermometer(int y, int z, std::string a);
    Thermometer(int z, std::string a);
    Thermometer(std::string a);
    Thermometer();
};

Thermometer::Thermometer(int y, int z, std::string a)
{
    min = y;
    max = z;
    unit = a;

    std::cout << "This thermometer measures temperature in " << unit << " and accuracy is unknown" << std::endl;

}

Thermometer::Thermometer(float x, int y, int z, std::string a)
{
    scale = x;
    min = y;
    max = z;
    unit = a;

    std::cout << "This thermometer measures temperature in " << unit << " with accuracy to " << scale << std::endl;
}

Thermometer::Thermometer(int z, std::string a)
{
    max = z;
    unit = a;

    std::cout << "This thermometer measures temperature in " << unit << ", but only maximum temperature is known" << std::endl;
}

Thermometer::Thermometer(std::string a)
{
    unit = a;

    std::cout << "This thermometer measures temperature in " << unit << std::endl;
}

Thermometer::Thermometer(){}

int main() {
    Thermometer thermometer1(0.1, -10, 40, "Celsius");
    Thermometer thermometer2(-10, 40, "Celsius");
    Thermometer thermometer3(40, "Celsius");
    Thermometer thermometer4("Celsius");
    Thermometer thermometer5();
    return 0;
}
