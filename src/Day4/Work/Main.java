package Day4.Work;

public class Main {

	public static void main(String[] args) {
		Player hilmi = new Player(51,"Hilmi","Şafak","-----------","--,--,----");
		Espor burak = new Espor(06, "Burak", "Şafak", "-----------", "--,--,----");
		Game csgo = new Game(34, "Cs:Go", 99.9);
		
		GameManager gameManager = new GameManager(csgo);
		gameManager.addGame(csgo, hilmi);
		gameManager.deleteGame(csgo, hilmi);
		
		PlayerManager playerManager = new PlayerManager(new EdevletVerification());
		playerManager.addPlayer(hilmi);
		playerManager.deletePlayer(hilmi);
		playerManager.updatePlayer(hilmi, 39, "Hilmi2", "Şafak2", "-----------", "--,--,----");;
		
		EsporManager esporManager = new EsporManager(new EdevletVerification());
		esporManager.addEspor(burak);
		esporManager.deleteEspor(burak);
		esporManager.updateEspor(burak, 18, "Burak2", "Şafak2", "-----------", "--,--,----");
		
		
		
		
	}

}
