package com.company;

public class Zoo{
    Animal[] animals = new Animal[5];
    public Zoo(){
        animals[0] = new Ishxan(5, 4, "food", 6, "Sevan");
        animals[1] = new Ishxan(5, 4, "food", 6, "Sevan");
        animals[2] = new Ishxan(5, 4, "food", 6, "Sevan");
        animals[3] = new Ishxan(5, 4, "food", 6, "Sevan");
        animals[4] = new Ishxan(5, 4, "food", 6, "Sevan");

    }
    public void foodAll(){
        for(int i = 0; i< animals.length; i++){
            animals[i].feed();
        }
    }
    
}