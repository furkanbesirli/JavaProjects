package ETicaretBackend.business.abstracts;

import ETicaretBackend.entities.concretes.LoginDto;
import ETicaretBackend.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto loginDto);
	
}
