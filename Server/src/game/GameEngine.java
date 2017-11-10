package game;

import communication.ChatServerThread;
import game.interfaces.TournamentInterface;
import game.managers.PlayerManager;
import game.managers.TournamentLastManStanding;
import game.managers.TournamentManager;

public class GameEngine {
	private TournamentInterface tournamentManager;
	
	public void onPlayersReady(ChatServerThread [] players) {

		PlayerManager [] playerManagers =  new PlayerManager[4];
		for (int i = 0; i < 4; i++) {
			playerManagers[i] = new PlayerManager(players[i]);
		}
		tournamentManager = new TournamentLastManStanding(playerManagers);

	}

}
