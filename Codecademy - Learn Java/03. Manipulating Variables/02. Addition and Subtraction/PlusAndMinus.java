/*
1. Create an int variable called animalsInZoo that holds the amount of zebras plus the amount of giraffes at the zoo.
Then, print your animalsInZoo variable.

2.Two of the zebras have been traded to a neighboring rival zoo. Subtract 2 from the number of zebras and store the result in a variable called numZebrasAfterTrade.
Then, print the numZebrasAfterTrade variable!
*/

public class PlusAndMinus 
{
	public static void main(String[] args) 
	{   
		int zebrasInZoo = 8;
    		int giraffesInZoo = 4;
    		int animalsInZoo = zebrasInZoo + giraffesInZoo;
    
    		System.out.println(animalsInZoo);
    
    		int numZebrasAfterTrade = zebrasInZoo - 2;
    
    		System.out.println(numZebrasAfterTrade);
	}
}
