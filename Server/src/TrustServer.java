import communication.ChatServer;

public class TrustServer {
	public static final int DEFAULT_PORT = 5892;

	public static void main(String[] args) {
		ChatServer server = new ChatServer(DEFAULT_PORT);
	}

}
