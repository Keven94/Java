/*
1. Let’s explore how code execution moves around the file with two methods.
Add a print statement inside our Store constructor with the message: I am inside the constructor method.
We’ll see this message whenever we create an instance of Store by calling the constructor.

2. We did not see our constructor message printed because we haven’t run the code inside the constructor.
Inside main(), create an instance of Store called lemonadeStand. Don’t forget the new keyword!
We should see the constructor message.

3. Inside main(), print lemonadeStand to see how Java represents this instance.
Review the order of the printed messages:

    Running the program invokes main()
    We create an instance so we move from main() to Store()
    The code inside Store() runs
    When Store() finishes execution, we return to main()
*/

public class Store 
{
  // new method: constructor!
  public Store() 
  {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method is where we create instances!
  public static void main(String[] args)
  {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store();
    // print the instance below
    System.out.println(lemonadeStand);
  }
}
