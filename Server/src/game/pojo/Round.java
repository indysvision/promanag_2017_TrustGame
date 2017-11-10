package game.pojo;

public class Round {
	private Player [] players = new Player[2];

	public Round(Player[] players) {
		super();
		this.players = players;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	
}
