package com.company;

public abstract class Fish extends Animal{
    int color;
    public Fish( double weight, double height, String food, int color){
        super( weight, height, food);
        this.color = color;
    }
    
}