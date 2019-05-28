/*
1. Add two new instance fields for Store.
inventoryCount of type int. inventoryPrice of type double.

2. Update the Store constructor method with the new parameters.
The parameters should be product, count, and price, in that order.
You must use that order and include the types for each parameter.
For example, product is of type String because that value is assigned to the instance field String productType.

3. In the body of the Store constructor, assign the parameter values to the appropriate instance fields.

4. Inside main(), create an instance of Store called cookieShop.
cookieShop has "cookies" as the product.
cookieShop has 12 cookies to sell and each cookie costs 3.75.
*/

public class Store
{
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  public Store(String product, int count, double price)
  {
    productType = product;
    inventoryCount = count;
  	inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args)
  {
    Store cookieShop = new Store("cookies", 12, 3.75);
  }
}
