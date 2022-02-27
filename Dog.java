// inherit from 
public class Dog extends Mammal {

  Dog () { 
    System.out.println(" ... and also a Dog! ");
  }

  //CHANGED FROM protected
  public String eat_method (String foodType, String chewType, int chewTime) { 
    String response = "I swallow "+ foodType+ " without chewing!";
    return response; 
  }
}