package Day5.work.core;

import Day5.work.entities.concretes.LoginDto;
import Day5.work.entities.concretes.User;

public interface ExternalAuthService {
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto, User user);
}
