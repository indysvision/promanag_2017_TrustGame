package game.pojo;

import communication.ChatServerThread;

public class Player {
	private String name;
	private int score;
	private ChatServerThread socketul;

	public Player(String name, ChatServerThread socketul) {
		super();
		this.name = name;
		this.score = 0;
		this.socketul = socketul;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
