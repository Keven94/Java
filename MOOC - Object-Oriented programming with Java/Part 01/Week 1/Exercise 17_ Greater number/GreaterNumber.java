import java.util.Scanner;

public class GreaterNumber 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int numberA = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int numberB = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        if(numberA > numberB)
        {
            System.out.println("Greater number: " + numberA);
        } 
        else if(numberA < numberB)
        {
            System.out.println("Greater number: " + numberB);
        }
        else
        {
            System.out.println("The numbers are equal!");
        }
    }
}
