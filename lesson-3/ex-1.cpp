#include <iostream>
#include <string>

class Title
{
public:
    std::string polish;
    std::string english;
};

class Movie
{
private:
    int watched;
    std::string producer;
    int year;

public:
    Title title;
    void popularity();
    void watch();
    Movie(std::string a, std::string a2, int b, std::string c, int d);

};

void Movie::popularity()
{
    std::cout << "This movie was watched "<<watched<<" times" <<std::endl;
}

void Movie::watch()
{
    watched++;
}

Movie::Movie(std::string a,std::string a2, int b, std::string c, int d)
{
    watched = b;
    producer = c;
    title.english = a2;
    title.polish = a;
    year = d;
}

int main() {
    Movie movie("Film","Movie", 0, "Kowalski",2020);

    movie.popularity();
    movie.watch();
    movie.popularity();
    std::cout << movie.title.polish <<std::endl;

    return 0;
}
