

public class ScoreCard{

	private String batsmanName, bowlerName, notBattedPlayer, status;
	private int runs, balls, boundries, sixs, extras, total, maiden, runsGiven, wicketsTaken;
	private double strikRate, overs, economicRate;
	 
	 

public ScoreCard(String batsmanNameIn, String dnb, String statusIn, String bowlerIn, int runsIn, int ballsIn, int fours, int sixsIn, int extrasIn, int totalIn,
 int maidenIn, int runsGivenIn, int wicketsIn, double sR, double oversIn, double eRate){
	batsmanName = batsmanNameIn;
	notBattedPlayer = dnb;
	status = statusIn;
	runs = runsIn;
	balls = ballsIn;
	boundries = fours;
	sixs = sixsIn;
	extras = extrasIn;
	total = totalIn;
	strikRate = sR;
	bowlerName = bowlerIn;
	maiden = maidenIn;
	runsGiven = runsGivenIn;
	wicketsTaken = wicketsIn;
	overs = oversIn;
	economicRate = eRate;

}	// end of contructor.

public String getBatsmanName(){
	return batsmanName;
}
 public String getNoneBattedPlayer(){
 	return notBattedPlayer;
 }
public String getStatus(){
	return status;
}
public int getRuns(){
	return runs;
}
public int getBalls(){
	return balls;
}
public int getBoundries(){
	return boundries;
}
public int getSixs(){
	return sixs;
}
public int getExtras(){
	return extras;
}
public int getTotal(){
	return total;
}
public double getStrikRate(){
	return strikRate;
}
public String getbowler (){
	return bowlerName;
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
	return economicRate;
}


public void setBatsmanName(String batterName){
	batsmanName = batterName;
}
public void setNotBattedPlayer(String nonPlayed){
	notBattedPlayer = nonPlayed;
}
public void setStatus(String statusIn){
	status = statusIn;
}
public void setRuns(int runsAdded){
	runs = runsAdded;
}
public void setBalls(int ballsFaced){
	balls = ballsFaced;
}
public void setBoundries(int boundriesIn){
	boundries = boundriesIn;
}
public void setSixs(int sixHitted){
	sixs = sixHitted;
}
public void setExtras(int extraRuns){
	extras = extraRuns;
}
public void setTotal(int totalScored){
	total = totalScored;
}
public void setStrikRate(double sRate){
	strikRate = sRate;
}
public void setBowlerName(String name){
	bowlerName = name;
}
public void setMaiden(int maidenBowled){
	maiden = maidenBowled;
}
public void setRunsGiven(int run){
	runsGiven = runs;
}
public void setWickets(int wickets){
	wicketsTaken = wickets;
}
public void setOvers(double oversBowled){
	overs = oversBowled;
}
public void setEconomicRate(double economic){
	economicRate = economic;
}




} // end of the class.