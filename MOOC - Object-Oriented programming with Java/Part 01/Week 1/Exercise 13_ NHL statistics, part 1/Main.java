import nhlstats.NHLStatistics;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println("");
        
        System.out.println("Top twenty-five by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("");
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("");
        
        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
        System.out.println("");
        
        System.out.println("Players in Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
    }
}
