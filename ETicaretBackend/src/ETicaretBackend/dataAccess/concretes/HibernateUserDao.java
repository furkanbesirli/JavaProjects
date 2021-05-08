package ETicaretBackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ETicaretBackend.dataAccess.abstracts.UserDao;
import ETicaretBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	public HibernateUserDao() {
	User user1 = new User(1, "Furkan", "Besirli", "frknnnbesirli@gmail.com", "frkn12", true);
	User user2 = new User(2, "Sena", "Kotankiran", "srskk12@gmail.com", "senos12", true);
	User user3 = new User(3, "Bade", "Yilmaz", "bade@gmail.com", "bade", true);

	users.add(user3);
	users.add(user2);
	users.add(user1);
	}
	
	
	
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanici eklendi "+ user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {

		System.out.println("Kullanici bilgileri guncellendi : "+user.getFirstName() + " "+ user.getLastName());
		
	}

	@Override
	public void delete(int userId) {
		System.out.println("Kullanici silindi : " + userId);
	}

	@Override
	public List<User> getAll() {
		return users;
	}


	@Override
	public User get(String email) {
		User users = null;
		System.out.println();
		
		return users;
	}


	

}
