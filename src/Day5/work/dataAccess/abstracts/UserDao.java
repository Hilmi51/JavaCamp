package Day5.work.dataAccess.abstracts;

import java.util.List;

import Day5.work.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(int userId);
	User get(String email);
	List<User> getAll();
}
