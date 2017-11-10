package game.pojo;

public class Game {
	private Round [] rounds = new Round[Tournament.ROUND_NO];

	public Game(Round[] rounds) {
		super();
		this.rounds = rounds;
	}

	public Round[] getRounds() {
		return rounds;
	}

	public void setRounds(Round[] rounds) {
		this.rounds = rounds;
	}
	
	
}
