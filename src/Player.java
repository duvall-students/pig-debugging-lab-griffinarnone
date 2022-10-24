
public abstract class Player {

	protected String myName;
	public int myScore;			// Changed this variable to public in order for it to get retrieved (Bug 1)
	private final int WIN_SCORE = 100;
	
	public Player(String myName){
		myScore = 0;
		this.myName = myName;		// Fixes R2D2 naming issue (BUG 5)
	}
	
	// Each player must provide logic for deciding to roll again
	public abstract boolean rollAgain(int totalSoFar);
	
	public String toString(){
		return myName+": "+myScore;
	}
	
	public boolean hasWon(){
		return myScore >= WIN_SCORE;
	}
	
	public void resetScore(){
		myScore = 0;
	}
	
	public void addToScore(int thisRound){		// error here (Bug 4)
		myScore += thisRound;
	}
	
	public String getName(){
		return myName;
	}
}
