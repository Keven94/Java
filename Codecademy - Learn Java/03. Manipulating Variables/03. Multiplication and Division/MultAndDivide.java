/*
1.In main(), there is a variable called subtotal, which represents the subtotal of an amount to pay on a bill, and a variable called tax, which represents the amount of tax added to the subtotal.
Create a double variable, total, that holds subtotal plus the product of subtotal and tax.
Print the total variable!

2.There were 4 people who bought this meal together and want to split the cost.
Create a double variable called perPerson that holds total divided by 4.
Print the perPerson variable!
*/

public class MultAndDivide 
{
	public static void main(String[] args) 
  {   
		double subtotal = 30;
    double tax = 0.0875;
    
    double total = subtotal + (subtotal * tax);
    
    System.out.println(total);
    
    double perPerson = total / 4;
    
    System.out.println(perPerson);
	}
}
