

public class Players extends PlayingTeam{

private String playerType, playerName;
private int age;


public Players(String teamNameIn, int wicketsIn, double totalOversBowled,
 String playerName, String playerType, int age){
	super(teamNameIn, wicketsIn, totalOversBowled);

	this.playerType = playerType;
	this.playerName = playerName;
	this.age = age;
}// end of constructor.

public String getPlayerType(){
	return playerType;
}

public String getPlayerName(){
	return playerName;
}

public int getPlayerAge(){
	return age;
}

public void setPlayerType(String type){
	playerType = type;
}
public void setPlayerName(String name){
	playerName = name;
}

public void setAge(int ageIn){
	age = ageIn;
}


}// end of the class.