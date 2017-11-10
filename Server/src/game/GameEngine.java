package game;

import communication.ChatServerThread;
import game.managers.PlayerManager;
import game.managers.TournamentManager;

public class GameEngine {
	private TournamentManager tournamentManager;
	
	public void onPlayersReady(ChatServerThread [] players) {

		PlayerManager [] playerManagers =  new PlayerManager[4];
		for (int i = 0; i < 4; i++) {
			playerManagers[i] = new PlayerManager(players[i]);
		}
		tournamentManager = new TournamentManager(playerManagers);

	}

}
