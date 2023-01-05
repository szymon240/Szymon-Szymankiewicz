#include <string>
#include <iostream>

class Game {
public:
    virtual std::string results() = 0;
};

class FootballGame : public Game {
public:
    std::string results() override {
        std::cout << "Results"<<std::endl;
    }
};

class FakeFootballGame : public Game {
public:
    std::string results() override {
        return "fake";
    }
};

int main() {
    Game* game;
    bool use_fake = true;
    if (use_fake) {
        game = new FakeFootballGame();
    } else {
        game = new FootballGame();
    }

    std::string score = game->results();
    if (score == "fake") {
        std::cout << "Fake score returned as expected" << std::endl;
    } else {
        std::cout << "Unexpected score: " << score << std::endl;
    }

    return 0;
}
