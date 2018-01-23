
//import.java.util.Scanner 


public class CricketScoreCard{

	public static void main(String [] args){
	
			 

			  BattingCard WIbatsman1 = new BattingCard("West Indies", 9, 47.2, "Kraigg Brathwaite", "Batsman",     24, "Right Hand", "out", 26, 1, 0, 10);
			  BattingCard WIbatsman2 = new BattingCard("West Indies", 9, 47.2, "Evin Lewis",        "Batsman",     25, "Left Hand",  "out", 33, 2, 0, 13);
			  BattingCard WIbatsman3 = new BattingCard("West Indies", 9, 47.2, "Kieran Powell",     "Batsman",     27, "Left Hand",  "out", 5, 0, 0, 1);
			  BattingCard WIbatsman4 = new BattingCard("West Indies", 9, 47.2, "Shai Hope (wk)",    "Batsman",     23, "Right Hand", "out", 38, 2, 0, 23);
			  BattingCard WIbatsman5 = new BattingCard("West Indies", 9, 47.2, "Jason Mohammed",    "Batsman",     31, "Right Hand", "out", 91, 7, 0, 44);
			  BattingCard WIbatsman6 = new BattingCard("West Indies", 9, 47.2, "Jonathan Carter",   "All rounder", 29, "Left Hand",  "out", 47, 4, 2, 24);
			  BattingCard WIbatsman7 = new BattingCard("West Indies", 9, 47.2, "Jason Holder (c)",  "Bowler",      25, "Right Hand", "out", 7, 0, 0, 4);
			  BattingCard WIbatsman8 = new BattingCard("West Indies", 9, 47.2, "Carlos Brathwaite", "All rounder", 29, "Right Hand", "out", 12, 1, 0, 8);
			  BattingCard WIbatsman9 = new BattingCard("West Indies", 9, 47.2, "Ashley Nurse",      "Bowler",      28, "Right Hand", "out", 15, 0, 2, 9);
			  BattingCard WIbatsman10 = new BattingCard("West Indies", 9, 47.2 "Devendra Bishoo",   "Bowler",      31, "Left Hand",  "out", 6, 2, 0, 4);
			  BattingCard WIbatsman11 = new BattingCard("West Indies", 9, 47.2, "Shannon Gabriel",  "Bowler",      29, "Right Hand", "out", 4, 0, 0, 0);


				
				 int team1 = PlayingTeam.setExtras(11);
		int totalScoreTeam1 = 0;
int scoreTeam1 = (WIbatsman1.getRuns() + WIbatsman2.getRuns() + WIbatsman3.getRuns() + WIbatsman4.getRuns() + WIbatsman5.getRuns() + WIbatsman6.getRuns() +
								WIbatsman7.getRuns() + WIbatsman8.getRuns() +WIbatsman9.getRuns() + WIbatsman10.getRuns() + WIbatsman11.getRuns() + team1;
		totalScoreTeam1 = totalScoreTeam1 + scoreTeam1;


				BowlingCard WIBowler1 = new BowlingCard("West Indies", 9, 47.2, "Jason Holder ",     "Bowler",      25, "Right-arm fast-medium"  9, 1, 46, 0);
				BowlingCard WIBowler2 = new BowlingCard("West Indies", 9, 47.2, "Shannon Gabriel",   "Bowler",      29, "Right-arm fast-medium"  10, 0, 58, 2);
				BowlingCard WIBowler3 = new BowlingCard("West Indies", 9, 47.2, "Carlos Brathwaite", "All rounder", 29, "Right-arm fast-medium"  10, 1, 54, 0);
				BowlingCard WIBowler4 = new BowlingCard("West Indies", 9, 47.2, "Ashley Nurse",      "Bowler",      28, "Right-arm offbreak"     10, 0, 57, 2);
				BowlingCard WIBowler5 = new BowlingCard("West Indies", 9, 47.2  "Devendra Bishoo",   "Bowler",      31, "Right-arm legbreak"     6, 0, 49, 1);
				BowlingCard WIBowler6 = new BowlingCard("West Indies", 9, 47.2, "Jason Mohammed",    "Batsman",     31, "Right-arm offbreak"     5, 0, 25, 0);




			



			  BattingCard ENGbatsman1 = new BattingCard("England", 6, 50,  "Jason Roy",         "Batsman",     27, "Right Hand"  "out",     22, 2 0, 5);
			  BattingCard ENGbatsman2 = new BattingCard("England", 6, 50,  "Sam Billings",      "Batsman",     26, "Right Hand", "out",     56, 7, 0, 28);
			  BattingCard ENGbatsman3 = new BattingCard("England", 6, 50,  "Joe Root",          "Batsman",     26, "Right Hand", "out",     5, 0, 0, 4);
			  BattingCard ENGbatsman4 = new BattingCard("England", 6, 50,  "Eoin Morgan (c)",   "Batsman",     31, "Left Hand",  "out",     116, 11, 2, 51);
			  BattingCard ENGbatsman5 = new BattingCard("England", 6, 50,  "Jos Buttler (wk)",  "Batsman",     27, "Right Hand", "out",     19, 0, 0, 14);
			  BattingCard ENGbatsman6 = new BattingCard("England", 6, 50,  "Ben Stokes",        "All rounder", 26, "Left Hand",  "out",     61, 0, 3, 43);
			  BattingCard ENGbatsman7 = new BattingCard("England", 6, 50,  "Moeen Ali",         "All rounder", 30, "Left Hand",  "not out", 7, 0, 0, 4);
			  BattingCard ENGbatsman8 = new BattingCard("England", 6, 50,  "Chris Woakes",      "All rounder", 28, "Right Hand", "not out", 22, 2, 0, 14);
			  BattingCard ENGbatsman9 = new BattingCard("England", 6, 50,  "Adil Rashid",       "Bowler",      29, "Right Hand", "dnb",     0, 0, 0, 0);
			  BattingCard ENGbatsman10 = new BattingCard("England", 6, 50, "Liam Plunkett",         "Bowler",      32, "Right Hand", "dnb",     0, 0, 0, 0);
			  BattingCard ENGbatsman11 = new BattingCard("England", 6, 50, "Steven Finn",              "Bowler",      28, "Right Hand", "dnb",     0, 0, 0, 0);


				
				 int team2= PlayingTeam.setExtras(20);
		int totalScoreTeam2 = 0;		
    int scoreTeam2 = (ENGBatsman1.getRuns() + ENGbatsman2.getRuns() + ENGbatsman3.getRuns() + ENGbatsman4.getRuns() + ENGbatsman5.getRuns() + ENGbatsman6.getRuns() +
								ENGbatsman7.getRuns() + ENGbatsman8.getRuns() +ENGbatsman9.getRuns() + ENGbatsman10.getRuns() + ENGbatsman11.getRuns())+team2;
		totalScoreTeam2 = totalScoreTeam2 + scoreTeam2;


				BowlingCard ENGBowler1 = new BowlingCard("England", 6, 50, "Steven Finn",   "Bowler",      28, "Right-arm fast "   9, 0, 49, 0);
				BowlingCard ENGBowler2 = new BowlingCard("England", 6, 50, "Chris Woakes",  "All rounder", 28, "Righ-arm medium "  9, 1, 47, 4);
				BowlingCard ENGBowler4 = new BowlingCard("England", 6, 50, "Joe Root",      "Batsman",     26, "right-arm offbreak "     5, 0, 31, 0);
				BowlingCard ENGBowler5 = new BowlingCard("England", 6, 50, "Liam Plunkett", "Bowler",      32, "Right-arm fast-medium "  8.2, 1, 40, 4);
				BowlingCard ENGBowler6 = new BowlingCard("England", 6, 50, "Moeen Ali",    "All rounder",  30, "Right-arm offbreak "     7, 0, 37, 0);
				BowlingCard ENGBowler3 = new BowlingCard("England", 6, 50, "Adil Rashid",  "Bowler",       29, "Right-arm leg-break "  9, 1, 43, 1);


if (totalScoreTeam2 > totalScoreTeam1){
	int runsDifference = totalScoreTeam2 - totalScoreTeam1;
	System.out.println(team2.getTeamName() + " Won by " + runsDifference + " runs");
}

else if(totalScoreTeam2 < totalScoreTeam1){
	int initialWickets = 10;
	int wicketsLeft = initialWickets - team1.getWickets();
	System.out.println(team1.getTeamName() + " Won by " + wicketsLeft + " wickets");
}

else{
	System.out.println("Match is tied.");

} 


//System.out.println(team2.getTeamName()+" Won by 45 runs");
System.out.println(team2.getTeamName() + " Innings                                 " + totalScoreTeam2 + "-" + team2.getWickets() +"("+ team2.getOvers()+")" );

System.out.println("");
System.out.println("BatsMan" + "\t                           \tR"+ "\tB"+ "\t4s"+ "\t6s"+ "\tSR");
System.out.println("-----------------------------------------------------------------------------------");

System.out.println("");
System.out.println(ENGPlayer1.getBatsmanName()+ "                           \t"+ ENGPlayer1.getRuns()+ "\t"+ENGPlayer1.getBalls()+ "\t"+ENGPlayer1.getBoundries()+ "\t"+ENGPlayer1.getSixs()+"\t"+ENGPlayer1.getStrikRate());
System.out.println(ENGPlayer2.getBatsmanName()+ "                           \t"+ ENGPlayer2.getRuns()+ "\t"+ENGPlayer2.getBalls()+ "\t"+ENGPlayer2.getBoundries()+ "\t"+ENGPlayer2.getSixs()+"\t"+ENGPlayer2.getStrikRate());
System.out.println(ENGPlayer3.getBatsmanName()+ "                           \t"+ ENGPlayer3.getRuns()+ "\t"+ENGPlayer3.getBalls()+ "\t"+ENGPlayer3.getBoundries()+ "\t"+ENGPlayer3.getSixs()+"\t"+ENGPlayer3.getStrikRate());
System.out.println(ENGPlayer4.getBatsmanName()+ "                        \t"+ ENGPlayer4.getRuns()+ "\t"+ENGPlayer4.getBalls()+ "\t"+ENGPlayer4.getBoundries()+ "\t"+ENGPlayer4.getSixs()+"\t"+ENGPlayer4.getStrikRate());
System.out.println(ENGPlayer5.getBatsmanName()+ "                      \t"+ ENGPlayer5.getRuns()+ "\t"+ENGPlayer5.getBalls()+ "\t"+ENGPlayer5.getBoundries()+ "\t"+ENGPlayer5.getSixs()+"\t"+ENGPlayer5.getStrikRate());
System.out.println(ENGPlayer6.getBatsmanName()+ "                           \t"+ ENGPlayer6.getRuns()+ "\t"+ENGPlayer6.getBalls()+ "\t"+ENGPlayer6.getBoundries()+ "\t"+ENGPlayer6.getSixs()+"\t"+ENGPlayer6.getStrikRate());
System.out.println(ENGPlayer7.getBatsmanName()+ "                           \t"+ ENGPlayer7.getRuns()+ "\t"+ENGPlayer7.getBalls()+ "\t"+ENGPlayer7.getBoundries()+ "\t"+ENGPlayer7.getSixs()+"\t"+ENGPlayer7.getStrikRate());
System.out.println(ENGPlayer8.getBatsmanName()+ "                           \t"+ ENGPlayer8.getRuns()+ "\t"+ENGPlayer8.getBalls()+ "\t"+ENGPlayer8.getBoundries()+ "\t"+ENGPlayer8.getSixs()+"\t"+ENGPlayer8.getStrikRate());
System.out.println(ENGPlayer9.getBatsmanName()+ "                           \t"+ ENGPlayer9.getRuns()+ "\t"+ENGPlayer9.getBalls()+ "\t"+ENGPlayer9.getBoundries()+ "\t"+ENGPlayer9.getSixs()+"\t"+ENGPlayer9.getStrikRate());
System.out.println(ENGPlayer10.getBatsmanName()+ "                          \t"+ ENGPlayer10.getRuns()+ "\t"+ENGPlayer10.getBalls()+ "\t"+ENGPlayer10.getBoundries()+ "\t"+ENGPlayer10.getSixs()+"\t"+ENGPlayer10.getStrikRate());
System.out.println(ENGPlayer11.getBatsmanName()+ "                              \t"+ ENGPlayer11.getRuns()+ "\t"+ENGPlayer11.getBalls()+ "\t"+ENGPlayer11.getBoundries()+ "\t"+ENGPlayer11.getSixs()+"\t"+ENGPlayer11.getStrikRate());

System.out.println("");
System.out.println("Extras                                  "+ team2.getExtras());
System.out.println("Total:                                  "+totalScoreTeam2);
System.out.println("***********************************************************************************");

System.out.println("Bowlers" + "\t                           \tO"+ "\tM"+ "\tR"+ "\tW"+ "\tER");
System.out.println("-----------------------------------------------------------------------------------");
System.out.println(WIBowler1.getBowler()+ "                           \t"+ WIBowler1.getOvers()+ "\t"+WIBowler1.getMaidenOvers()+ "\t"+WIBowler1.getRunsGiven()+"\t"+WIBowler1.getWicketsTaken()+"\t"+WIBowler1.getEconomicRate());
System.out.println(WIBowler2.getBowler()+ "                       \t"+ WIBowler2.getOvers()+ "\t"+WIBowler2.getMaidenOvers()+ "\t"+WIBowler2.getRunsGiven()+"\t"+WIBowler2.getWicketsTaken()+"\t"+WIBowler2.getEconomicRate());
System.out.println(WIBowler3.getBowler()+ "                   \t"+ WIBowler3.getOvers()+ "\t"+WIBowler3.getMaidenOvers()+ "\t"+WIBowler3.getRunsGiven()+"\t"+WIBowler3.getWicketsTaken()+"\t"+WIBowler3.getEconomicRate());
System.out.println(WIBowler4.getBowler()+ "                           \t"+ WIBowler4.getOvers()+ "\t"+WIBowler4.getMaidenOvers()+ "\t"+WIBowler4.getRunsGiven()+"\t"+WIBowler4.getWicketsTaken()+"\t"+WIBowler4.getEconomicRate());
System.out.println(WIBowler5.getBowler()+ "                       \t"+ WIBowler5.getOvers()+ "\t"+WIBowler5.getMaidenOvers()+ "\t"+WIBowler5.getRunsGiven()+"\t"+WIBowler5.getWicketsTaken()+"\t"+WIBowler5.getEconomicRate());
System.out.println(WIBowler6.getBowler()+ "                           \t"+ WIBowler6.getOvers()+ "\t"+WIBowler6.getMaidenOvers()+ "\t"+WIBowler6.getRunsGiven()+"\t"+WIBowler6.getWicketsTaken()+"\t"+WIBowler6.getEconomicRate());


System.out.println(team1.getTeamName() + " Innings                                 " + totalScoreTeam1 + "-" + team1.getWickets() +"("+ team1.getOvers()+")" );

System.out.println("");
System.out.println("BatsMan" + "\t                           \tR"+ "\tB"+ "\t4s"+ "\t6s"+ "\tSR");
System.out.println("-----------------------------------------------------------------------------------");

System.out.println("");
System.out.println(WIPlayer1.getBatsmanName()+ "                      \t"+ WIPlayer1.getRuns()+ "\t"+WIPlayer1.getBalls()+ "\t"+WIPlayer1.getBoundries()+ "\t"+WIPlayer1.getSixs()+"\t"+WIPlayer1.getStrikRate());
System.out.println(WIPlayer2.getBatsmanName()+ "                           \t"+ WIPlayer2.getRuns()+ "\t"+WIPlayer2.getBalls()+ "\t"+WIPlayer2.getBoundries()+ "\t"+ WIPlayer2.getSixs()+"\t"+WIPlayer2.getStrikRate());
System.out.println(WIPlayer3.getBatsmanName()+ "                           \t"+ WIPlayer3.getRuns()+ "\t"+WIPlayer3.getBalls()+ "\t"+WIPlayer3.getBoundries()+ "\t"+WIPlayer3.getSixs()+"\t"+WIPlayer3.getStrikRate());
System.out.println(WIPlayer4.getBatsmanName()+ "                        \t"+ WIPlayer4.getRuns()+ "\t"+WIPlayer4.getBalls()+ "\t"+WIPlayer4.getBoundries()+ "\t"+WIPlayer4.getSixs()+"\t"+WIPlayer4.getStrikRate());
System.out.println(WIPlayer5.getBatsmanName()+ "                      \t"+ WIPlayer5.getRuns()+ "\t"+WIPlayer5.getBalls()+ "\t"+WIPlayer5.getBoundries()+ "\t"+WIPlayer5.getSixs()+"\t"+WIPlayer5.getStrikRate());
System.out.println(WIPlayer6.getBatsmanName()+ "                      \t"+ WIPlayer6.getRuns()+ "\t"+WIPlayer6.getBalls()+ "\t"+WIPlayer6.getBoundries()+ "\t"+WIPlayer6.getSixs()+"\t"+WIPlayer6.getStrikRate());
System.out.println(WIPlayer7.getBatsmanName()+ "                      \t"+ WIPlayer7.getRuns()+ "\t"+WIPlayer7.getBalls()+ "\t"+WIPlayer7.getBoundries()+ "\t"+WIPlayer7.getSixs()+"\t"+WIPlayer7.getStrikRate());
System.out.println(WIPlayer8.getBatsmanName()+ "                      \t"+ WIPlayer8.getRuns()+ "\t"+WIPlayer8.getBalls()+ "\t"+WIPlayer8.getBoundries()+ "\t"+WIPlayer8.getSixs()+"\t"+WIPlayer8.getStrikRate());
System.out.println(WIPlayer9.getBatsmanName()+ "                           \t"+ WIPlayer9.getRuns()+ "\t"+WIPlayer9.getBalls()+ "\t"+WIPlayer9.getBoundries()+ "\t"+WIPlayer9.getSixs()+"\t"+WIPlayer9.getStrikRate());
System.out.println(WIPlayer10.getBatsmanName()+ "                      \t"+ WIPlayer10.getRuns()+ "\t"+WIPlayer10.getBalls()+ "\t"+WIPlayer10.getBoundries()+ "\t"+WIPlayer10.getSixs()+"\t"+WIPlayer10.getStrikRate());
System.out.println(WIPlayer11.getBatsmanName()+ "                      \t"+ WIPlayer11.getRuns()+ "\t"+WIPlayer11.getBalls()+ "\t"+WIPlayer11.getBoundries()+ "\t"+WIPlayer11.getSixs()+"\t"+WIPlayer11.getStrikRate());

System.out.println("");
System.out.println("Extras                                  "+ team1.getExtras());
System.out.println("Total:                                  "+totalScoreTeam1);
System.out.println("***********************************************************************************");

System.out.println("Bowlers" + "\t                           \tO"+ "\tM"+ "\tR"+ "\tW"+ "\tER");
System.out.println("-----------------------------------------------------------------------------------");
System.out.println(ENGBowler1.getBowler()+ "                           \t"+ ENGBowler1.getOvers()+ "\t"+ENGBowler1.getMaidenOvers()+ "\t"+ENGBowler1.getRunsGiven()+"\t"+ENGBowler1.getWicketsTaken()+"\t"+ENGBowler1.getEconomicRate());
System.out.println(ENGBowler2.getBowler()+ "                       \t"+ ENGBowler2.getOvers()+ "\t"+ENGBowler2.getMaidenOvers()+ "\t"+ENGBowler2.getRunsGiven()+"\t"+ENGBowler2.getWicketsTaken()+"\t"+ENGBowler2.getEconomicRate());
System.out.println(ENGBowler3.getBowler()+ "                           \t"+ ENGBowler3.getOvers()+ "\t"+ENGBowler3.getMaidenOvers()+ "\t"+ENGBowler3.getRunsGiven()+"\t"+ENGBowler3.getWicketsTaken()+"\t"+ENGBowler3.getEconomicRate());
System.out.println(ENGBowler4.getBowler()+ "                           \t"+ ENGBowler4.getOvers()+ "\t"+ENGBowler4.getMaidenOvers()+ "\t"+ENGBowler4.getRunsGiven()+"\t"+ENGBowler4.getWicketsTaken()+"\t"+ENGBowler4.getEconomicRate());
System.out.println(ENGBowler5.getBowler()+ "                       \t"+ ENGBowler5.getOvers()+ "\t"+ENGBowler5.getMaidenOvers()+ "\t"+ENGBowler5.getRunsGiven()+"\t"+ENGBowler5.getWicketsTaken()+"\t"+ENGBowler5.getEconomicRate());
System.out.println(ENGBowler6.getBowler()+ "                           \t"+ ENGBowler6.getOvers()+ "\t"+ENGBowler6.getMaidenOvers()+ "\t"+ENGBowler6.getRunsGiven()+"\t"+ENGBowler6.getWicketsTaken()+"\t"+ENGBowler6.getEconomicRate());








} // end of main class.

}// end of the class CricketScoreCard.