package com.company;
import java.util.*;
public class Main{
    public static void main(String[] args){

     List<Boxoqox> list = new ArrayList<>();
     list.add(new AUAStudent("JHg",3.5 ));
     list.add(new RAUStudent("kjdh", 3.5));
     list.add(new Ishxan(2.3,15,"plankton",4,"Sevan"));
     listenToABoxoqox(list);


    }
    public static void listenToABoxoqox(List<Boxoqox> list){
        for(Boxoqox boxoqox : list){
            boxoqox.boxoqel();
        }
    }
 }