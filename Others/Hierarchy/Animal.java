package com.company;

public abstract class Animal{
    String motherlandl;
    double weight;
    double height;
    String food;
    public Animal( double weight, double height, String food){
        weight = this.weight;
        height= this.height;
        food = this.food;
    }

    abstract void feed();
    
}