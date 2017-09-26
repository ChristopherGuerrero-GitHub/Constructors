package com.example.java;

import com.example.java.Model.Olive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
            This program uses an ArrayList and adds to it created objects of Olive class. The objective of this
            program was to use constructors of a class to create objects and pass arguments to the constructor. There
            are two classes one being Olive class which has a parameter constructor,  setter/getters for the instant
            members such as name, color, and oil. The other class OlivePress will print the name and then call a crush
            method that will return the value of oil of the Olive class object.
         */

        List<Olive> olives = new ArrayList<>();

//        Olive olive1 = new Olive();  //Default constructor not needed since we have passing argument constructor in class
//        Olive olive1 = new Olive("Kalamata",0x2E0854, 3);  //invoke the constructor to creat the object
//        olives.add(olive1);                                //add the object to the Array List

//        The one line code below does the same process as the two code lines above the
        olives.add(new Olive("Kalamata",0x2E0854, 3)); //constructor create the object and add to ArrayList

//        Olive olive2 = new Olive();  //Default constructor not needed since we have passing argument constructor in class
//        Olive olive2 = new Olive("Kalamata",0x2E0854, 3);  //invoke the constructor to creat the object
//        olive2.setOil(1);            // No longer need this line of code for setter since we are using constructor method
//        olives.add(olive2);

//        The one line code below does the same process as the two code lines above to create object with constr. and add to list
        olives.add(new Olive("Kalamata",0x2E0854, 3)); //constructor create the object and add to ArrayList

//        Olive olive3 = new Olive();   //Default constructor not needed since we have passing argument constructor in class
//        Olive olive3 = new Olive("Ligurian",0x000000, 2);  //invoke the constructor to creat the object
//        olive3.setOil(4);
//        olives.add(olive3);                                //add the object to Array List

//        The one line code below does the same process as the two code lines above to create object with constr. and add to list
        olives.add(new Olive("Ligurian",0x000000, 2)); //constructor create the object and add to ArrayList

        OlivePress press = new OlivePress();
//        press.getOil(olives);
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil is: " + totalOil);



    }
}
