import java.util.Scanner;

public class UpToCertainNumber
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int number = 1;
        
        System.out.print("Up to what number? ");
        int integer = Integer.parseInt(reader.nextLine());
        
        while(number <= integer)
        {
            System.out.println(number);
            number++;
        }
    }
}
