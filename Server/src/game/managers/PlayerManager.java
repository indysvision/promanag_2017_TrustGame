package game.managers;

import communication.ChatServerThread;
import game.pojo.Player;

public class PlayerManager {
	private Player playerul;

	public PlayerManager(ChatServerThread playerulSocket) {
		super();
		this.playerul = new Player(playerulSocket.getClientName(), playerulSocket);
	}


	
}
