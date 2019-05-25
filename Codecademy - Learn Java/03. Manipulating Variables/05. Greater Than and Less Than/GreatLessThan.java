/*
1.Print the expression that checks if the amount of credits you have earned, creditsEarned, is greater than the number of credits you need to graduate, creditsToGraduate.

2.Create a variable called creditsAfterSeminar that holds the amount of credits earned after taking a seminar, which is worth creditsOfSeminar credits. creditsAfterSeminar should be the sum of creditsEarned and creditsOfSeminar.
Print out whether creditsToGraduate is less than creditsAfterSeminar.
*/

public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    
    System.out.println(creditsEarned > creditsToGraduate);
    
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    
    System.out.println(creditsToGraduate < creditsAfterSeminar);
	}
}
