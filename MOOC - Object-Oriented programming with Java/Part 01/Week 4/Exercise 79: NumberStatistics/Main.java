import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int userNumber;
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.println("Type numbers:");
        userNumber = Integer.parseInt(reader.nextLine());
        while(userNumber != -1)
        {
            stats.addNumber(userNumber);
            
            if(userNumber % 2 == 0)
                even.addNumber(userNumber);
            else
                odd.addNumber(userNumber);
            
            userNumber = Integer.parseInt(reader.nextLine());
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
