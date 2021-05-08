package ETicaretBackend.core;

import ETicaretBackend.business.abstracts.UserService;
import ETicaretBackend.entities.concretes.LoginDto;
import ETicaretBackend.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService{

	private UserService userService;
	
	public GoogleAuthManagerAdapter(UserService userService) {
		this.userService = userService;
	}
	
	
	@Override
	public void register(String email) {
		if(userExists(email) == false) {
			
			userService.add(email);;;
		}
		else {
			User user = userService.get(email);
			LoginDto loginDto = new LoginDto();
			loginDto.setEmail(user.getePosta());
			loginDto.setPassword(user.getPassword());
			login(loginDto);
			
		}
		
		
	}

	@Override
	public boolean userExists(String email) {
		if(userService.get(email) != null) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public void login(LoginDto loginDto) {
		if(loginDto != null && loginDto.getPassword().equals(loginDto.getPassword())) {
			System.out.println("Giris basarili.");				
		}
		else {
			System.out.println("Kullanıcı adı veya şifreniz yanlis.");
		}

		
	}
	

	
}
