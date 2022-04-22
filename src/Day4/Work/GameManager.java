package Day4.Work;

public class GameManager implements BaseGameManager{
	private Game game;
	
	public GameManager(Game game) {
		this.game = game;
	}
	
	@Override
	public void addGame(Game game, Player player) {
		System.out.println(game.getGameName() +" "+ player.getPlayerFirstName()+"Tarafından alındı.");
	}
	
	@Override
	public void deleteGame(Game game, Player player) {
		System.out.println(game.getGameName() +" "+ player.getPlayerFirstName()+"Tarafından iade edildi.");
	}
	
	

}
