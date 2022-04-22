package Day5.work;

import Day5.work.business.concretes.AuthManager;
import Day5.work.business.concretes.UserManager;
import Day5.work.core.GmailManagerAdapter;
import Day5.work.dataAccess.concretes.InMemoryUserDao;
import Day5.work.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		//UserManager userManager = new UserManager(new InMemoryUserDao(), new GmailManagerAdapter());
		User sadettin = new User(4,"Saadettin","Bircan","saadettin@gmail.com","963741",true);
		//userManager.add(sadettin);
		
		User burak = new User(2, "Mert", "Çakmak", "mertcakmak@gmail.com", "789456", false);
		//userManager.update(burak);
		
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		GmailManagerAdapter gmailManagerAdapter = new GmailManagerAdapter();
		
		AuthManager authManager = new AuthManager(new UserManager(inMemoryUserDao, gmailManagerAdapter));
		authManager.register(sadettin);
		UserManager userManager = new UserManager(inMemoryUserDao, gmailManagerAdapter);
		//userManager.add(sadettin);
		userManager.getAll();
		//userManager.getAll();

	}

}
