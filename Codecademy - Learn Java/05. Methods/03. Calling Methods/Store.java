/*
1. Last exercise, we defined a new method, advertise(), but we didn’t actually see it run.
We now have a Store class with advertise() defined.
Call the advertise() method on the lemonadeStand object in the main() method and see what the output is!

2. Now, call the advertise() method on the lemonadeStand object two more times. It should be called in the main() method three times total.
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
    Store lemonadeStand = new Store("Lemonade");
    lemonadeStand.advertise();
    lemonadeStand.advertise();
    lemonadeStand.advertise();
  }
}
