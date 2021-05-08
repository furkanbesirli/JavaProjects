package ETicaretBackend.business.concretes;

import ETicaretBackend.business.abstracts.AuthService;
import ETicaretBackend.business.abstracts.UserService;
import ETicaretBackend.core.utils.Utils;
import ETicaretBackend.entities.concretes.LoginDto;
import ETicaretBackend.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserService userService;

	
	
    public AuthManager(UserService userService) {
        super();
        this.userService = userService;
    }
	
	@Override
	public void register(User user) {	
		if(userValidate(user) 
				&& passwordValidate(user.getPassword()) 
				&& userExists(user.getePosta()) == false 
				&& Utils.emailValidate(user.getePosta())) { 

			userService.add(user);
		}
		else {
			System.out.println("Kayit basarisiz oldu.");
		}
		
	}

	@Override
	public void verify(User user, String token) {
		if(user != null && token.length() > 15) {
			User existUser = userService.get(user.getePosta());
			existUser.setVerify(true);
			
			userService.update(existUser);
			System.err.println("Email dogrulandi.");
		}
		else {
			System.out.println("Email dogrulanamadi");
		}
		
		
		
	}
	
	@Override
	public void login(LoginDto loginDto) {
		User user = userService.get(loginDto.getEmail());
		if(user != null && user.getPassword().equals(loginDto.getPassword())) {
			System.err.println("Basariyla giris yaptiniz.");
		}else {
		System.err.println("Eposta veya sifreniz yanlis!");
		}
	}


	@Override
	public boolean userExists(String email) {
		User user = userService.get(email);
		if(user == null) {
			return false;
		}
		
		System.out.println("Email daha once kullanilmis.");
		return true;
	}
	public boolean userValidate(User user) {
		if(user != null
				&& !user.getFirstName().isEmpty() 
				&& !user.getLastName().isEmpty() 
				&& !user.getePosta().isEmpty()
				&& !user.getPassword().isEmpty()) {
			
			return true;		
		}
		else {
			System.out.println("Doldurulmasi gereken yerleri gozden geciriniz.");
		return false;
		}
	}
	
	public boolean passwordValidate(String password) {
		if(password.length() >= 6) {
			return true;
		}else {
			System.out.println("Sifreniz 6 karakterden uzun olmali.");
			return false;
		}
	}


}
