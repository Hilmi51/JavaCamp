package Day4.Work;

public class EsporManager implements BaseEsporManager{
	private EdevletVerification eDevletVerification;
	
	 public EsporManager(EdevletVerification edevletVerification) {
		 this.eDevletVerification= edevletVerification;
	 }
	 
	 @Override
	 public void addEspor(Espor espor) {
		 if (eDevletVerification.verification2(espor)) {
			System.out.println("E-sporcu kaydedildi : " + espor.getEsporFirstName());
		}else {
			System.out.println("Kayıt yapılamadı, Geçersiz istek... ");
		}
	 }
	 
	 @Override
	 public void deleteEspor(Espor espor) {
		 System.out.println("E-sporcu silindi : " + espor.getEsporFirstName());
	 }
	 
	 @Override
	 public void updateEspor(Espor espor, int Esporİd, String EsporFirstName, String EsporLastName, String EsporNationalityIdemtity, String EsporDateOfBirth) {
		 espor.setEsporDateOfBirth(EsporDateOfBirth);
		 espor.setEsporFirstName(EsporFirstName);
		 espor.setEsporİd(Esporİd);
		 espor.setEsporLastName(EsporLastName);
		 espor.setEsporNationalityIdemtity(EsporNationalityIdemtity);
		 
		 System.out.println("E-sporcu güncellendi. Yeni bilgileriniz : " + espor.getEsporFirstName());
	  }
}
