import java.util.Scanner;

public class SumOfTheAges
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.print("Type your name: ");
        String nameA = reader.nextLine();
        System.out.print("Type your age: ");
        int ageA = Integer.parseInt(reader.nextLine());    
        System.out.println("");
        
        System.out.print("Type your name: ");
        String nameB = reader.nextLine();
        System.out.print("Type your age: ");
        int ageB = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        System.out.println(nameA + " and " + nameB + " are " + (ageA + ageB) +
                                                        " years old in total.");
    }
}
