package com.company;

public class Ishxan extends Fish implements Boxoqox{

   String motherland;
   public Ishxan(double weight, double height, String food, int xrikner, String motherland){
       super(weight, height, food, xrikner);
       motherland = this.motherland;
   }
    public void feed(){
        System.out.println("You must feed the fish otherwise it will die.");

    }
    public void infoAboutTheFish(){
        System.out.println("Our fish is still avlive and is from the  " + this.motherland);

    }
    @Override
    public void boxoqel(){
        System.out.println("Es kyanqa vor es Sevanum em enq aprum");
    }

    
}