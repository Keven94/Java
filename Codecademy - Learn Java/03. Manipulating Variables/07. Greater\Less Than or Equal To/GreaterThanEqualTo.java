/*
1.You have been trying to complete a 30 day challenge to drink enough water per day.
Create a double variable called totalRecommendedAmount and set it to the product of the recommended water intake 
(recommendedWaterIntake) and the amount of days in the challenge (daysInChallenge).

2.Create a boolean variable called isChallengeComplete and set it to the result of checking if your intake, 
yourWaterIntake, is at least as much as the totalRecommendedAmount.
Then, print the isChallengeComplete variable.
*/

public class GreaterThanEqualTo {
  	public static void main(String[] args){
      double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;
      double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
      
      System.out.println(isChallengeComplete);
    }
}
