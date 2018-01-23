

public class PlayingTeam{

	private String teamName;
	//private int score;
	private int wickets;
	private double overs;
	private int extras;
	


public PlayingTeam(String teamNameIn, int wicketsIn, double totalOversBowled){

	teamName = teamNameIn;
	wickets = wicketsIn;
	overs = totalOversBowled;
   // totalScore = 0;
}	
	
public String getTeamName(){
	return teamName;

}

//public int getScore(){
//	return score;

//}

public int getWickets(){
	return wickets;
}

public double getOvers(){
	return overs;
}
public int getExtras(){
	return extras;
}

public void setTeamName(String nameIn){
	teamName = nameIn;
}

//public void setScore(int scoreIn){
//	score = scoreIn;
//}

public void setWickets(int wicketsFall){
	wickets = wicketsFall;

}

public void setOvers(double oversDone){
	overs = oversDone;

}

public void setExtras(int extraRuns){
	extras = extraRuns;
}


} // end of the class