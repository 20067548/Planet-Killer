import java.util.*;
import java.io.*;

class Main
 {
  public static void main(String[] args) 
  {
    DeathStar d1 = new DeathStar("Earth", 60, 30, true); 
    DeathStar d2 = new DeathStar("mars", 60, 29, false); 

    System.out.println(d1.getName());   //Testing accessor mothod.

    System.out.println(d1.equals(d2));    //Testing equals method.

    String newName = "NA";
    d1.setPlanetName(newName);        //Calling a mutator method.
    System.out.println(d1.getName()); //Showing that mutator worked.
    System.out.println(d1); //Printing to show the original distance before travelToPlanet() is called.
    
    d1.travelToPlanet();    //Calling method that takes you to the planet reducing distance to 0.
    System.out.println(d1); 
    System.out.println();
    
    System.out.println(d1.blowUp());    //Displaying success of the blowing up of planets.
    System.out.println(d1.equals(d2));    //Testing equals method.
  }
}

