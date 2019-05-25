/*
1.We have three lines from a song in Song.java.
First, print out whether line1 and line2 are the same.

2.Now, print whether line2 and line3 are equal.
*/

public class Song 
{
  	public static void main(String[] args)
    {
      String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
      String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      
      System.out.println(line1.equals(line2));
      System.out.println(line2.equals(line3));
    }
}
