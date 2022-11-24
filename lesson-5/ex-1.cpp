#include <iostream>
#include <map>
#include <sstream>
#include <iomanip>

class FakeCantor {
private:
    std::map<std::string, float> rates{{"USD", 1.0366f},
                                       {"GBP", 0.87063f},
                                       {"CHF", 0.9881f},
                                       {"JPY", 145.12f}};
public:
    FakeCantor() = default;
    float EuroToRate(const std::string &currency) {
        return rates[currency];
    };
};

class Currency {
public:
    virtual Currency *AddedCurrency(float value, std::string currency) = 0;
    virtual Currency *SubtractedCurrency(float value, std::string currency) = 0;
    virtual std::string Abbreviation() = 0;
    virtual std::string Symbol() = 0;
    virtual std::string Balance() = 0;
    virtual float DollarExchangeRate() = 0;
};

class Euro : public Currency {
    Currency * AddedCurrency(float value, std::string currency) {
        float newBalance = balance + value;
        return new Euro(newBalance);
    }

    Currency * SubtractedCurrency(float value, std::string currency) {
        float newBalance = balance + value;
        return new Euro(newBalance);
    }

    std::string Abbreviation() {
        std::cout << "EU" << std::endl;
    }

    std::string Symbol() {
        std::cout << "€" << std::endl;
    }

    std::string Balance() {
        return balance;
    }

    float balance;
    Euro(float x);
};

Euro::Euro(float x) {
    balance = x;
}

int main() {
    // TODO: showcase usage
    return 0;
}
