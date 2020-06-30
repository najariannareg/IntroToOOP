
#include <iostream>
#include "Part2Ex4.h"
#include <cmath>

using namespace std;



Polynomial::Polynomial(){
    n = -1;
    coeff = new int[n + 1];
    for(int i = 0; i <= n; ++i){
        coeff[i] = 0;
    }
}

Polynomial::Polynomial(int number){
    n = number;
    coeff = new int[n + 1];
    for(int i = 0; i <= n; ++i){
        coeff[i] = 0;
    }
}

Polynomial::Polynomial(Polynomial& other){
    n = other.n;
    coeff = new int[n + 1];
    for(int i = 0; i <= n; ++i){
        coeff[i] = other.coeff[i];
    }
}

Polynomial::~Polynomial(){
    delete coeff;
}

void Polynomial::initiate(){
    cout << "coefficients" << endl;
    for(int i = 0; i <= n; ++i){
        cin >> coeff[i];
    }
}

double Polynomial::calculateValue(int x){
    double value = 0;
    for(int i = 0; i <= n; ++i){
        value += coeff[i] * pow(x, i);
    }
    cout << value << endl;
    return value;
}

int Polynomial::getN(){
    return n;
}

int Polynomial::getCoeff(int index) {
    return coeff[index];
}

void Polynomial::setN(int number){
    n = number;
}

void Polynomial::setCoeff(int index, int number){
    coeff[index] = number;
}

Polynomial Polynomial::operator+(Polynomial other) {
    Polynomial p = Polynomial(other);
    for(int i = 0; i <= n; ++i){
        p.coeff[i] += coeff[i];
    }
    return p;
}

Polynomial Polynomial::operator-(Polynomial other) {
    Polynomial p = Polynomial(other);
    for(int i = 0; i <= n; ++i){
        p.coeff[i] -= coeff[i];
    }
    return p;
}

Polynomial Polynomial::operator*(Polynomial other) {
    Polynomial p = Polynomial(n + other.n + 1);
    for(int i = 0; i <= n; ++i){
        for (int j = 0; j <= other.n; ++j)
            p.coeff[i + j] += coeff[i] * other.coeff[j];
    }
    return p;
}

void Polynomial::operator=(Polynomial other) {
    for(int i = 0; i <= n; ++i){
        coeff[i] = other.coeff[i];
    }
}

void Polynomial::operator+=(Polynomial other) {
    for(int i = 0; i <= n; ++i){
        coeff[i] += other.coeff[i];
    }
}

void Polynomial::operator-=(Polynomial other) {
    for(int i = 0; i <= n; ++i){
        coeff[i] -= other.coeff[i];
    }
}

void Polynomial::operator*=(Polynomial other) {
    int k = n;
    n = n + other.n + 1;
    coeff = new int[n];
    for(int i = 0; i <= n; ++i){
        coeff[i] = 0;
    }
    for(int i = 0; i <= k; ++i){
        for (int j = 0; j <= other.n; ++j)
            coeff[i + j] += coeff[i] * other.coeff[j];
    }
}
