package Day5.work.core;

import Day5.work.business.abstracts.UserService;
import Day5.work.entities.concretes.LoginDto;
import Day5.work.entities.concretes.User;

public class GmailAuthManagerAdapter implements ExternalAuthService{

	private UserService userService;
	
	public GmailAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@Override
	public void register(String email) {
		if (userExists(email) == false) {
			userService.add(email);
		}
		else {
			User user = userService.get(email);
			
			LoginDto dto = new LoginDto();
			dto.setEmail(user.getePosta());
			dto.setPassword(user.getPassword());
			
			login(dto, null);
		}
		
	}

	@Override
	public boolean userExists(String email) {
		
		if (userService.get(email) != null) {
			return true;
		}
		return false;
	}

	@Override
	public void login(LoginDto dto, User user) {
		if (dto != null&& dto.getPassword().equals(dto.getPassword())) {
			System.out.println("You have successfully logged in. Welcome... " + user.getFirstName());
		}
		else {
			System.out.println("Your username or password is incorrect. Try again... ");
		}
	}

}
