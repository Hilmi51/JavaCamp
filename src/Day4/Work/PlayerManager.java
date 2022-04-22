package Day4.Work;

public class PlayerManager implements BasePlayerManager{
	
	private EdevletVerification eDevletVerification;
	
	 public PlayerManager(EdevletVerification edevletVerification) {
		 this.eDevletVerification= edevletVerification;
	 }
	 
	 @Override
	 public void addPlayer(Player player) {
		 if (eDevletVerification.verification(player)) {
			System.out.println("Oyuncu kaydedildi : " + player.getPlayerFirstName());
		}else {
			System.out.println("Kayıt yapılamadı, Geçersiz istek... ");
		}
	 }
	 
	 @Override
	 public void deletePlayer(Player player) {
		 System.out.println("Oyuncu silindi : " + player.getPlayerFirstName());
	 }
	 
	 @Override
	 public void updatePlayer(Player player, int playerId, String playerFistName, String playerLastName, String playerNationalityIdemtity, String playerDateOfBirth) {
		 player.setId(playerId);
		 player.setPlayerDateOfBirth(playerDateOfBirth);
		 player.setPlayerFirstName(playerFistName);
		 player.setPlayerLastName(playerLastName);
		 player.setPlayerNationalityIdemtity(playerNationalityIdemtity);
		 
		 System.out.println("Oyuncu güncellendi. Yeni bilgileriniz : " + player.getPlayerFirstName());
	  }

}
