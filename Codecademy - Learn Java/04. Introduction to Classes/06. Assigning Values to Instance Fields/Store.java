/*
1. Inside main(), create an instance of Store and assign it to the variable lemonadeStand. Use "lemonade" as the parameter value.
2. Print the instance field productType from lemonadeStand.
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
  
  // main method
  public static void main(String[] args) 
  {
    Store lemonadeStand = new Store("lemonade");
    System.out.println(lemonadeStand.productType);
  }
}
