package Day5.work.business.concretes;

import Day5.work.business.abstracts.AuthService;
import Day5.work.business.abstracts.UserService;
import Day5.work.core.utils.Utils;
import Day5.work.entities.concretes.LoginDto;
import Day5.work.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserService userService;
	
		public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	
	@Override
	public void register(User user) {
		if (userValidate(user)
						&& passwrodValidate(user.getPassword())
						&& userExists(user.getePosta()) == false
						&& Utils.emailValidate(user.getePosta()))
						
		{
			userService.add(user);
		}
		else {
			System.out.println("Failed to create record, try again.! ");
		}
		
	}

	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 15) {	
			User existUser = userService.get(user.getePosta());
			existUser.setVerify(true);
			
			userService.update(existUser);
			
			System.out.println("Email verified. ");
		}
		else {
			System.out.println("Email could not be verified, try again... ");
		}
		
	}

	@Override
	public boolean userExists(String email) {
		User user = userService.get(email);
		
		if (user == null) {
			return false;
		}
		else {
			System.out.println("Email already exists. Login with another email... ");
			return true;
		}

	}

	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.getEmail());
		
		if (user!= null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Successfully logged in. ");
		}
		else {
			System.out.println("Your username or password is incorrect. Please try again ... ");
		}
		
	}
	
	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getePosta().isEmpty() && !user.getPassword().isEmpty()) {
			return true;
		}
		
		System.out.println("Do not leave blank space. ");

		return false;
	}
	
	public boolean passwrodValidate(String password) {
		if (password.length()>= 6) {
			return true;	
		}
		
		System.out.println("Your password must have a minimum of 6 characters. ");
		
		return false;
	}
	
}
