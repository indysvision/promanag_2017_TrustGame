package game.pojo;

public class Game {
	private Round [] rounds = new Round[Tournament.ROUND_NO];
	private Player [] players = new Player[2];

	public Game(Player [] players) {
		super();
		this.players = players;
	}

	public Round[] getRounds() {
		return rounds;
	}

	public void setRounds(Round[] rounds) {
		this.rounds = rounds;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	
	
}
