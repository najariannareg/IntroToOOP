
#include <iostream>
#include <cmath>
using namespace std;



//exercise1
void ex1(){
    cout << "exercise1\n";
    int n;
    cin >> n;
    int sum = 0;
    for (int k = 1; k <= n; k++) {
        if((k % 2) == 1)
            sum += k;
    }
    cout << sum << endl << endl;
}



//exercise2
void ex2(){
    cout << "exercise2\n";
    double pi = 0;
    int m = 1000;
    for(int k = 0; k < m; k++){
//        if(k % 2 == 0)
//            pi += ((double)4 / (2*k + 1));
//        else
//            pi -= ((double)4 / (2*k + 1));
        pi += pow(-1, k) * ((double)4 / (2*k + 1));
        cout << "term " << k + 1 << ": sum = " << pi << endl;
    }
    cout << endl;
}


//exercise3
void ex3() {
    int n;
    cin >> n;
    while (n < 1 || n > 19) {
        cin >> n;
    }

    for (int k = 0; k < n; k++) {
        int m = (n / 2 + 0.5);

    }
}

//    void printSymbol(int number, char symbol){
//        while(number > 0){
//            cout << symbol;
//            number--;
//        }
//    }
//
//    int numberOfSpaces(){
//
//    }
//
//    int numberOfStars(){
//
//    }
//
//    void print(){
//        cout << printSymbol(numberOfSpaces(), " ") << printSymbol(numberOfStars(), "*") << endl;
//    }



//exercise4
int tripleByValue(int count){
    count *= 3;
    return count;
}

int tripleByReference(int& count){
    count *= 3;
}

void ex4(){
    int value = 3;
    value = tripleByValue(value);
    cout << value << endl;
    int reference = 3;
    tripleByReference(reference);
    cout << reference << endl;
}



//exercise5
double single(){

}
double* whole(){

}
double average(){

}
void ex5(){
    int numWeek;
    cout << "number of weeks" << endl;
    cin >> numWeek;
    double** arr = new double*[numWeek];
    for(int i = 0; i < numWeek; ++i){
        arr[i] = new double[7];
    }
    for(int i = 0; i < numWeek; ++i){
        for(int j = 0; j < 7; ++j){
            cin >> arr[i][j];
        }
    }

}





int main() {

    //exercise1
    //ex1();
    /*The largest number for which the program would work
     is (2^32 - 1) if we use variables of type unsigned int
     and (2^31 - 1) if we use variables of type int.*/

    //exercise2
    //ex2();

    //exercise3
    //ex3();

    //exercise4
    //ex4();

    //exercise5
    ex5();

    return 0;
}

