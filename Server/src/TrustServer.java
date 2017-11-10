import communication.ChatServer;
import game.GameEngine;

public class TrustServer {
	public static final int DEFAULT_PORT = 5892;

	public static void main(String[] args) {
		GameEngine gameEngine = new GameEngine();
		ChatServer server = new ChatServer(DEFAULT_PORT, gameEngine);
		
	}

}
