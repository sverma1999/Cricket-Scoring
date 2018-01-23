

public class BowlingCard extends Players{

	 private String bowlingStyle;
	 private int maiden, runsGiven, wicketsTaken;
	 private double overs;

public BowlingCard(String teamNameIn, int wicketsIn, double totalOversBowled, String playerType, String playerName, int age,
  String bowlingStyle, double oversIn, int maidenIn, int runsGivenIn, int wicketsIn){
 	super(teamNameIn, wicketsIn, totalOversBowled, playerType, playerName, age);
	this.bowlingStyle = bowlingStyle;
	maiden = maidenIn;
	runsGiven = runsGivenIn;
	wicketsTaken = wicketsIn;
	overs = oversIn;
	

}

public String getBowlingtyle(){
	return bowlingStyle;
}


public int getMaidenOvers(){
	return maiden;
}
public int getRunsGiven(){
	return runsGiven;
}
public int getWicketsTaken(){
	return wicketsTaken;
}

public double getOvers(){
	return overs;
}
public double getEconomicRate(){
	double economicRate = runsGiven/overs;
	return economicRate;
}



public void setMaiden(int maidenBowled){
	maiden = maidenBowled;
}
public void setRunsGiven(int run){
	runsGiven = run;
}
public void setWickets(int wickets){
	wicketsTaken = wickets;
}
public void setOvers(double oversBowled){
	overs = oversBowled;
}





}// end of the class.