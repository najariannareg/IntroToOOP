
#ifndef UNTITLED_PART2EX3_H
#define UNTITLED_PART2EX3_H


struct Circle{
    double radius;
    double circumference;
    double area;

    Circle();
    Circle(double r);
    Circle(Circle& other);

    double getRadius();
    double getCircumference();
    double getArea();
    void serRadius(double r);
    void serCircumference(double c);
    void serArea(double a);

    double calculateCircumference();
    double calculateArea();

};



#endif //UNTITLED_PART2EX3_H
