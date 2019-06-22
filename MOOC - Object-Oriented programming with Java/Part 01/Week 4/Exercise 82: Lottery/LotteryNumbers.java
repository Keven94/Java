import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers 
{
    private ArrayList<Integer> numbers;

    public LotteryNumbers() 
    {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() 
    {
        return this.numbers;
    }

    public void drawNumbers() 
    {
        Random random = new Random();
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        for(int i = 0; i < 7; i++)
        {
            int number = 1 + random.nextInt(39); 
            if(numbers.contains(number))
                i--;
            else
                numbers.add(number);
        }
    }

    public boolean containsNumber(int number) 
    {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
