import communication.ChatClient;

public class TrustClient {
	public static final int DEFAULT_PORT = 5892;
	public static final String LOCALHOST = "localhost";
	public static final String TEST_EXTERNAL_IP = "192.168.2.100";
	
	public static void main(String[] args) {
		ChatClient client = new ChatClient(LOCALHOST, DEFAULT_PORT);
//		ChatClient client = new ChatClient(TEST_EXTERNAL_IP, DEFAULT_PORT);
	}

}
