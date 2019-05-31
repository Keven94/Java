import java.util.Scanner;

public class Divider 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int A = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int B = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        System.out.println("Division: " + A + " / " + B + " = " + ((double) A / B));
    }
}
