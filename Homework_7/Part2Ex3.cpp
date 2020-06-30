
#include <iostream>
#include <cmath>
#include "Part2Ex3.h"

using namespace std;

Circle::Circle(){
    radius = 0;
    circumference = 0;
    area = 0;
}
Circle::Circle(double r){
    radius = r;
    circumference = 0;
    area = 0;
}
Circle::Circle(Circle& other){
    radius = other.radius;
    circumference = other.circumference;
    area = other.area;
}

double Circle::getRadius(){
    return radius;
}
double Circle::getCircumference(){
    return circumference;
}
double Circle::getArea(){
    return area;
}
void Circle::serRadius(double r){
    radius = r;
}
void Circle::serCircumference(double c){
    circumference = c;
}
void Circle::serArea(double a){
    area = a;
}

double Circle::calculateCircumference(){
    circumference = 2 * M_PI * radius;
}
double Circle::calculateArea(){
    area = M_PI * pow(radius, 2);
}
