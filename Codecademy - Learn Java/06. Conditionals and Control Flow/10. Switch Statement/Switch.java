/*
1. Set the code block under the default case to:

System.out.println("Messi is in position...");

2. Look at the code in the code editor. Set the char variable penaltyKick value to L, R, or C.
*/

public class Switch {
	public static void main(String[] args) {
		
		char penaltyKick = 'C';

		switch (penaltyKick) {

			case 'L': System.out.println("Messi shoots to the left and scores!");
								break; 
			case 'R': System.out.println("Messi shoots to the right and misses the goal!");
								break;
			case 'C': System.out.println("Messi shoots down the center, but the keeper blocks it!");
								break;
			default:
				System.out.println("Messi is in position...");

		}

	}
}
