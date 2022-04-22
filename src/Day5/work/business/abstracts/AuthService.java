package Day5.work.business.abstracts;

import Day5.work.entities.concretes.LoginDto;
import Day5.work.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);
}
