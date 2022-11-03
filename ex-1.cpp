#include <iostream>
#include <string>

class Movie
{
private:
    int watched;
    std::string producer;
    int year;
    std::string title;
public:
    void popularity();
    void watch();
    Movie(std::string a, int b, std::string c, int d);

};

void Movie::popularity()
{
    std::cout << "This movie was watched "<<watched<<" times" <<std::endl;
}

void Movie::watch()
{
    watched++;
}

Movie::Movie(std::string a, int b, std::string c, int d)
{
    watched = b;
    producer = c;
    title = a;
    year = d;
}

int main() {
    Movie movie("Film", 0, "Kowalski",2020);

    movie.popularity();
    movie.watch();
    movie.popularity();

    return 0;
}
