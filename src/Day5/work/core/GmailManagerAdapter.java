package Day5.work.core;

import Day5.work.gmail.GmailManager;

public class GmailManagerAdapter implements EmailService{
	private GmailManager gmailManager;
	
	public GmailManagerAdapter() {
		gmailManager = new GmailManager();
	}

	@Override
	public void send(String email, String message) {
		gmailManager.send(email, message);
		
	}
	
}
