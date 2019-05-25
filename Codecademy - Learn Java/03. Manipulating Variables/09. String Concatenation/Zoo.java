/*
1.In our zoo, we have a certain number of animals, stored in animals, of a certain species, stored in species.
Use + to make a new String variable called zooDescription. It should hold a String that looks like:
Our zoo has <animals> <species>s!
For example, if we had 5 animals that were all of the species Masai Giraffe, the String would say:
Our zoo has 5 Masai Giraffes!

2.Print out the variable zooDescription!
*/

public class Zoo 
{
  	public static void main(String[] args)
    {
      int animals = 12;
      String species = "zebra";
      String zooDescription = "Our zoo has " + animals + " " + species + "s!";
      
      System.out.println(zooDescription);
    }       
}
