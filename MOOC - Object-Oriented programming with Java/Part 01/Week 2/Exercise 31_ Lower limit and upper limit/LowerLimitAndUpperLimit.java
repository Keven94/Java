import java.util.Scanner;

public class LowerLimitAndUpperLimit
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.print("First: ");
        int numberA = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int numberB = Integer.parseInt(reader.nextLine());
        
        int integer = numberA;
        
        while(integer <= numberB)
        {
            System.out.println(integer);
            integer++;
        }
    }
}
