/*
1. Add a method to the Store class called greetCustomer(). It should be accessible by other classes, and return no output. For now, have it take no parameters and leave the body of the method empty.

2. Modify the greetCustomer() method so that it accepts a String parameter called customer.

3. Inside of the greetCustomer() method, add a print statement to print:
"Welcome to the store, " + customer + "!"

4. Inside the main() method, call the greetCustomer() method on the lemonadeStand object. Pass in a String parameter of your choice!
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
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  public void greetCustomer(String customer)
  {
    System.out.println("Welcome to the store, " + customer + "!");
  }
  
  // main method
  public static void main(String[] args) 
  {
    Store lemonadeStand = new Store("Lemonade");
    lemonadeStand.greetCustomer("Human");
  }
}
