package game.managers;

import game.interfaces.TournamentInterface;
import game.pojo.Game;
import game.pojo.Player;
import game.pojo.Round;
import game.pojo.Tournament;

public class TournamentManager  implements TournamentInterface{
	private static final int [][] gamePairs = {
			{0, 1, 2, 3},
			{0, 2, 1, 3},
			{0, 3, 1, 2}
	};
	
	private PlayerManager [] playersManager = new PlayerManager[4];
	private Tournament currentTournament;
	
	private Game [] getFirstGames() {
		PlayerManager [] pair1 = new PlayerManager[2];
		pair1[0] = playersManager[gamePairs[0][0]];
		pair1[1] = playersManager[gamePairs[0][1]];
		
		PlayerManager [] pair2 = new PlayerManager[2];
		pair2[0] = playersManager[gamePairs[0][2]];
		pair2[1] = playersManager[gamePairs[0][3]];
		
		return new Game[2];	
	}
	
	private Game [] getSecondGames() {
		PlayerManager [] pair1 = new PlayerManager[2];
		pair1[0] = playersManager[gamePairs[1][0]];
		pair1[1] = playersManager[gamePairs[1][1]];
		
		PlayerManager [] pair2 = new PlayerManager[2];
		pair2[0] = playersManager[gamePairs[1][2]];
		pair2[1] = playersManager[gamePairs[1][3]];
		
		return new Game[2];	
	}
	
	private Game [] getThirdGames() {
		PlayerManager [] pair1 = new PlayerManager[2];
		pair1[0] = playersManager[gamePairs[2][0]];
		pair1[1] = playersManager[gamePairs[2][1]];
		
		PlayerManager [] pair2 = new PlayerManager[2];
		pair2[0] = playersManager[gamePairs[2][2]];
		pair2[1] = playersManager[gamePairs[2][3]];
		
	
		return new Game[2];	
	}
	
	
	
	public TournamentManager(PlayerManager[] playersManager) {
		super();
		this.playersManager = playersManager;
		currentTournament = new Tournament();
		prepareTournament();
	}
	
	@Override
	public void prepareTournament() {
		
	}
	
	public PlayerManager[] getPlayersManager() {
		return playersManager;
	}

	public void setPlayersManager(PlayerManager[] playersManager) {
		this.playersManager = playersManager;
	}


	@Override
	public void showWinners() {
		// TODO Auto-generated method stub
		
	}
	
	

}
