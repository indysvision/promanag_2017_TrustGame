package communication;

import java.net.*;
import java.util.Scanner;

import javax.print.DocFlavor.BYTE_ARRAY;

import java.io.*;

public class ChatClient implements Runnable {
	public static final String BYE_MESSAGE = ".bye";
	
	private Socket socket = null;
	private Thread thread = null;
	private DataInputStream console = null;
	private DataOutputStream streamOut = null;
	private ChatClientThread client = null;
	private String clientName;
	
	public ChatClient(String serverName, int serverPort) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's ur name?");
		clientName = sc.nextLine();
		
		System.out.println("Establishing connection. Please wait ...");
		try {
			socket = new Socket(serverName, serverPort);
			System.out.println("Connected: " + socket);
			start();
		} catch (UnknownHostException uhe) {
			System.out.println("Host unknown: " + uhe.getMessage());
		} catch (IOException ioe) {
			System.out.println("Unexpected exception: " + ioe.getMessage());
		}
	}

	public void run() {
		while (thread != null) {
			try {
				String userInput = console.readLine();
				
				streamOut.writeUTF( userInput.equals(BYE_MESSAGE) ?
						BYE_MESSAGE : clientName + ": " + userInput);

				streamOut.writeUTF( clientName + ": " + userInput);
				streamOut.flush();
			} catch (IOException ioe) {
				System.out.println("Sending error: " + ioe.getMessage());
				stop();
			}
		}
	}

	public void handle(String msg) {
		if (msg.equals(BYE_MESSAGE)) {
			System.out.println("Good bye. Press RETURN to exit ...");
			stop();
		} else
			System.out.println(msg);
	}

	public void start() throws IOException {
		console = new DataInputStream(System.in);
		streamOut = new DataOutputStream(socket.getOutputStream());
		if (thread == null) {
			client = new ChatClientThread(this, socket);
			thread = new Thread(this);
			thread.start();
		}
	}

	public void stop() {
		if (thread != null) {
			thread.stop();
			thread = null;
		}
		try {
			if (console != null)
				console.close();
			if (streamOut != null)
				streamOut.close();
			if (socket != null)
				socket.close();
		} catch (IOException ioe) {
			System.out.println("Error closing ...");
		}
		client.close();
		client.stop();
	}

}