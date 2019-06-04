import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        int guesses = 0;

        // program your solution here. Do not touch the above lines!        
        while(true)
        {
            System.out.print("Guess a number: ");
            int userNumber = Integer.parseInt(reader.nextLine());
            guesses++;
            
            if(userNumber == numberDrawn)
            {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else if(userNumber < numberDrawn)
            {
                System.out.println("The number is greater, guesses made: " + guesses);

            }
            else
            {
                System.out.println("The number is lesser, guesses made: " + guesses);
            }   
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber()
    {
        return new Random().nextInt(101);
    }
}
