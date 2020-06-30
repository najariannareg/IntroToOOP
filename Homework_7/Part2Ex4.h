
#ifndef UNTITLED_PART2EXERCISE4_H
#define UNTITLED_PART2EXERCISE4_H

class Polynomial{
private:
    int n;
    int* coeff;

public:
    Polynomial();
    Polynomial(int number);
    Polynomial(Polynomial& other);
    ~Polynomial();
    void initiate();
    double calculateValue(int x);

    int getN();
    int getCoeff(int index);
    void setN(int number);
    void setCoeff(int index, int number);

    Polynomial operator+(Polynomial other);
    Polynomial operator-(Polynomial other);
    Polynomial operator*(Polynomial other);
    void operator=(Polynomial other);
    void operator+=(Polynomial other);
    void operator-=(Polynomial other);
    void operator*=(Polynomial other);
};


#endif //UNTITLED_PART2EXERCISE4_H
