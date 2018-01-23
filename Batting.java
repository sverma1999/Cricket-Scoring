

public class batting{

	private String batsmanName, status;
	private int runs, balls, boundries, sixs;
	private double strikRate;



public batting(String batsmanNameIn, String statusIn, int runsIn, int ballsIn, int fours, int sixsIn, double sR){
	batsmanName = batsmanNameIn;
	status = statusIn;
	runs = runsIn;
	balls = ballsIn;
	boundries = fours;
	sixs = sixsIn;
	strikRate = sR;

}	// end of contructor.

public String getBatsmanName(){
	return batsmanName;
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
public double getStrikRate(){
	return strikRate;
}


public void setBatsmanName(String batterName){
	batsmanName = batterName;
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
public void setStrikRate(double sRate){
	strikRate = sRate;
}



} // end of the class.