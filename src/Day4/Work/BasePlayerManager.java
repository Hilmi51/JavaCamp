package Day4.Work;

public interface BasePlayerManager {
	void addPlayer(Player player);
	void deletePlayer(Player player);
	void updatePlayer(Player player, int playerId, String playerFistName, String playerLastName, String playerNationalityIdemtity, String playerDateOfBirth);
}
