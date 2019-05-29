/*
1. We want to have a method that returns the price plus tax.
Define a method called getPriceWithTax() that is intended to return the price plus the tax. 
It should take in no parameters and return a double.
You can leave the body of the method empty for now. 
Note: the code will have an error until we return the correct type from the method, which we will do in the next step.

2. Inside the getPriceWithTax() method, create a double variable totalPrice that is equal to price + price * 0.08. 0.08 is the tax applied to the price.
Then, return totalPrice.

3. Inside of main(), set a double variable lemonadePrice to the value returned by lemonadeStand.getPriceWithTax().

4.Now, print out lemonadePrice.
*/

public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax()
  {
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) 
  {
    Store lemonadeStand = new Store("Lemonade", 3.75);
		double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println(lemonadePrice);
  }
}
