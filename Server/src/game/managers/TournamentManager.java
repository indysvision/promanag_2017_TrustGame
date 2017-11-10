package game.managers;

import game.pojo.Game;
import game.pojo.Round;
import game.pojo.Tournament;

public class TournamentManager {
	private PlayerManager [] playersManager = new PlayerManager[4];
	private Tournament currentTournament;
	
	
	
	private Game [] getFirstTwoGames() {
		return new Game[2];	
	}
	
	private Game [] getSecondTwoGames() {
		return new Game[2];	
	}
	
	private Game [] getThirdTwoGames() {
		return new Game[2];	
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
