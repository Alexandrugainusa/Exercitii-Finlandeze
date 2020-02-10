package week1;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                // print the top ten playes sorted by points
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
                System.out.println("Top ten by points");
            } else if (command.equals("goals")) {
                // print the top ten players sorted by goals
                System.out.println("Top ten players based on goal:");
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                // print the top ten players sorted by assists
                System.out.println("Top ten players sorted by assists:");
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                // print the top ten players sorted by penalties
                System.out.println("Top 10 players based on penalty amounts:");
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                // ask the user for the player name and print the statistics for that player
                System.out.println("Which player's statistics do you want to print: ");
                String player = reader.nextLine();
                NHLStatistics.searchByPlayer(player);
            } else if (command.equals("club")) {
                // ask the user for the club abbreviation and print the statistics for the club
                // note: the statistics should be sorted by points
                //     (players with the most points are first)
                System.out.println("Which club statistics do you want to print: ");
                String club = reader.nextLine();
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(club);
            }
        }
    }
}
