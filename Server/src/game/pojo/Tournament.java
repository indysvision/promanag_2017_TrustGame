package game.pojo;

public class Tournament {
	public static final int ROUND_NO = 3;
	public static final int GAMES_NO = 6;	
	
	private Game [] games = new Game[GAMES_NO];

	public Game[] getGames() {
		return games;
	}

	public void setGames(Game[] games) {
		this.games = games;
	}
	
	
}
