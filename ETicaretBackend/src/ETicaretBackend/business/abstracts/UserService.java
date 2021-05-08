package ETicaretBackend.business.abstracts;

import java.util.List;

import ETicaretBackend.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void add(String email);
	void update (User user);
	void delete(int id);
	User get(String email);
	List<User> getAll();
}
