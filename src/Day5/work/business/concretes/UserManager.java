package Day5.work.business.concretes;

import java.util.List;

import Day5.work.business.abstracts.UserService;
import Day5.work.core.EmailService;
import Day5.work.dataAccess.abstracts.UserDao;
import Day5.work.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private EmailService emailService;
	public UserManager(UserDao dao, EmailService emailService) {
		super();
		this.userDao = dao;
		this.emailService = emailService;
	}
	@Override
	public void add(User user) {
		//if (userValidate(user)) {
			userDao.add(user);
			System.out.println("Log : " + user.getePosta());
			emailService.send(user.getePosta(),"Kayıt oldunuz. ");
		//}
		
	}
	@Override
	public void add(String email) {
		//if (!email.isEmpty()) {
			User user = new User();
			user.setePosta(email);
			userDao.add(user);
			System.out.println("Log2 : " + user.getePosta());
			emailService.send(email,"You have registered. ");
		//}
		
	}
	@Override
	public void update(User user) {
		if (userValidate(user)) {
			userDao.update(user);
		}
		
	}
	@Override
	public void delete(int userId) {
		userDao.delete(userId);
		
	}
	@Override
	public User get(String email) {
		return userDao.get(email);
	}
	
	@Override
	public List<User> getAll() {
		for(User user : userDao.getAll()) {
			System.out.println(user.getId() +" "+user.getePosta() +" "+ user.getFullName());
		}
		
		return userDao.getAll();
	}
	
	public boolean userValidate(User user) {
		if (user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;		
		}
		System.out.println("Your name and surname must be a minimum of 2 characters. ");
		return false;
	}

}
