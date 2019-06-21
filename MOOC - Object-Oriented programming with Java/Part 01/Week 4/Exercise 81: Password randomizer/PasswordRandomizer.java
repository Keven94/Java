import java.util.Random;

public class PasswordRandomizer 
{ 
    private int length;

    public PasswordRandomizer(int length) 
    {
        this.length = length;
    }

    public String createPassword() 
    {
        Random random = new Random();
        String password = "";
        int i = 0;
        
        while(i < this.length)
        {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            password += symbol;
            i++;
        }
        
        return password;
    }
}
