

public class Batsman extends Players{

	private String status, style;
	private int balls;
	final int FOUR = 4;
	final int SIX = 6;
	private int numOfFours, numOfSixs, otherRuns;
	



public Batsman(String teamNameIn, int wicketsIn, double totalOversBowled, String playerType, String playerName, int age,
  String style, String statusIn, int ballsIn, int numOfFours, int numOfSixs, int otherRuns){
	super(teamNameIn, wicketsIn, totalOversBowled, playerType, playerName, age);

	status = statusIn;
	//runs = runsIn;
	balls = ballsIn;
	this.numOfFours = numOfFours;
	this.numOfSixs = numOfSixs;
	this.otherRuns = otherRuns;
	

}	// end of contructor.
public String getStyle(){
	return style;
}

public String getStatus(){
	return status;
}

public int getBalls(){
	return balls;
}
public int getNumOfFours(){
	return numOfFours;
}
public int getNumOfSixs(){
	return numOfSixs;
}

public int getOtherRuns(){
	return otherRuns;
}

public int getRuns(){
	int runsFromSixs = numOfSixs*FOUR;
	int runsFromFours = numOfFours*SIX;
	int runsScored = runsFromFours+runsFromSixs+otherRuns;
	return runsScored;
}

public double getStrikRate(){
	double strikRate = (runs/balls)*100;
	return strikRate;
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
public void setNumOfFours(int numberOfFours){
	numOfFours = numberOfFours;
}
public void setNumOfSixs(int numberOfSix){
	numOfSixs = numberOfSix;
}



} // end of the class.