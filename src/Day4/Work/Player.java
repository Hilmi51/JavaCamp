package Day4.Work;

public class Player {
	
	private int id;
	private String playerFirstName;
	private String playerLastName;
	private String playerNationalityIdemtity;
	private String playerDateOfBirth;
	
	
	public Player(int id, String playerFirstName, String playerLastName, String playerNationalityIdemtity, String playerDateOfBirth) {
		this.id = id;
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.playerNationalityIdemtity = playerNationalityIdemtity;
		this.playerDateOfBirth = playerDateOfBirth;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public String getPlayerNationalityIdemtity() {
		return playerNationalityIdemtity;
	}

	public void setPlayerNationalityIdemtity(String playerNationalityIdemtity) {
		this.playerNationalityIdemtity = playerNationalityIdemtity;
	}

	public String getPlayerDateOfBirth() {
		return playerDateOfBirth;
	}

	public void setPlayerDateOfBirth(String playerDateOfBirth) {
		this.playerDateOfBirth = playerDateOfBirth;
	}

	
}
