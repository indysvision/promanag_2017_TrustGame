import communication.ChatClient;

public class TrustClient {
	public static final int DEFAULT_PORT = 5892;
	public static final String LOCALHOST = "localhost";
	
	public static void main(String[] args) {
		ChatClient client = new ChatClient(LOCALHOST, DEFAULT_PORT);
	}

}
