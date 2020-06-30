
#include <cmath>
#include <iostream>
#include "Part2Ex4.h"

using namespace std;

//exercise1
void ex1(){
    int n;
    cout << "n" << endl;
    cin >> n;
    int* arr = new int[n + 1];
    cout << "coefficients" << endl;
    for(int i = 0; i <= n; ++i){
        cin >> arr[i];
    }
    int x;
    cout << "x" << endl;
    cin >> x;
    double value = 0;
    for(int i = 0; i <= n; ++i){
        value += arr[i] * pow(x, i);
    }
    cout << value << endl;
}


//exercise2
int calculateFare(int price, int distance, int tip = 0){
    return price * distance + tip;
}

void ex2(){
    int info[3][2];
    cout << "price, tip" << endl;
    for(int i = 0; i < 3; ++i){
        cin >> info[i][0];
        cin >> info[i][1];
    }
    int distance;
    cout << "distance" << endl;
    cin >> distance;
    int offer[3];
    for(int i = 0; i < 3; ++i){
        offer[i] = calculateFare(info[i][0], distance, info[i][1]);
    }
    int min = offer[0];
    int index = 1;
    for(int i = 1; i < 3; ++i){
        if(min > offer[i]){
            min = offer[i];
            index = i + 1;
        }
    }
    cout << min << " " << index << endl;
}



int main(){

    //ex1();
    //ex2();

    //ex5
    Polynomial p1(3);
    p1.initiate();
    p1.calculateValue(2);

//    Polynomial p1(2);
//    Polynomial p2(2);
//    Polynomial p3(2);
//    p1.initiate();
//    p2.initiate();
//    p1 += p2;
//    p1.calculateValue(2);

    return 0;
}

