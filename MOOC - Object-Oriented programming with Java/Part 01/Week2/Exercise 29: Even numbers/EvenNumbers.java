public class EvenNumbers
{
    public static void main(String[] args)
    {
        // Write your code here
        int integer = 2;
        while(integer < 101)
        {
            if((integer % 2) == 0)
            {
                System.out.println(integer);
                integer++;
            }

            integer++;
        }
    }
}
