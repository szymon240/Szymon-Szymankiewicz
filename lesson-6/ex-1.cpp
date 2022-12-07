#include <iostream>

class Number {
private:
    int a;
    int b;
public:
    Number(int x, int y);

    int max() {
        return a > b ? a : b;
    }

    int min() {
        return a < b ? a : b;
    }

    float avg() {
        return (a+b)/2.0;
    }
};

Number::Number(int x, int y) {
    a = x;
    b = y;
};

int main() {
    Number number(1, 3);
    int a = number.max();
    int b = number.min();
    float c = number.avg();
    std::cout<<"Max: "<<a<<" Min: "<<b<<" Avg "<<c<<std::endl;
    return 0;
}
