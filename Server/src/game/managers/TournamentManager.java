package game.managers;

import game.pojo.Round;
import game.pojo.Tournament;

public class TournamentManager {
	private PlayerManager [] playersManager = new PlayerManager[4];
	private Tournament currentTournament;
	
	
	
	private Round [] getFirstTwoGames() {
		return new Round[2];	
	}
	
	private Round [] getSecondTwoGames() {
		return new Round[2];
	}
	
	private Round [] getThirdTwoGames() {
		return new Round[2];
	}
	
	public TournamentManager(PlayerManager[] playersManager) {
		super();
		this.playersManager = playersManager;
		currentTournament = new Tournament();
		prepareTournament();
	}

	private void prepareTournament() {
		
	}
	
	public PlayerManager[] getPlayersManager() {
		return playersManager;
	}

	public void setPlayersManager(PlayerManager[] playersManager) {
		this.playersManager = playersManager;
	}
	
	

}
