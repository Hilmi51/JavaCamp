package Day4.Work;

public class EdevletVerification implements GovernmentVerification{
	
	@Override
	public boolean verification(Player player) {
		if (player.getPlayerNationalityIdemtity().length() == 11) {
			return true;
		}
		return false;
	}

	@Override
	public boolean verification2(Espor espor) {
		if (espor.getEsporNationalityIdemtity().length() == 11) {
			return true;
		}
		return false;
	}

}
