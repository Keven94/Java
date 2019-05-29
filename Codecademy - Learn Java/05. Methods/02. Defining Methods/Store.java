/*
1. In between the constructor and the main() method, add a method called advertise() to the Store class. 
It should be accessible by other classes, and should have no output.
You can leave the body of the method empty.

2. Inside the advertise() method, type two print statements. They should result in the printouts:

"Selling productType!"
"Come spend some money!"

where productType is replaced with the value in the variable productType.
However, we’re not going to see these Strings printed out yet! 
We’ll see in the next exercise how we can make these printouts actually run.
*/

public class Store 
{
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) 
  {
    productType = product;
  }
  
  // advertise method
  public void advertise()
  {
    System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  // main method
  public static void main(String[] args) 
  {
    
  }
}
