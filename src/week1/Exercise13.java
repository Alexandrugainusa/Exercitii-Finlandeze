package week1;
/*
The program must do the following:

Print the top ten players based on goals
Print the top 25 players based on penalty amounts
Print the statistics for Sidney Crosby
Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
 */

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.top(10);

        System.out.println("-----------------");

        System.out.println("Top ten players based on goal:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("-----------------");

        System.out.println("Top 25 players based on penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("-----------------");

        System.out.println("The statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("-----------------");

        System.out.println("The statistics for Philadelphia Flyers:");
        NHLStatistics.teamStatistics("PHI"); // *the players are printed in based on points !!!


        System.out.println("-----------------");

        System.out.println("The players in Anaheim Ducks:");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();

    }
}


