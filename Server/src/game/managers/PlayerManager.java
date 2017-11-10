package game.managers;

import communication.ChatServerThread;

public class PlayerManager {
	private ChatServerThread playerulSocket;

	public PlayerManager(ChatServerThread playerulSocket) {
		super();
		this.playerulSocket = playerulSocket;
	}

	public ChatServerThread getPlayerulSocket() {
		return playerulSocket;
	}

	public void setPlayerulSocket(ChatServerThread playerulSocket) {
		this.playerulSocket = playerulSocket;
	}
	
	
}
